package eyemed.group.model.validation;

import eyemed.group.model.dto.groups.ClassPlanDto;
import eyemed.group.model.dto.groups.SubGroupDto;
import eyemed.group.model.dto.members.AddressDto;
import eyemed.group.model.dto.members.PrivacyDto;
import eyemed.group.model.dto.members.ReportingCodesDto;
import eyemed.group.model.dto.members.search.MemberSearchDto;
import eyemed.group.model.dto.members.transactions.*;
import eyemed.group.model.dto.users.UserRoleDto;
import eyemed.group.security.SecurityHelper;
import eyemed.group.util.Constants;
import eyemed.utils.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by c09368 on 11/1/2018.
 */
@Repository
public class MemberInputValidator {
    private static final Log LOGGER = LogFactory.getLog(MemberInputValidator.class);
    private static final Pattern validMemberIdPattern = Pattern.compile("^[a-zA-Z0-9]*$");

    private MessageSource messageSource;

    public MemberInputValidator(MessageSource messageSource){
         this.messageSource = messageSource;
    }

    public String isMemberSearchValidation(MemberSearchDto memberSearchDto, MessageSource messageSource, Locale locale){

        if(memberSearchDto.isMatchSearch()){
            return addMemberSearchValidation(memberSearchDto, messageSource, locale);
        }else {
            return updateMemberSearchValidation(memberSearchDto, messageSource, locale);
        }

    }

    public boolean isGetMemberValidation(String memberCk){
        if (StringUtils.isBlank(memberCk) || "NULL".equalsIgnoreCase(memberCk)) {
            return false;
        }
        return true;
    }

    private String addMemberSearchValidation(MemberSearchDto memberSearchDto, MessageSource messageSource, Locale locale){
        if(StringUtils.isBlank(memberSearchDto.getGroupCk()) && StringUtils.isBlank(memberSearchDto.getSubGroupCk())) {
            return messageSource.getMessage("member.search.group.subgroup.fields.empty", null, locale);
        }
        if (StringUtils.isBlank(memberSearchDto.getLastName()) ||
                StringUtils.isBlank(memberSearchDto.getFirstName()) ||
                null == memberSearchDto.getDateOfBirth() ||
                (Constants.MEMBER_ID_SOURCE_CS.equalsIgnoreCase(memberSearchDto.getMemberIdSource()) && StringUtils.isBlank(memberSearchDto.getMemberId()))) {

            if(Constants.MEMBER_ID_SOURCE_CS.equalsIgnoreCase(memberSearchDto.getMemberIdSource())) {
                return messageSource.getMessage("member.search.add.CS.fields.empty", null, locale);
            }else  if(Constants.MEMBER_ID_SOURCE_SG.equalsIgnoreCase(memberSearchDto.getMemberIdSource())) {
                return messageSource.getMessage("member.search.add.SG.fields.empty", null, locale);
            }else{
                return messageSource.getMessage("member.search.add.CS.fields.empty", null, locale);
            }
        }

        return memberSearchFormatLengthValidation (memberSearchDto, messageSource, locale);

    }

    private String updateMemberSearchValidation(MemberSearchDto memberSearchDto, MessageSource messageSource, Locale locale){

        if (StringUtils.isBlank(memberSearchDto.getMemberId()) && StringUtils.isBlank(memberSearchDto.getFirstName()) &&
                StringUtils.isBlank(memberSearchDto.getLastName()) && StringUtils.isBlank(memberSearchDto.getSsn()) && null == memberSearchDto.getDateOfBirth()) {
            return messageSource.getMessage("api.invalid-search-request", null, locale);
        }
        if (!StringUtils.isBlank(memberSearchDto.getFirstName())) {
            if (StringUtils.isBlank(memberSearchDto.getMemberId()) && StringUtils.isBlank(memberSearchDto.getLastName()) &&
                    StringUtils.isBlank(memberSearchDto.getSsn()) && null == memberSearchDto.getDateOfBirth()) {
                return messageSource.getMessage("member.search.first.name.only", null, locale);
            }
        }

        if (null != memberSearchDto.getDateOfBirth()) {
            if (StringUtils.isBlank(memberSearchDto.getMemberId()) &&
                    StringUtils.isBlank(memberSearchDto.getFirstName()) &&
                    StringUtils.isBlank(memberSearchDto.getLastName()) &&
                    StringUtils.isBlank(memberSearchDto.getSsn()) ) {
                return messageSource.getMessage("member.search.dob.name.only", null, locale);
            }
        }

        if (!StringUtils.isBlank(memberSearchDto.getLastName())) {
            if (StringUtils.isBlank(memberSearchDto.getMemberId()) && StringUtils.isBlank(memberSearchDto.getFirstName()) &&
                    StringUtils.isBlank(memberSearchDto.getSsn()) &&  null == memberSearchDto.getDateOfBirth()) {
                return messageSource.getMessage("member.search.last.name.only", null, locale);
            }
        }

        return memberSearchFormatLengthValidation (memberSearchDto, messageSource, locale);


    }

    public String memberSearchFormatLengthValidation(MemberSearchDto memberSearchCriteria, MessageSource messageSource, Locale locale){

        if (!StringUtils.isBlank(memberSearchCriteria.getMemberId())) {
            if (!validMemberIdPattern.matcher(memberSearchCriteria.getMemberId().trim()).matches()) {
                return messageSource.getMessage("member.search.member.id.format.not.valid", null, locale);
            }
        }
        if (!StringUtils.isBlank(memberSearchCriteria.getSsn())) {
            if (!StringUtils.isValidSsnWithFourOrNineDigit(StringUtils.safeTrim(memberSearchCriteria.getSsn()))) {
                return messageSource.getMessage("member.ssn.invalid", null, locale);
            }
        }

        if(null != memberSearchCriteria.getDateOfBirth()){
            if(!Constants.validateDateFormat(memberSearchCriteria.getDateOfBirth())){
                return messageSource.getMessage("member.search.dob.invalid.format", null, locale);
            }
        }

        if(null != memberSearchCriteria.getDateOfService()){
            if(!Constants.validateDateFormat(memberSearchCriteria.getDateOfBirth())){
                return messageSource.getMessage("member.search.dos.invalid.format", null, locale);
            }
        }

        if(!StringUtils.isBlank(memberSearchCriteria.getMemberId()) && Constants.fieldLengthValidation(memberSearchCriteria.getMemberId(), 15 )){
            return messageSource.getMessage("member.demographic.client.health.id.length", null, locale);
        }
        if(!StringUtils.isBlank(memberSearchCriteria.getFirstName()) && Constants.fieldLengthValidation(memberSearchCriteria.getFirstName(), 15 )){
            return messageSource.getMessage("member.demographic.first.name.length", null, locale);
        }
        if(!StringUtils.isBlank(memberSearchCriteria.getLastName()) && Constants.fieldLengthValidation(memberSearchCriteria.getLastName(), 35 )){
            return messageSource.getMessage("member.demographic.last.name.length", null, locale);
        }
        return null;
    }



    private boolean holdMemberValidation(MemberTransactionDto request){
        if (request.getMemberType().equalsIgnoreCase(Constants.DEPENDENT_MEMBER_TYPE)){
            return !(StringUtils.isBlank(request.getSubscriberCk()) || StringUtils.isBlank(request.getSubscriberMemberCk()));
        }
        return true;
    }

    public boolean addMemberValidation(MemberTransactionDto request){
        if(StringUtils.isBlank(request.getMemberType()) || StringUtils.isBlank(request.getTransactionType())) {
            return false;
        }else if(Constants.MBR_MAINT_HOLD_TRANS.equalsIgnoreCase(request.getTransactionType())){
            return holdMemberValidation(request);
        }else if (request.getMemberType().equalsIgnoreCase(Constants.SUBSCRIBER_MEMBER_TYPE)){
            return  !(request.getCoverage()== null || StringUtils.isBlank(request.getCoverage().getGroupCk()) || StringUtils.isBlank(request.getCoverage().getSubGroupCk()) ||
                    StringUtils.isBlank(request.getCoverage().getClassId()) || StringUtils.isBlank(request.getCoverage().getPlanId()) ||
                    request.getCoverage().getStartDate() == null || StringUtils.isBlank(request.getRelationship()) ||
                    StringUtils.isBlank(request.getMemberFirstName()) || StringUtils.isBlank(request.getMemberLastName()) || request.getMemberDateOfBirth()== null  ||
                    StringUtils.isBlank(request.getGender()) || request.getPrimaryAddress() == null);
        }else if (request.getMemberType().equalsIgnoreCase(Constants.DEPENDENT_MEMBER_TYPE)){
            return  !(StringUtils.isBlank(request.getSubscriberCk()) || StringUtils.isBlank(request.getSubscriberMemberCk()) ||
                    request.getCoverage()== null || StringUtils.isBlank(request.getCoverage().getGroupCk()) || StringUtils.isBlank(request.getCoverage().getSubGroupCk()) ||
                    StringUtils.isBlank(request.getCoverage().getClassId()) || StringUtils.isBlank(request.getCoverage().getPlanId()) ||
                    request.getCoverage().getStartDate() == null || StringUtils.isBlank(request.getRelationship()) ||
                    StringUtils.isBlank(request.getMemberFirstName()) || StringUtils.isBlank(request.getMemberLastName()) || request.getMemberDateOfBirth()== null  ||
                    StringUtils.isBlank(request.getGender()) || request.getPrimaryAddress() == null);
        }else {
            return true;
        }
    }

    public boolean updateMemberValidation(MemberTransactionDto request){
        if(StringUtils.isBlank(request.getMemberType())){
            return false;
        }else if (request.getMemberType().equalsIgnoreCase(Constants.SUBSCRIBER_MEMBER_TYPE)){
            return  !(StringUtils.isBlank(request.getSubscriberCk()) || StringUtils.isBlank(request.getMemberCk()) ||
                    request.getCoverage()== null || StringUtils.isBlank(request.getCoverage().getGroupCk()) || StringUtils.isBlank(request.getCoverage().getSubGroupCk()) ||
                    StringUtils.isBlank(request.getRelationship()) || StringUtils.isBlank(request.getMemberFirstName()) || StringUtils.isBlank(request.getMemberLastName()) ||
                    request.getMemberDateOfBirth()== null  || StringUtils.isBlank(request.getGender()) ||
                    request.getPrimaryAddress() == null);
        }else if (request.getMemberType().equalsIgnoreCase(Constants.DEPENDENT_MEMBER_TYPE)){
            return  !(StringUtils.isBlank(request.getSubscriberCk()) || StringUtils.isBlank(request.getMemberCk()) ||
                    request.getCoverage()== null || StringUtils.isBlank(request.getCoverage().getGroupCk()) || StringUtils.isBlank(request.getCoverage().getSubGroupCk()) ||
                    StringUtils.isBlank(request.getRelationship()) || StringUtils.isBlank(request.getMemberFirstName()) || StringUtils.isBlank(request.getMemberLastName()) ||
                    request.getMemberDateOfBirth()== null  || StringUtils.isBlank(request.getGender()) ||
                    request.getPrimaryAddress() == null);
        }else {
            return true;
        }
    }

    public String addMemberDataValidation(MemberTransactionDto request, MessageSource messageSource, Locale locale){
        if(Constants.MBR_MAINT_HOLD_TRANS.equalsIgnoreCase(request.getTransactionType())){
            return holdMemberDataValidation(request,messageSource,locale);
        }else{
            return addOrUpdateMemberDataValidation(request,messageSource,locale);
        }
    }

    public String updateMemberDataValidation(MemberTransactionDto request, MessageSource messageSource, Locale locale){
        return addOrUpdateMemberDataValidation(request,messageSource,locale);    }

    private String addOrUpdateMemberDataValidation(MemberTransactionDto request, MessageSource messageSource, Locale locale){
        String result = null;

        result = memberDataValidation(request,messageSource,locale);
        if(result != null){ return result;}

        result = privacyDataValidation(request,messageSource,locale);
        return result;

    }

    private String holdMemberDataValidation(MemberTransactionDto request, MessageSource messageSource, Locale locale){
        return memberDataValidation(request,messageSource,locale);
    }

    private String memberDataValidation(MemberTransactionDto request, MessageSource messageSource, Locale locale){
        String result = null;
        if(Constants.MEMBER_ID_SOURCE_CS.equalsIgnoreCase(request.getMemberIdSource()) && StringUtils.isBlank(request.getClientHealthId())){
            return messageSource.getMessage("member.healthId.required", null, locale);
        }

        if (!StringUtils.isBlank(request.getSsn())) {
            final String ssn = request.getSsn().replaceAll("[^\\d.]", "").trim();
            if (ssn.length() != 4 && ssn.length() != 9) {
                return messageSource.getMessage("member.ssn.invalid", null, locale);
            }
        }

        if (!StringUtils.isBlank(request.getEmail())) {
            Matcher matcher = Constants.EMAIL_PATTERN.matcher(request.getEmail());
            if (!matcher.find()) {
                return messageSource.getMessage("member.email.invalid", null, locale);
            }
        }

        if(!StringUtils.isBlank(request.getPhone())){
            if (!StringUtils.isValidPhoneNumber(request.getPhone(),false)) {
                return messageSource.getMessage("member.phone.invalid", null, locale);
            }
        }

        if (request.getCoverage().getStartDate() != null && request.getMemberDateOfBirth() != null
                && request.getCoverage().getStartDate().isBefore(request.getMemberDateOfBirth())) {
            return messageSource.getMessage("member.coverage.effective.date.invalid", null, locale);
        }

        if (request.getCoverage().getStartDate() != null && request.getCoverage().getEndDate() != null
                && request.getCoverage().getEndDate().isBefore(request.getCoverage().getStartDate())) {
            return messageSource.getMessage("member.coverage.end.date.invalid", null, locale);
        }

        if(null != request.getMemberDateOfBirth()){
            if(!Constants.validateDateFormat(request.getMemberDateOfBirth())){
                return messageSource.getMessage("member.search.dob.invalid.format", null, locale);
            }
        }
        if(null != request.getCoverage().getStartDate()){
            if(!Constants.validateDateFormat(request.getCoverage().getStartDate())){
                return messageSource.getMessage("member.search.effective.invalid.format", null, locale);
            }
        }

        if(null != request.getCoverage().getEndDate()){
            if(!Constants.validateDateFormat(request.getCoverage().getEndDate())){
                return messageSource.getMessage("member.search.term.invalid.format", null, locale);
            }
        }

        if (UserRoleDto.UserType.Internal.name().equalsIgnoreCase(
                SecurityHelper.getUserRoleDto().getUserType().name()) && StringUtils.isBlank(request.getFileBoundId())) {
            return messageSource.getMessage("member.filebound.id.null", null, locale);
        }

        // Demographic Field Length Validation
        result = memberDemographicLengthValidation(request, messageSource, locale);
        if(result != null){
            return result;
        }

        // Reporting Code Validation
        result = reportCodesLengthValidation(request.getReportingCodes(), messageSource, locale);
        if(result != null){
            return result;
        }
        // Privacy Address Length Validation.
        result = privacyAddressLengthValidation(request.getPrivacy(), messageSource, locale);
        return result;
    }

    private boolean isAddressEmpty(AddressDto addressDto){
        return StringUtils.isBlank(addressDto.getLine1()) &&
                StringUtils.isBlank(addressDto.getLine2()) &&
                StringUtils.isBlank(addressDto.getLine3()) &&
                StringUtils.isBlank(addressDto.getState()) &&
                StringUtils.isBlank(addressDto.getCity()) &&
                StringUtils.isBlank(addressDto.getCounty()) &&
                StringUtils.isBlank(addressDto.getZip());
                //&& (StringUtils.isBlank(addressDto.getForeignIndicator())
                //        ||  (!StringUtils.isBlank(addressDto.getForeignIndicator())
                //                && addressDto.getForeignIndicator().equalsIgnoreCase("N"))
                //);

    }

    public boolean updateEnrollmentDateValidation(EnrollmentChgDto enrollmentChgRequest){
        if(StringUtils.isBlank(enrollmentChgRequest.getMemberCk())){
            return true;
        }else if (enrollmentChgRequest.getEnrollmentDate() == null || enrollmentChgRequest.getPreviousEnrollmentDate() == null ||
                StringUtils.isBlank(enrollmentChgRequest.getGroupCk()) || StringUtils.isBlank(enrollmentChgRequest.getSubGroupCk()) ||
                StringUtils.isBlank(enrollmentChgRequest.getMemberType()) || StringUtils.isBlank(enrollmentChgRequest.getSubscriberCk() ) ||
                StringUtils.isBlank(enrollmentChgRequest.getClassId()) || StringUtils.isBlank(enrollmentChgRequest.getPlanId()) ||
                (Constants.GRP_USER_ROLE_TYPE_INTERNAL.equalsIgnoreCase(SecurityHelper.getUserRoleDto().getUserType().name()) && StringUtils.isBlank(enrollmentChgRequest.getFileBoundId()))){
           return true;
        } else{
            return false;
        }
    }

    public boolean validateVoidMember(VoidCoverageDto voidCoverageDto){
        if(voidCoverageDto.isVoidMember()){
            if(StringUtils.isBlank(voidCoverageDto.getMemberCk()) ||
                    StringUtils.isBlank(voidCoverageDto.getSubscriberCk()) ||
                    StringUtils.isBlank(voidCoverageDto.getMemberType()) ||
                    (Constants.GRP_USER_ROLE_TYPE_INTERNAL.equalsIgnoreCase(SecurityHelper.getUserRoleDto().getUserType().name()) && StringUtils.isBlank(voidCoverageDto.getFileBoundId())) ){
                return true;
            }else return false;
        }else {
            if(StringUtils.isBlank(voidCoverageDto.getMemberCk()) ||
                    StringUtils.isBlank(voidCoverageDto.getSubscriberCk()) ||
                    StringUtils.isBlank(voidCoverageDto.getMemberType()) ||
                    StringUtils.isBlank(voidCoverageDto.getGroupCk()) ||
                    StringUtils.isBlank(voidCoverageDto.getSubGroupCk()) ||
                    StringUtils.isBlank(voidCoverageDto.getClassId()) ||
                    StringUtils.isBlank(voidCoverageDto.getPlanId()) ||
                    StringUtils.isBlank(voidCoverageDto.getEffectiveDate()) ||
                    StringUtils.isBlank(voidCoverageDto.getTerminationDate()) ||
                    (Constants.GRP_USER_ROLE_TYPE_INTERNAL.equalsIgnoreCase(SecurityHelper.getUserRoleDto().getUserType().name()) && StringUtils.isBlank(voidCoverageDto.getFileBoundId()))){
                return true;
            }else {
                DateTime effectiveDate = new DateTime(voidCoverageDto.getEffectiveDate());
                DateTime termDate = new DateTime(voidCoverageDto.getTerminationDate());
                if(!effectiveDate.toLocalDate().isEqual(termDate.toLocalDate())){
                    return true;
                }else return false;
            }
        }
    }

    public boolean addCoverageValidation(AddCoverageDto addCoverageDto){
        if(StringUtils.isBlank(addCoverageDto.getMemberCk())){
            return true;
        }else if(StringUtils.isBlank(addCoverageDto.getSubscriberCk()) || StringUtils.isBlank(addCoverageDto.getMemberCk()) ||
                StringUtils.isBlank(addCoverageDto.getGroupCk()) || StringUtils.isBlank(addCoverageDto.getSubGroupCk()) ||
                StringUtils.isBlank(addCoverageDto.getClassId()) || StringUtils.isBlank(addCoverageDto.getPlanId()) ||
                addCoverageDto.getEffectiveDate() == null || StringUtils.isBlank(addCoverageDto.getMemberType()) ||
                (Constants.GRP_USER_ROLE_TYPE_INTERNAL.equalsIgnoreCase(SecurityHelper.getUserRoleDto().getUserType().name()) && StringUtils.isBlank(addCoverageDto.getFileBoundId()))){
            return true;
        }
        return false;
    }

    public boolean updateCoverageValidation(UpdateCoverageDto updateCoverageDto){
        if(StringUtils.isBlank(updateCoverageDto.getMemberCk())){
            return true;
        }else if(StringUtils.isBlank(updateCoverageDto.getSubscriberCk()) || StringUtils.isBlank(updateCoverageDto.getMemberCk()) ||
                StringUtils.isBlank(updateCoverageDto.getGroupCk()) || StringUtils.isBlank(updateCoverageDto.getSubGroupCk()) ||
                StringUtils.isBlank(updateCoverageDto.getClassId()) || StringUtils.isBlank(updateCoverageDto.getPlanId()) ||
                updateCoverageDto.getEffectiveDate() == null || StringUtils.isBlank(updateCoverageDto.getMemberType()) ||
                (Constants.GRP_USER_ROLE_TYPE_INTERNAL.equalsIgnoreCase(SecurityHelper.getUserRoleDto().getUserType().name()) && StringUtils.isBlank(updateCoverageDto.getFileBoundId()))){
            return true;
        }
        return false;
    }

    private String memberDemographicLengthValidation(MemberTransactionDto request, MessageSource messageSource, Locale locale){
        if(Constants.fieldLengthValidation(request.getFileBoundId(), 15 )){
            return messageSource.getMessage("member.demographic.file.bound.id.length", null, locale);
        }
        if(Constants.fieldLengthValidation(request.getClientHealthId(), 15 )){
            return messageSource.getMessage("member.demographic.client.health.id.length", null, locale);
        }
        if(Constants.fieldLengthValidation(request.getMemberFirstName(), 15 )){
            return messageSource.getMessage("member.demographic.first.name.length", null, locale);
        }
        if(Constants.fieldLengthValidation(request.getMemberLastName(), 35 )){
            return messageSource.getMessage("member.demographic.last.name.length", null, locale);
        }
        if(Constants.fieldLengthValidation(request.getMemberMidInitial(), 1 )){
            return messageSource.getMessage("member.demographic.middle.initial.name.length", null, locale);
        }
        if(Constants.fieldLengthValidation(request.getMemberNameSuffix(), 10 )){
            return messageSource.getMessage("member.demographic.suffix.length", null, locale);
        }
        if(Constants.fieldLengthValidation(request.getEmail(), 40 )){
            return messageSource.getMessage("member.demographic.first.email.length", null, locale);
        }
        if(Constants.fieldLengthValidation(request.getPhone(), 10 )){
            return messageSource.getMessage("member.demographic.first.phone.length", null, locale);
        }
        if(request.getPrimaryAddress() != null) {
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getLine1(), 40)) {
                return messageSource.getMessage("member.demographic.first.address.line1.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getLine2(), 40)) {
                return messageSource.getMessage("member.demographic.first.address.line2.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getLine3(), 40)) {
                return messageSource.getMessage("member.demographic.first.address.line3.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getCity(), 19)) {
                return messageSource.getMessage("member.demographic.first.address.city.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getState(), 2)) {
                return messageSource.getMessage("member.demographic.first.address.state.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getZip(), 11)) {
                return messageSource.getMessage("member.demographic.first.address.zip.code.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getCounty(), 20)) {
                return messageSource.getMessage("member.demographic.first.address.county.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getCountryCode(), 4)) {
                return messageSource.getMessage("member.demographic.first.address.country.code.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getType(), 1)) {
                return messageSource.getMessage("member.demographic.first.address.type.length", null, locale);
            }
            if (Constants.fieldLengthValidation(request.getPrimaryAddress().getForeignIndicator(), 1)) {
                return messageSource.getMessage("member.demographic.first.address.foreign.indicator.length", null, locale);
            }
        }

        return null;
    }

    public String reportCodesLengthValidation(ReportingCodesDto reportingCodes, MessageSource messageSource, Locale locale){
        if(reportingCodes != null){
            if(!StringUtils.isBlank(reportingCodes.getBenefitOption()) && reportingCodes.getBenefitOption().length() > 4){
                return messageSource.getMessage("member.benefit.option.length", null, locale);
            }
            if(!StringUtils.isBlank(reportingCodes.getCompanyCode()) && reportingCodes.getCompanyCode().length() > 20){
                return messageSource.getMessage("member.company.code.length", null, locale);
            }
            if(!StringUtils.isBlank(reportingCodes.getDivisionCode()) && reportingCodes.getDivisionCode().length() > 20){
                return messageSource.getMessage("member.division.code.length", null, locale);
            }
            if(!StringUtils.isBlank(reportingCodes.getLocationGroupNumber()) && reportingCodes.getLocationGroupNumber().length() > 20){
                return messageSource.getMessage("member.location.code.length", null, locale);
            }
            if(!StringUtils.isBlank(reportingCodes.getClientGroupNumber()) && reportingCodes.getClientGroupNumber().length() > 20){
                return messageSource.getMessage("member.client.group.length", null, locale);
            }
            if(reportingCodes.getReportingCodes() != null && reportingCodes.getReportingCodes().size() > 0){
                for(String reportingCode : reportingCodes.getReportingCodes()) {
                    if(!StringUtils.isBlank(reportingCode) && reportingCode.length() > 20){
                        return messageSource.getMessage("member.reporting.code.length", null, locale);
                    }
                }
            }
        }
        return null;
    }

    private String privacyAddressLengthValidation(PrivacyDto privacyAddress, MessageSource messageSource, Locale locale){

        if(Constants.fieldLengthValidation(privacyAddress.getFirstName(), 20 )){
            return messageSource.getMessage("member.privacy.address.first.name.length", null, locale);
        }
        if(Constants.fieldLengthValidation(privacyAddress.getLastName(), 35 )){
            return messageSource.getMessage("member.privacy.address.last.name.length", null, locale);
        }

        if(Constants.fieldLengthValidation(privacyAddress.getMidInitial(), 1 )){
            return messageSource.getMessage("member.privacy.address.middle.initial.length", null, locale);
        }
        if(privacyAddress.getAddress() != null){
            if(Constants.fieldLengthValidation(privacyAddress.getAddress().getLine1(), 48 )){
                return messageSource.getMessage("member.privacy.address.line1.length", null, locale);
            }
            if(Constants.fieldLengthValidation(privacyAddress.getAddress().getLine2(), 48 )){
                return messageSource.getMessage("member.privacy.address.line2.length", null, locale);
            }
            if(Constants.fieldLengthValidation(privacyAddress.getAddress().getLine3(), 48 )){
                return messageSource.getMessage("member.privacy.address.line3.length", null, locale);
            }
            if(Constants.fieldLengthValidation(privacyAddress.getAddress().getZip(), 11 )){
                return messageSource.getMessage("member.privacy.address.zip.code.length", null, locale);
            }
            if(Constants.fieldLengthValidation(privacyAddress.getAddress().getCity(), 32 )){
                return messageSource.getMessage("member.privacy.address.city.length", null, locale);
            }
            if(Constants.fieldLengthValidation(privacyAddress.getAddress().getState(), 2 )){
                return messageSource.getMessage("member.privacy.address.state.length", null, locale);
            }
            if(Constants.fieldLengthValidation(privacyAddress.getAddress().getCounty(), 32 )){
                return messageSource.getMessage("member.privacy.address.county.length", null, locale);
            }
        }
        return null;
    }

    private String privacyDataValidation(MemberTransactionDto request, MessageSource messageSource, Locale locale){
        if(request.getPrivacy() != null){
            if((StringUtils.isBlank(request.getPrivacy().getFirstName()) && !StringUtils.isBlank(request.getPrivacy().getLastName()))
                    || (!StringUtils.isBlank(request.getPrivacy().getFirstName()) && StringUtils.isBlank(request.getPrivacy().getLastName()))) {
                return messageSource.getMessage("member.add.update.privacy.name.null", null, locale);
            }else if((!StringUtils.isBlank(request.getPrivacy().getFirstName())
                    || !StringUtils.isBlank(request.getPrivacy().getLastName())
                    || !StringUtils.isBlank(request.getPrivacy().getMidInitial()))
                    && (request.getPrivacy().getAddress()!= null  && StringUtils.isBlank(request.getPrivacy().getAddress().getLine1()))){
                return messageSource.getMessage("member.add.update.privacy.address.line1.null", null, locale);
            }else if(!isAddressEmpty(request.getPrivacy().getAddress()) && StringUtils.isBlank(request.getPrivacy().getAddress().getLine1())) {
                return messageSource.getMessage("member.add.update.privacy.address.line1.null", null, locale);
            }
        }
        return null;
    }

    public String validateCoverageOnGroupStructure(SubGroupDto subGroupDto,  String classId, String planId , DateTime effectiveDate, DateTime termDate, Locale locale){
        String validationErrorMsg = null;

        if(effectiveDate != null) {
            validationErrorMsg = validateGroupSubgroupClassPlanEffectiveTermDate(subGroupDto, classId, planId, effectiveDate, "effectiveDate", locale);
            if(validationErrorMsg != null){
                return validationErrorMsg;
            }
        }
        if(termDate != null){
            validationErrorMsg =  validateGroupSubgroupClassPlanEffectiveTermDate(subGroupDto, classId, planId, termDate, "termDate", locale);
            if(validationErrorMsg != null){
                return validationErrorMsg;
            }
        }

       return null;
    }

    private String validateGroupSubgroupClassPlanEffectiveTermDate(SubGroupDto subGroup,String inputClassId, String inputPlanId , DateTime inputValidationDate, String fieldName, Locale locale){

        if (subGroup.getGroupEffectiveDate() !=null && inputValidationDate.withTimeAtStartOfDay().isBefore(subGroup.getGroupEffectiveDate().withTimeAtStartOfDay())) {
            return messageSource.getMessage("member."+fieldName+"[before.group.effective.date]", null, locale);
        }else if (subGroup.getGroupTerminationDate() !=null && inputValidationDate.withTimeAtStartOfDay().isAfter(subGroup.getGroupTerminationDate().toDateMidnight())) {
            return messageSource.getMessage("member."+fieldName+"[after.group.term.date]", null, locale);
        }else if(subGroup.getEffectiveDate() !=null && inputValidationDate.withTimeAtStartOfDay().isBefore(subGroup.getEffectiveDate().withTimeAtStartOfDay())) {
            return messageSource.getMessage("member."+fieldName+"[before.subGroup.effective.date]", null, locale);
        }else if (subGroup.getTerminationDate() !=null && inputValidationDate.withTimeAtStartOfDay().isAfter(subGroup.getTerminationDate().toDateMidnight())) {
            return messageSource.getMessage("member."+fieldName+"[after.subGroup.term.date]", null, locale);
        }else{
            if(subGroup.getClassPlan() != null){
                boolean isClassPlanMatch = subGroup.getClassPlan().stream()
                        .anyMatch(classPlanDto -> classPlanDto.getClassId().equalsIgnoreCase(inputClassId) && classPlanDto.getPlanId().equalsIgnoreCase(inputPlanId) &&
                                (classPlanDto.getClassEffectiveDate() != null &&
                                        (inputValidationDate.toLocalDate().isEqual(classPlanDto.getClassEffectiveDate().toLocalDate()) ||
                                                inputValidationDate.toLocalDate().isAfter(classPlanDto.getClassEffectiveDate().toLocalDate()))) &&
                                (classPlanDto.getClassTerminationDate() == null || (classPlanDto.getClassTerminationDate() != null &&
                                        (inputValidationDate.toLocalDate().isEqual(classPlanDto.getClassTerminationDate().toLocalDate()) ||
                                                inputValidationDate.toLocalDate().isBefore(classPlanDto.getClassTerminationDate().toLocalDate())))) &&
                                (classPlanDto.getPlanEffectiveDate() != null &&
                                        (inputValidationDate.toLocalDate().isEqual(classPlanDto.getPlanEffectiveDate().toLocalDate()) ||
                                                inputValidationDate.toLocalDate().isAfter(classPlanDto.getPlanEffectiveDate().toLocalDate()))) &&
                                (classPlanDto.getPlanTerminationDate() == null ||
                                        (classPlanDto.getPlanTerminationDate() != null &&
                                                (inputValidationDate.toLocalDate().isEqual(classPlanDto.getPlanTerminationDate().toLocalDate()) ||
                                                        inputValidationDate.toLocalDate().isBefore(classPlanDto.getPlanTerminationDate().toLocalDate())))));

                if(!isClassPlanMatch){
                    List<ClassPlanDto> classPlanDtoList = subGroup.getClassPlan().stream()
                            .filter (classPlanDto -> classPlanDto.getClassId().equalsIgnoreCase(inputClassId) && classPlanDto.getPlanId().equalsIgnoreCase(inputPlanId))
                            .collect(Collectors.toList());

                    boolean isEffDateClassMatch = classPlanDtoList.stream()
                            .anyMatch(classPlanDto -> classPlanDto.getClassEffectiveDate() != null &&
                                    (inputValidationDate.toLocalDate().isEqual(classPlanDto.getClassEffectiveDate().toLocalDate()) ||
                                            inputValidationDate.toLocalDate().isAfter(classPlanDto.getClassEffectiveDate().toLocalDate())));
                    if(!isEffDateClassMatch){
                        return messageSource.getMessage("member."+fieldName+"[before.class.effective.date]", null, locale);
                    }

                    boolean isTermDateClassMatch = classPlanDtoList.stream()
                            .anyMatch(classPlanDto -> classPlanDto.getClassTerminationDate() == null || (classPlanDto.getClassTerminationDate() != null &&
                                    (inputValidationDate.toLocalDate().isEqual(classPlanDto.getClassTerminationDate().toLocalDate()) ||
                                            inputValidationDate.toLocalDate().isBefore(classPlanDto.getClassTerminationDate().toLocalDate()))));
                    if(!isTermDateClassMatch){
                        return messageSource.getMessage("member."+fieldName+"[after.class.term.date]", null, locale);
                    }

                    boolean isEffDatePlanMatch = classPlanDtoList.stream()
                            .anyMatch(classPlanDto -> classPlanDto.getPlanEffectiveDate() != null &&
                                    (inputValidationDate.toLocalDate().isEqual(classPlanDto.getPlanEffectiveDate().toLocalDate()) ||
                                            inputValidationDate.toLocalDate().isAfter(classPlanDto.getPlanEffectiveDate().toLocalDate())));
                    if(!isEffDatePlanMatch){
                        return messageSource.getMessage("member."+fieldName+"[before.plan.effective.date]", null, locale);
                    }

                    boolean isTermDatePlanMatch = classPlanDtoList.stream()
                            .anyMatch(classPlanDto -> classPlanDto.getPlanTerminationDate() == null ||
                                    (classPlanDto.getPlanTerminationDate() != null &&
                                            (inputValidationDate.toLocalDate().isEqual(classPlanDto.getPlanTerminationDate().toLocalDate()) ||
                                                    inputValidationDate.toLocalDate().isBefore(classPlanDto.getPlanTerminationDate().toLocalDate()))));
                    if(!isTermDatePlanMatch){
                        return messageSource.getMessage("member."+fieldName+"[after.plan.term.date]", null, locale);
                    }
                }
            }
        }

        return null;
    }
}
