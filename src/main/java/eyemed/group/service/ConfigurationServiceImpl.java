package eyemed.group.service;

import eyemed.group.dao.ConfigurationDao;
import eyemed.group.dao.PaymentDao;
import eyemed.group.model.dto.invoice.PaymentTransactionDto;
import eyemed.group.model.dto.users.UserRoleDto;
import eyemed.group.security.SecurityHelper;
import eyemed.group.util.Constants;
import eyemed.utils.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * @author Vijayakumar Ramaswamy
 * @since 11/8/2018
 */

@Repository
public class ConfigurationServiceImpl implements ConfigurationService {
    private static final Log LOGGER = LogFactory.getLog(ConfigurationServiceImpl.class);
    private static final String cyberSource_hmacSHA256 = "hmac_sha256";
    private static final String cyberSource_secret_key = "secret_key";

    private ConfigurationDao configurationDao;
    private PaymentDao paymentDao;

    public ConfigurationServiceImpl(ConfigurationDao configurationDao, PaymentDao paymentDao) {
        this.configurationDao = configurationDao;
        this.paymentDao = paymentDao;
    }

    //This is to get configurations details
    @Override
    public HashMap<String,String> getConfigurationDetails(String category, String key) throws Exception {
        category = StringUtils.safeTrim(category);
        key = StringUtils.safeTrim(key);
        
        if(Constants.CYBERSOURCE_AVAILABILITY_CATEGORY.equalsIgnoreCase(category)){
            return checkCyberSourceAvailability(category,key);
        }else if(category.contains(Constants.CYBERSOURCE_CONFIGURATION_CATEGORY)){
            if(!SecurityHelper.internalUserValidationByAccess(Constants.VIEW_INVOICES_ACCESS_KEY)){
                HashMap<String,String> retMap =  new HashMap<>();
                retMap.put(Constants.CLIENT_ACCESS_DENIED, Constants.CLIENT_ACCESS_DENIED);
                return retMap;
            }
            String subGroupCk = null;
            if (category.contains(Constants.CYBERSOURCE_CONFIG_TOKEN_CATEGORY) && !StringUtils.isBlank(key)){
                String arrCk[]  = key.split("\\|");
                subGroupCk = arrCk[1];
            }else if (category.contains(Constants.CYBERSOURCE_CONFIG_ONETIME_CATEGORY) && !StringUtils.isBlank(key)){
                PaymentTransactionDto paymentTransactionDto = paymentDao.getDraftPayment(key);
                if(paymentTransactionDto != null && paymentTransactionDto.getPayment()!= null
                        && paymentTransactionDto.getPayment().stream().findFirst().isPresent()){
                    subGroupCk = paymentTransactionDto.getPayment().stream().findFirst().get().getSubGroupCk();
                } else {
                    return null;
                }
            }
            if(!StringUtils.isBlank(subGroupCk) && !SecurityHelper.userSubGroupValidationByAccess(subGroupCk,Constants.VIEW_INVOICES_ACCESS_KEY)){
                HashMap<String,String> retMap =  new HashMap<>();
                retMap.put(Constants.CLIENT_ACCESS_DENIED, Constants.CLIENT_ACCESS_DENIED);
                return retMap;
            }

            return getCyberSourceConfiguration(category,key,false);
        }else if (category.contains(Constants.PAYMENT_HISTORY_GRP)){
            if(!SecurityHelper.internalUserValidationByAccess(Constants.VIEW_INVOICES_ACCESS_KEY)){
                HashMap<String,String> retMap =  new HashMap<>();
                retMap.put(Constants.CLIENT_ACCESS_DENIED, Constants.CLIENT_ACCESS_DENIED);
                return retMap;
            }
            HashMap<String,String> resultMap = configurationDao.getMiscDetails(category,key);
            if(resultMap !=null && resultMap.size()>0
                    && SecurityHelper.getUserRoleDto().getUserType().name().equals(UserRoleDto.UserType.External.name())){
                HashMap<String,String> filteredMap = new HashMap<>();
                        resultMap.entrySet().stream()
                        .filter(mapEntry -> (SecurityHelper.getUserRoleDto().getSubGroupAccess().stream()
                                .anyMatch(newGrpAcc -> newGrpAcc.getAccess().isViewInvoicesAllowed()
                                        && String.valueOf(newGrpAcc.getSubGroupCk()).equals(mapEntry.getValue()))))
                        .forEach(entry -> filteredMap.put(entry.getKey(), entry.getValue()));
                if(filteredMap.size() <=0){
                    filteredMap.put(Constants.CLIENT_ACCESS_DENIED, Constants.CLIENT_ACCESS_DENIED);
                }
                return filteredMap;
            }
            return resultMap;
        }else {
            return configurationDao.getMiscDetails(category,key);
        }
    }

    private HashMap<String,String> checkCyberSourceAvailability(String category, String key) throws Exception{
        HashMap<String, String> response =  new HashMap<String, String>();
        String inputCategory = StringUtils.isBlank(key) ? Constants.CYBERSOURCE_CONFIG_TOKEN_CATEGORY :key;
        HashMap<String, String> miscConfig = configurationDao.getMiscDetails(inputCategory,"url");
        if(miscConfig != null && miscConfig.size() >0){
            String url = miscConfig.get("url");
            response.put("status","CyberSource is  unavailable");
            try{
                final URLConnection connection = new URL(url).openConnection();
                connection.connect();
                response.clear();
                response.put("status","Cybersource is available");
            } catch(final MalformedURLException e){
                LOGGER.error("Bad URL: " + url, e);
            } catch(final IOException e){
                LOGGER.error("Cybsersource Service " + url + " unavailable: ", e.fillInStackTrace());
            }
        }
        return response;
    }

    //This can be used from any class if need to get all the configured elements
    public HashMap<String,String> getCyberSourceConfiguration(String category, String key, boolean isAllConfiguredNeed) throws Exception{
        HashMap<String, String> response = new HashMap<>();
        HashMap<String, String> commonConfig = null;
        HashMap<String, String> typeConfig = null;
        HashMap<String, String> lobConfig = null;
        String typeCategory = null;

        //Get Common configuration details.
        commonConfig = configurationDao.getMiscDetails(Constants.CYBERSOURCE_CONFIGURATION_CATEGORY,null);
        if(commonConfig != null && commonConfig.size() >0){
            if(category.contains(Constants.CYBERSOURCE_CONFIG_TOKEN_CATEGORY)){
                typeCategory =  Constants.CYBERSOURCE_CONFIG_TOKEN_CATEGORY;
            }else if(category.contains(Constants.CYBERSOURCE_CONFIG_ONETIME_CATEGORY)){
                typeCategory =  Constants.CYBERSOURCE_CONFIG_ONETIME_CATEGORY;
            }
            if( typeCategory != null){
                typeConfig = configurationDao.getMiscDetails(typeCategory,null);
            }
            if( category.contains(Constants.CYBERSOURCE_CONFIG_TOKEN_CATEGORY +"_") ||
                    category.contains(Constants.CYBERSOURCE_CONFIG_ONETIME_CATEGORY +"_")){
                lobConfig = configurationDao.getMiscDetails(category,null);
            }
            //add all the required elements into response
            response.putAll(commonConfig);
            if(typeConfig != null){
                response.putAll(typeConfig);
            }
            if(lobConfig != null){
                response.putAll(lobConfig);
            }
            response.put("transaction_uuid",UUID.randomUUID().toString());
            response.put("signed_date_time",getUTCDateTime());
            response.put("reference_number",key);
            if(category.contains(Constants.CYBERSOURCE_CONFIG_ONETIME_CATEGORY) && !StringUtils.isBlank(key)){
                PaymentTransactionDto paymentTransactionDto = paymentDao.getDraftPayment(key);
                double amount = 0.00;
                if(paymentTransactionDto != null && !StringUtils.isBlank(paymentTransactionDto.getTotalAmount())){
                    amount = Double.valueOf(paymentTransactionDto.getTotalAmount());
                }
                response.put("amount",String.format("%.2f", amount));
            }
            if(response.containsKey(cyberSource_secret_key) && response.containsKey(cyberSource_hmacSHA256)){
                response.put("signature",sign(response)); //add signature
            }

            //remove the keys that don't want to send as part of response to the UI
            if(!isAllConfiguredNeed){
                response.remove(cyberSource_secret_key);
                response.remove(cyberSource_hmacSHA256);
                response.remove("merchant_id");
                response.remove("merchant_ref");
                response.remove("merchant_password");
            }
        }
        return response;
    }

    private String sign(HashMap<String,String> params) throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(params.get(cyberSource_secret_key).getBytes(),params.get(cyberSource_hmacSHA256));
        Mac mac = Mac.getInstance(params.get(cyberSource_hmacSHA256));
        mac.init(secretKeySpec);
        String dataToSign = buildDataToSign(params);
        byte[] rawHmac = mac.doFinal(dataToSign.getBytes("UTF-8"));
        return DatatypeConverter.printBase64Binary(rawHmac).replace("\n", "");
    }

    private String buildDataToSign(HashMap params) {
        String[] signedFieldNames = String.valueOf(params.get("signed_field_names")).split(",");
        ArrayList<String> dataToSign = new ArrayList<String>();
        for (String signedFieldName : signedFieldNames) {
            dataToSign.add(signedFieldName + "=" + String.valueOf(params.get(signedFieldName)));
        }
        return commaSeparate(dataToSign);
    }

    private String commaSeparate(ArrayList<String> dataToSign) {
        StringBuilder csv = new StringBuilder();
        for (Iterator<String> it = dataToSign.iterator(); it.hasNext(); ) {
            csv.append(it.next());
            if (it.hasNext()) {
                csv.append(",");
            }
        }
        return csv.toString();
    }

    private String getUTCDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(new Date());
    }
}
