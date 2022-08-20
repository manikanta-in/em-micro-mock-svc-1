package eyemed.group.model.dto.members.search;

import eyemed.group.model.dto.BaseRequest;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 10/8/2018.
 */
public class MemberSearchRequestDto extends BaseRequest {

    private List<String> groupCk; // remove list both on middle and service layer
    private List<String> subGroupCk; // remove list both on middle and service layer
    private String memberIdSource;
    private String id;
    private String suffix;
    private String firstName;
    private String lastName;
    private DateTime dateOfBirth;
    private String ssn;
    private String memberStatus;
    private boolean matchSearch;
    private boolean includeFamily;
    private boolean excludeVoided;
    private DateTime beginSearchDate;
    private DateTime endSearchDate;
    private String userId;
    private int maxRows;
    private String userType;

    public MemberSearchRequestDto(){
        groupCk = new ArrayList<>();
        subGroupCk = new ArrayList<>();
    }
    public List<String> getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(List<String> groupCk) {
        this.groupCk = groupCk;
    }

    public List<String> getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(List<String> subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getMemberIdSource() {
        return memberIdSource;
    }

    public void setMemberIdSource(String memberIdSource) {
        this.memberIdSource = memberIdSource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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

    public boolean isIncludeFamily() {
        return includeFamily;
    }

    public void setIncludeFamily(boolean includeFamily) {
        this.includeFamily = includeFamily;
    }

    public boolean isExcludeVoided() {
        return excludeVoided;
    }

    public void setExcludeVoided(boolean excludeVoided) {
        this.excludeVoided = excludeVoided;
    }

    public DateTime getBeginSearchDate() {
        return beginSearchDate;
    }

    public void setBeginSearchDate(DateTime beginSearchDate) {
        this.beginSearchDate = beginSearchDate;
    }

    public DateTime getEndSearchDate() {
        return endSearchDate;
    }

    public void setEndSearchDate(DateTime endSearchDate) {
        this.endSearchDate = endSearchDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getMaxRows() {
        return maxRows;
    }

    public void setMaxRows(int maxRows) {
        this.maxRows = maxRows;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
