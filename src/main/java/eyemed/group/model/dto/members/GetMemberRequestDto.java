package eyemed.group.model.dto.members;

import eyemed.group.model.dto.BaseRequest;
import org.joda.time.DateTime;

/**
 * Created by c09368 on 11/8/2018.
 */
public class GetMemberRequestDto extends BaseRequest{
    private String memberCk;
    private DateTime dateOfService;
    private String eligibilityPendingInd;
    private boolean includeEligibility;
    private boolean includeAdditionalInfo;
    private boolean includeRelatedMember;
    private boolean includeMemberEvents;

    public GetMemberRequestDto(){
        super();
    }

    public String getMemberCk() {
        return memberCk;
    }

    public void setMemberCk(String memberCk) {
        this.memberCk = memberCk;
    }

    public DateTime getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(DateTime dateOfService) {
        this.dateOfService = dateOfService;
    }

    public String getEligibilityPendingInd() {
        return eligibilityPendingInd;
    }

    public void setEligibilityPendingInd(String eligibilityPendingInd) {
        this.eligibilityPendingInd = eligibilityPendingInd;
    }

    public boolean isIncludeEligibility() {
        return includeEligibility;
    }

    public void setIncludeEligibility(boolean includeEligibility) {
        this.includeEligibility = includeEligibility;
    }

    public boolean isIncludeAdditionalInfo() {
        return includeAdditionalInfo;
    }

    public void setIncludeAdditionalInfo(boolean includeAdditionalInfo) {
        this.includeAdditionalInfo = includeAdditionalInfo;
    }

    public boolean isIncludeRelatedMember() {
        return includeRelatedMember;
    }

    public void setIncludeRelatedMember(boolean includeRelatedMember) {
        this.includeRelatedMember = includeRelatedMember;
    }

    public boolean isIncludeMemberEvents() {
        return includeMemberEvents;
    }

    public void setIncludeMemberEvents(boolean includeMemberEvents) {
        this.includeMemberEvents = includeMemberEvents;
    }
}
