package eyemed.group.model.dto.members.search;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 10/8/2018.
 */
public class MemberSearchDto{

    private String groupCk;
    private String subGroupCk;
    private String memberIdSource;
    private String memberId;
    private String firstName;
    private String lastName;
    private DateTime dateOfBirth;
    private String ssn;
    private DateTime dateOfService;
    private String memberStatus;
    private boolean matchSearch;


    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getMemberIdSource() {
        return memberIdSource;
    }

    public void setMemberIdSource(String memberIdSource) {
        this.memberIdSource = memberIdSource;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSsn() {
        return ssn;
    }

    public DateTime getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(DateTime dateOfService) {
        this.dateOfService = dateOfService;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public boolean isMatchSearch() {
        return matchSearch;
    }

    public void setMatchSearch(boolean matchSearch) {
        this.matchSearch = matchSearch;
    }
}
