package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/8/2018.
 */
public class CoverageDto {

    private DateTime startDate;
    private DateTime endDate;
    private String subGroupId;
    private String subGroupName;
    private String subGroupCk;
    private String classId;
    private String classDescription;
    private String planId;
    private String planDescription;
    private String productId;
    private String productDescription;

    private DateTime networkEffectiveDate;
    private DateTime networkTerminationDate;
    private DateTime subGroupEffectiveDate;
    private DateTime subGroupTerminationDate;
    private DateTime previousEffectiveDate;
    private DateTime previousTerminationDate;
    private String memberStatus;

    private String groupCk;
    private String groupId;
    private String groupName;

    private String networkName;
    private String underwritingCode;
    private List<String> networkPrefixes;

    public CoverageDto(){
        super();
        this.networkPrefixes = new ArrayList<>();
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public String getSubGroupId() {
        return subGroupId;
    }

    public void setSubGroupId(String subGroupId) {
        this.subGroupId = subGroupId;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassDescription() {
        return classDescription;
    }

    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public DateTime getNetworkEffectiveDate() {
        return networkEffectiveDate;
    }

    public void setNetworkEffectiveDate(DateTime networkEffectiveDate) {
        this.networkEffectiveDate = networkEffectiveDate;
    }

    public DateTime getNetworkTerminationDate() {
        return networkTerminationDate;
    }

    public void setNetworkTerminationDate(DateTime networkTerminationDate) {
        this.networkTerminationDate = networkTerminationDate;
    }

    public DateTime getSubGroupEffectiveDate() {
        return subGroupEffectiveDate;
    }

    public void setSubGroupEffectiveDate(DateTime subGroupEffectiveDate) {
        this.subGroupEffectiveDate = subGroupEffectiveDate;
    }

    public DateTime getSubGroupTerminationDate() {
        return subGroupTerminationDate;
    }

    public void setSubGroupTerminationDate(DateTime subGroupTerminationDate) {
        this.subGroupTerminationDate = subGroupTerminationDate;
    }

    public DateTime getPreviousEffectiveDate() {
        return previousEffectiveDate;
    }

    public void setPreviousEffectiveDate(DateTime previousEffectiveDate) {
        this.previousEffectiveDate = previousEffectiveDate;
    }

    public DateTime getPreviousTerminationDate() {
        return previousTerminationDate;
    }

    public void setPreviousTerminationDate(DateTime previousTerminationDate) {
        this.previousTerminationDate = previousTerminationDate;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getUnderwritingCode() {
        return underwritingCode;
    }

    public void setUnderwritingCode(String underwritingCode) {
        this.underwritingCode = underwritingCode;
    }

    public List<String> getNetworkPrefixes() {
        return networkPrefixes;
    }

    public void setNetworkPrefixes(List<String> networkPrefixes) {
        this.networkPrefixes = networkPrefixes;
    }
}
