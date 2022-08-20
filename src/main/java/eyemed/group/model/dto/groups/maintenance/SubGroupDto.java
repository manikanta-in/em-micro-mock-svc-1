package eyemed.group.model.dto.groups.maintenance;

import eyemed.group.model.dto.applications.ClientApplicationQuoteLineItemsDto;
import org.joda.time.DateTime;

import java.io.Serializable;

public class SubGroupDto implements Serializable {

    private String groupCk;
    private String groupId;
    private String subgroupCk;
    private String subgroupId;
    private String subgroupName;
    private String subgroupStatus;
    private String subgroupMctrType;
    private String subgroupPrimaryContact;
    private DateTime subgroupEffectiveDate;
    private DateTime subgroupTerminationDate;
    private String subgroupMctrTermReason;
    private String classId;
    private ClientApplicationQuoteLineItemsDto quoteLineItems;
    private AddressDto address;

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

    public String getSubgroupCk() {
        return subgroupCk;
    }

    public void setSubgroupCk(String subgroupCk) {
        this.subgroupCk = subgroupCk;
    }

    public String getSubgroupId() {
        return subgroupId;
    }

    public void setSubgroupId(String subgroupId) {
        this.subgroupId = subgroupId;
    }

    public String getSubgroupName() {
        return subgroupName;
    }

    public void setSubgroupName(String subgroupName) {
        this.subgroupName = subgroupName;
    }

    public String getSubgroupStatus() {
        return subgroupStatus;
    }

    public void setSubgroupStatus(String subgroupStatus) {
        this.subgroupStatus = subgroupStatus;
    }

    public String getSubgroupMctrType() {
        return subgroupMctrType;
    }

    public void setSubgroupMctrType(String subgroupMctrType) {
        this.subgroupMctrType = subgroupMctrType;
    }

    public String getSubgroupPrimaryContact() {
        return subgroupPrimaryContact;
    }

    public void setSubgroupPrimaryContact(String subgroupPrimaryContact) {
        this.subgroupPrimaryContact = subgroupPrimaryContact;
    }

    public DateTime getSubgroupEffectiveDate() {
        return subgroupEffectiveDate;
    }

    public void setSubgroupEffectiveDate(DateTime subgroupEffectiveDate) {
        this.subgroupEffectiveDate = subgroupEffectiveDate;
    }

    public DateTime getSubgroupTerminationDate() {
        return subgroupTerminationDate;
    }

    public void setSubgroupTerminationDate(DateTime subgroupTerminationDate) {
        this.subgroupTerminationDate = subgroupTerminationDate;
    }

    public String getSubgroupMctrTermReason() { return subgroupMctrTermReason; }

    public void setSubgroupMctrTermReason(String subgroupMctrTermReason) { this.subgroupMctrTermReason = subgroupMctrTermReason; }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public AddressDto getAddress() { return address; }

    public void setAddress(AddressDto address) { this.address = address; }

    public ClientApplicationQuoteLineItemsDto getQuoteLineItems() {
        return quoteLineItems;
    }

    public void setQuoteLineItems(ClientApplicationQuoteLineItemsDto quoteLineItems) {
        this.quoteLineItems = quoteLineItems;
    }
}
