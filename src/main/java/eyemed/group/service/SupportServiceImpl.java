package eyemed.group.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import eyemed.group.dao.ConfigurationDao;
import eyemed.group.model.dto.users.SupportContactsDto;
import eyemed.group.util.Constants;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;




@Repository
public class SupportServiceImpl implements SupportService {
	
	
	private EmailService emailService;
    private ConfigurationDao configurationDao;
    
    public SupportServiceImpl( ConfigurationDao configurationDao,EmailService emailService) {
		this.configurationDao = configurationDao;
		this.emailService = emailService;
	}
    
    @Override
	public HashMap<String, String> contactUs(SupportContactsDto supportContacsDto, List<MultipartFile> attachments, String lang) throws Exception{
        HashMap<String,String> resultMap = new HashMap<>();
        HashMap<String,Object> attachedFiles = new HashMap<>();
        HashMap<String,String> configFileTypeMap = configurationDao.getMiscDetails(Constants.FILE_TYPES_CATEGORY, Constants.CONTACTS_FILE_TYPE_KEY);
        if(configFileTypeMap.size()>0){
            List<String> fileTypeList = Arrays.asList(configFileTypeMap.get(Constants.CONTACTS_FILE_TYPE_KEY).split(";"));
            if(attachments != null && attachments.size() >0){
                for (MultipartFile attachFile : attachments) {
                    if(!StringUtils.isEmpty(attachFile.getOriginalFilename()) &&
                            !fileTypeList.contains(FilenameUtils.getExtension(attachFile.getOriginalFilename().toUpperCase()))){
                        resultMap.put(Constants.CONT_INVALID_REQUEST_CODE, Constants.CONT_INVALID_REQUEST_CODE);
                        return resultMap;
                    }
                    attachedFiles.put(attachFile.getOriginalFilename(), attachFile.getBytes());
                }
            }
        }

        HashMap<String,String> configMap = configurationDao.getMiscDetails(Constants.EMAIL_CATEGORY, null);
        if(configMap.size() >0) {
            String toEmail = configMap.get(Constants.CONTACT_US_MEMBER_TO_EMAIL_KEY);
          /*  if(supportContacsDto.getProviderId()!=null) {
                toEmail = configMap.get(Constants.CONTACT_US_PROVIDER_TO_EMAIL_KEY);
            }*/
            toEmail ="Harambakam@eyemed.com";
            if(!StringUtils.isEmpty(toEmail)){
            	supportContacsDto.setAttachments(attachedFiles);            
                emailService.sendSupportContactUsOutboundEmail(toEmail, supportContacsDto);            
                resultMap.put(Constants.CONT_REQUEST_ACCEPTED_CODE, Constants.CONT_REQUEST_ACCEPTED_CODE);
            }
        }
        return resultMap;
    }
}
