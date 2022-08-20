package eyemed.group.service;

import eyemed.group.model.dto.applications.ClientApplicationRecipientDto;
import eyemed.group.model.dto.events.EventAddressDto;
import eyemed.group.model.dto.events.EventDto;
import eyemed.group.model.dto.users.SupportContactsDto;
import eyemed.group.model.dto.users.UserCommunicationDto;
import eyemed.group.model.dto.users.UserDto;

import java.sql.Timestamp;
import java.util.Map;
import java.util.Set;

/*
 * @author Vijayakumar Ramaswamy
 * @since 10/26/2018
 */

public interface EmailService {
    boolean sendRegistrationEmail(UserDto user) throws Exception;
    boolean sendProfileUpdateEmail(String userId, String accMgrsEmails) throws Exception;
    boolean sendUserIdsRecoveryEmail(String userIds,String emailAddress) throws Exception;
    boolean sendPasswordResetRequestEmail(UserDto user ,String tokenNumber,  Timestamp tokenExpiredTime) throws Exception;
    boolean sendTokenRequestEmail(String userName, String email ,String tokenNumber, Timestamp tokenExpiredTime) throws Exception;
    boolean sendClientPaymentDBFailureEmail(Set<Map<String,String>> paymentInfo) throws Exception;
    boolean sendOneTimePaymentDBFailureEmail(String referenceNumber, String userName,String email) throws Exception;
    boolean sendNewDeviceEmail(String email, String userName) throws Exception;
    boolean sendEventConfirmationEmail(UserDto user, EventDto event, EventAddressDto location) throws Exception;
    boolean sendClientApplicationLinkEmail(ClientApplicationRecipientDto recipientDto, int groupApplicationId, String companyName, String replyTo) throws Exception;
    boolean sendSupportContactUsOutboundEmail(String toEmail, SupportContactsDto supportContacsDto)throws Exception;
    boolean sendCommunicationOutboundEmail(String toEmail, UserCommunicationDto userCommunicationDto)throws Exception;
}
