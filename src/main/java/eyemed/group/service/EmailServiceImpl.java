package eyemed.group.service;

import eyemed.group.model.dto.applications.ClientApplicationRecipientDto;
import eyemed.group.model.dto.events.EventAddressDto;
import eyemed.group.model.dto.events.EventDto;
import eyemed.group.model.dto.users.SupportContactsDto;
import eyemed.group.model.dto.users.UserCommunicationDto;
import eyemed.group.model.dto.users.UserDto;
import eyemed.group.util.Constants;
import eyemed.group.util.DBUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.StringWriter;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * @author Vijayakumar Ramaswamy
 * @since 10/26/2018
 */

@Repository
public class EmailServiceImpl implements EmailService {
    private static final Log LOGGER = LogFactory.getLog(EmailServiceImpl.class);
    private static final String UTF = "UTF-8";
    private RestTemplate restTemplate;
    private Environment environment;
    private VelocityEngine velocityEngine;
    private String serviceHost;
    private String apacheEyeManageHost;
    private String contentHost;

    public EmailServiceImpl(
            RestTemplate restTemplate,
            Environment environment,
            @Value("#{etJbossServiceHost}") String serviceHost,
            @Value("#{apacheEyeManageHost}")String apacheEyeManageHost,
            @Value("#{apacheHost}")String contentHost) {
        this.restTemplate = restTemplate;
        this.environment = environment;
        this.serviceHost = serviceHost;
        this.apacheEyeManageHost = apacheEyeManageHost;
        this.contentHost = contentHost;
        this.velocityEngine = getVelocityEngine();
    }


    @Override
    public boolean sendRegistrationEmail(UserDto user) throws Exception {
        boolean result = false;
        try {
            String registrationUrl = Constants.getHostUrl(apacheEyeManageHost + environment.getProperty("email.registration.url"));
            String fragmentUrl = environment.getProperty("registration.email.fragment");

             UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromUriString("")
                     .queryParam("userId",user.getUserId().toUpperCase())
                    .queryParam("token",user.getRegistrationToken())
                    .queryParam("tokenType",Constants.REGISTRATION_TOKEN_TYPE);

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("name", user.getFirstName()+" " + user.getLastName());
            velocityContext.put("userId", user.getUserId().toUpperCase());
            velocityContext.put("registrationUrl",registrationUrl + urlBuilder.toUriString());
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result =  sendMail(environment.getProperty("email.from.registration"),
                    user.getEmail(),
                    environment.getProperty("email.subject.registration"),
                    mailContent.toString());

        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendRegistrationEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }

    @Override
    public boolean sendProfileUpdateEmail(String userId, String accMgrsEmails) throws Exception {
        boolean result = false;
        try {
            String fragmentUrl = environment.getProperty("profile.update.email.fragment");

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("userId", userId.toUpperCase());
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result =  sendMail(environment.getProperty("email.from.profile.update"),
                    accMgrsEmails,
                    environment.getProperty("email.subject.profile.update"),
                    mailContent.toString());

        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendProfileUpdateEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * This method send email with comma separated user ids.
     * @param userIds
     * @param toEmailAddress
     * @@throws  exception
     * */
    @Override
    public boolean sendUserIdsRecoveryEmail(String userIds,String toEmailAddress) throws Exception{
        boolean result = false;
        try {
            String fragmentUrl = environment.getProperty("user.recover.email.fragment");

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("userId", userIds.replace(",","</BR>"));
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result =  sendMail(environment.getProperty("email.from.admin"), toEmailAddress,
                    environment.getProperty("email.subject.userid.recovery"),
                    mailContent.toString());
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendProfileUpdateEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * This method send email with comma separated user ids.
     * @param user
     * @param tokenNumber
     * @param tokenExpiredTime
     * @@throws  exception
     * */
    @Override
    public boolean sendPasswordResetRequestEmail(UserDto user ,String tokenNumber, Timestamp tokenExpiredTime) throws Exception{
        boolean result = false;
        try {
            String passwordUrl = Constants.getHostUrl(apacheEyeManageHost + environment.getProperty("email.reset.password.url"));
            String fragmentUrl = environment.getProperty("reset.password.email.fragment");

            UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromUriString("")
                    .queryParam("userId",user.getUserId().toUpperCase())
                    .queryParam("token",tokenNumber);
            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("name", user.getFirstName() +" " + user.getLastName());
            velocityContext.put("passwordResetUrl",passwordUrl + urlBuilder.toUriString());
            velocityContext.put("datetime",DBUtils.toDateTime(tokenExpiredTime).toString(Constants.dtFmtr_yyyyMMddHHmmss));
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result = sendMail(environment.getProperty("email.from.admin"),
                    user.getEmail(),
                    environment.getProperty("email.subject.password.reset"),
                    mailContent.toString());
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendPasswordResetRequestEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }

    /**
     * This method send token number in email.
     * @param userName
     * @param toEmail
     * @param tokenNumber
     * */
    public boolean sendTokenRequestEmail(String userName, String toEmail ,String tokenNumber, Timestamp tokenExpiredTime) throws Exception{
        boolean result = false;
        try {
            String fragmentUrl = environment.getProperty("token.verification.email.fragment");

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("name", userName);
            velocityContext.put("token", tokenNumber);
            velocityContext.put("tokenExpire", tokenExpiredTime);
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result =  sendMail(environment.getProperty("email.from.admin"), toEmail,
                    environment.getProperty("email.subject.verification.code"),
                    mailContent.toString());
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendTokenRequestEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }

    @Override
    public boolean sendClientPaymentDBFailureEmail(Set<Map<String, String>> paymentInfo) throws Exception {
        boolean result = false;
        try {
            String fragmentUrl = environment.getProperty("payment.failure.email.fragment");
            Map<String,String> emailMap = paymentInfo.stream().findFirst().get();

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("name", emailMap.get("userName"));
            velocityContext.put("processedInvoice", emailMap.get("processedInvoice"));
            velocityContext.put("notProcessedInvoice", emailMap.get("notProcessedInvoice"));
            velocityContext.put("amount", emailMap.get("totalAmount"));
            velocityContext.put("paymentId", emailMap.get("paymentId"));
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result =  sendMail(environment.getProperty("email.from.admin"),
                    emailMap.get("toEmail"),
                    environment.getProperty("email.subject.payment.transaction.failure"),
                    mailContent.toString());
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendClientPaymentDBFailureEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }

    @Override
    public boolean sendOneTimePaymentDBFailureEmail(String referenceNumber, String userName, String toEmail) throws Exception {
        boolean result = false;
        try {
            String fragmentUrl = environment.getProperty("onetime.payment.db.failure.email.fragment");

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("referenceNumber", referenceNumber);
            velocityContext.put("name", userName);
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result =  sendMail(environment.getProperty("email.from.admin"), toEmail,
                    environment.getProperty("email.subject.payment.method.transaction.failure"),
                    mailContent.toString());
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendOneTimePaymentDBFailureEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }
    /**
     * This method send email for new device.
     * @param userName
     * @param toEmailAddress
     * */
    @Override
    public boolean sendNewDeviceEmail(String toEmailAddress,String userName) throws Exception{
        boolean result = false;
        try {
            String fragmentUrl = environment.getProperty("login.new.device.email.fragment");

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("name", userName);
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            result =  sendMail(environment.getProperty("email.from.admin"),
                    toEmailAddress,
                    environment.getProperty("email.subject.new.device"),
                    mailContent.toString());
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendNewDeviceEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }

    @Override
    public boolean sendEventConfirmationEmail(UserDto user, EventDto event, EventAddressDto location) throws Exception {
        try {
            String fragmentUrl = environment.getProperty("fragment.email.event.confirmation");

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost));
            velocityContext.put("eventId", event.getEventRequestId());
            velocityContext.put("name", StringUtils.trim(user.getFirstName() + " " + user.getLastName()));
            if(event.getEventStartDate() != null) {
                velocityContext.put("eventDate", event.getEventStartDate().toLocalDate().toString());
            } else {
                velocityContext.put("eventDate", event.getShipDeliverDate().toLocalDate().toString());
            }

            String eventType = "Digital";
            if(event.getRequestMaterialsInd().equalsIgnoreCase("Y"))
                eventType = "Materials";
            if(event.getRequestStandardInd().equalsIgnoreCase("Y"))
                eventType = "Staffed";

            velocityContext.put("requestType", eventType);

            velocityContext.put("contactName", event.getContactName());
            velocityContext.put("contactEmail", event.getContactEmail());

            velocityContext.put("addressLine1", location.getAddressLine1());
            velocityContext.put("addressLine2", "" + location.getAddressLine2());
            velocityContext.put("city", location.getCity());
            velocityContext.put("state", location.getStateCode());
            velocityContext.put("postalCode", location.getPostalCode());

            velocityContext.put("shipAddressLine1", event.getShipAddress().getAddressLine1());
            velocityContext.put("shipAddressLine2", "" + event.getShipAddress().getAddressLine2());
            velocityContext.put("shipCity", event.getShipAddress().getCity());
            velocityContext.put("shipState", event.getShipAddress().getStateCode());
            velocityContext.put("shipPostalCode", event.getShipAddress().getPostalCode());

            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            boolean result = sendMail(environment.getProperty("email.from.admin"),
                    user.getEmail(),
                    environment.getProperty("email.subject.event.confirmation"),
                    mailContent.toString());

            return result;
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendNewDeviceEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
    }

    @Override
    public boolean sendClientApplicationLinkEmail(ClientApplicationRecipientDto recipientDto, int groupApplicationId, String companyName, String replyTo) throws Exception {
        try {
            String fragmentUrl = environment.getProperty("fragment.email.application.link");

            VelocityContext velocityContext = new VelocityContext();
            velocityContext.put("url",Constants.getHostUrl(apacheEyeManageHost) +
                    String.format(environment.getProperty("email.application.url"),
                            groupApplicationId,
                            recipientDto.getRecipientUuid()));
            velocityContext.put("name", recipientDto.getName());

            StringWriter mailContent = new StringWriter();
            velocityEngine.mergeTemplate(fragmentUrl, UTF, velocityContext, mailContent);

            String subject = environment.getProperty("email.application.subject");
            if(StringUtils.isNotBlank(companyName)) subject += " - " + companyName;

            String fromEmail = environment.getProperty("email.from.admin");
            if("broker".equalsIgnoreCase(environment.getProperty("email.from.application"))) {
                fromEmail = replyTo;
            }

            boolean result = sendMail(fromEmail,
                    recipientDto.getEmail(),
                    subject,
                    mailContent.toString(),
                    replyTo);

            return result;
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error sendClientApplicationLinkEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
    }

    private String getNotificationServiceHost() {
        return serviceHost + environment.getProperty("host.notification.service.uri");
    }

    private boolean sendMail(String fromEmailAddress, String toEmailAddress, String subject, String mailContent){
        return sendMail(fromEmailAddress, toEmailAddress, subject, mailContent, null);
    }

    private boolean sendMail(String fromEmailAddress, String toEmailAddress, String subject, String mailContent, String replyEmailAddress){
        HashMap<String,String> notificationInput = new HashMap<>();
        notificationInput.put("fromEmailAddress",fromEmailAddress);
        notificationInput.put("toEmailAddress",toEmailAddress);
        notificationInput.put("replyTo", replyEmailAddress);
        notificationInput.put("subject",subject);
        notificationInput.put("emailContent",mailContent);
        notificationInput.put("secureEmail","false");

        // Comment JBOSS 7.2 Migration.
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<HashMap<String,String>> request = new HttpEntity<>(notificationInput, headers);

        String url = getNotificationServiceHost();
        ResponseEntity<String> emailResponse = restTemplate.exchange(url,
                HttpMethod.POST, request, String.class);
        return HttpStatus.OK.equals(emailResponse.getStatusCode());
    }

    private VelocityEngine getVelocityEngine() {
        Properties properties = new Properties();
        properties.setProperty("resource.loader", "url");
        properties.setProperty("url.resource.loader.description", "Velocity Url Resource Loader");
        properties.setProperty("url.resource.loader.root", Constants.getHostUrl(contentHost + environment.getProperty("fragment.content.path")));
        properties.setProperty("url.resource.loader.cache", "false");
        properties.setProperty("url.resource.loader.class", "org.apache.velocity.runtime.resource.loader.URLResourceLoader");
        return  new VelocityEngine(properties);
    }

    /**This method send email by using notification service.* */
    private boolean sendMailAttachements(String fromEmailAddress, String toEmailAddress, String subject, String mailContent, HashMap<String, Object> attachments){
        HashMap<String,Object> notificationInput = new HashMap<>();
        notificationInput.put("fromEmailAddress",fromEmailAddress);
        notificationInput.put("toEmailAddress",toEmailAddress);
        notificationInput.put("subject", StringUtils.isEmpty(subject)? "EyeMed Member Portal" : subject);
        notificationInput.put("emailContent",mailContent);
        notificationInput.put("attachments",attachments);
        notificationInput.put("secureEmail","false");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<HashMap<String,Object>> request = new HttpEntity<>(notificationInput, headers);
        ResponseEntity<String> emailResponse = restTemplate.exchange(getNotificationServiceHost(), HttpMethod.POST, request, String.class);
        return HttpStatus.OK.equals(emailResponse.getStatusCode());
    }

    @Override
    public boolean sendSupportContactUsOutboundEmail(String toEmail, SupportContactsDto model) throws Exception {
        boolean result = false;
        try {

            StringBuilder htmlTextBuilder = new StringBuilder();

            htmlTextBuilder.append( "<head><style type=\"text/css\">.label{font-weight: bold;} #contact-us-email{width: 100%;}</style></head>");
            htmlTextBuilder.append( "<p><div id=\"contact-us-email\">");
            htmlTextBuilder.append( "<table>");
            htmlTextBuilder.append( "<tr><td class=\"label\"> First Name:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getFirstName()).append("</td></tr>");
            htmlTextBuilder.append( "<tr><td text-align: center; class=\"label\"> Last Name:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getLastName()).append( "</td></tr>");

            htmlTextBuilder.append( "<tr><td class=\"label\">EMail:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getEmail()).append( "</td></tr>");

            htmlTextBuilder.append( "</td></tr>");
            htmlTextBuilder.append( "<tr><td class=\"label\">Category:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getCategory() );
            htmlTextBuilder.append( "</td></tr>");
            htmlTextBuilder.append( "</td></tr>");
            htmlTextBuilder.append( "<tr><td class=\"label\">Group Id:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getGroupId()).append( "</td></tr>");

            htmlTextBuilder.append( "<tr><td class=\"label\">Subject:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getSubject()).append( "</td></tr>");

            htmlTextBuilder.append("</table></div></p>");


            result =  sendMailAttachements(model.getEmail(), toEmail, model.getSubject(), htmlTextBuilder.toString(), model.getAttachments());

        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error in sendContactUsOutboundEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }


    @Override
    public boolean sendCommunicationOutboundEmail(String toEmail, UserCommunicationDto model)throws Exception {
        boolean result = false;
        try {

            StringBuilder htmlTextBuilder = new StringBuilder();

            htmlTextBuilder.append( "<head><style type=\"text/css\">.label{font-weight: bold;} #contact-us-email{width: 100%;}</style></head>");
            htmlTextBuilder.append( "<p><div id=\"contact-us-email\">");
            htmlTextBuilder.append( "<table>");
            htmlTextBuilder.append( "<tr><td class=\"label\"> First Name:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getFirstName()).append("</td></tr>");
            htmlTextBuilder.append( "<tr><td text-align: center; class=\"label\"> Last Name:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getLastName()).append( "</td></tr>");

            htmlTextBuilder.append( "<tr><td class=\"label\">EMail:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getEmail()).append( "</td></tr>");

            htmlTextBuilder.append( "</td></tr>");
            htmlTextBuilder.append( "<tr><td class=\"label\">Category:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getCategory() );
            htmlTextBuilder.append( "</td></tr>");
            htmlTextBuilder.append( "</td></tr>");
            htmlTextBuilder.append( "<tr><td class=\"label\">Group Id:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getGroupCk()).append( "</td></tr>");

            htmlTextBuilder.append( "<tr><td class=\"label\">Subject:</td>&nbsp;<td>");
            htmlTextBuilder.append( model.getSubject()).append( "</td></tr>");

            htmlTextBuilder.append("</table></div></p>");


            result =  sendMailAttachements(model.getEmail(), toEmail, model.getSubject(), htmlTextBuilder.toString(), model.getAttachments());

        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("Error in sendContactUsOutboundEmail.", e);
            }
            throw new Exception(e.getMessage(), e.getCause());
        }
        return result;
    }
}
