package eyemed.group.model.dto.groups.maintenance;

import java.util.List;

public class GroupRequestDto{

    private String systemName;
    private ParentGroupDto parent;
    private GroupDto group;
    private List<GroupAccountDto> accounts;
    private List<GroupRelationDto> relations;
    private GroupClientSetting clientSetting;
    private MemberAdminSetting memberAdminSetting;
    private MemberEdiSetting memberEdiSetting;
    private List<MemberXWalkSetting> memberXWalkSetting;
    private GroupLapDto groupLapSetting;
    private BillEntityDto billEntitySetting;
    private BillDefineDto billDefineSetting;
    private List<RateSettingsDto> rateSettings;
    private BillingContactDto billingContactSetting;

    public ParentGroupDto getParent() { return parent; }

    public void setParent(ParentGroupDto parent) { this.parent = parent; }

    public GroupDto getGroup() { return group; }

    public void setGroup(GroupDto group) { this.group = group; }

    public List<GroupAccountDto> getAccounts() { return accounts; }

    public void setAccounts(List<GroupAccountDto> accounts) { this.accounts = accounts; }

    public List<GroupRelationDto> getRelations() { return relations; }

    public void setRelations(List<GroupRelationDto> relations) { this.relations = relations; }

    public GroupClientSetting getClientSetting() { return clientSetting; }

    public void setClientSetting(GroupClientSetting clientSetting) { this.clientSetting = clientSetting; }

    public MemberAdminSetting getMemberAdminSetting() { return memberAdminSetting; }

    public void setMemberAdminSetting(MemberAdminSetting memberAdminSetting) { this.memberAdminSetting = memberAdminSetting; }

    public MemberEdiSetting getMemberEdiSetting() { return memberEdiSetting; }

    public void setMemberEdiSetting(MemberEdiSetting memberEdiSetting) { this.memberEdiSetting = memberEdiSetting; }

    public List<MemberXWalkSetting> getMemberXWalkSetting() {
        return memberXWalkSetting;
    }

    public void setMemberXWalkSetting(List<MemberXWalkSetting> memberXWalkSetting) {
        this.memberXWalkSetting = memberXWalkSetting;
    }

    public GroupLapDto getGroupLapSetting() {
        return groupLapSetting;
    }

    public void setGroupLapSetting(GroupLapDto groupLapSetting) {
        this.groupLapSetting = groupLapSetting;
    }

    public BillEntityDto getBillEntitySetting() {
        return billEntitySetting;
    }

    public void setBillEntitySetting(BillEntityDto billEntitySetting) {
        this.billEntitySetting = billEntitySetting;
    }

    public BillDefineDto getBillDefineSetting() {
        return billDefineSetting;
    }

    public void setBillDefineSetting(BillDefineDto billDefineSetting) {
        this.billDefineSetting = billDefineSetting;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public List<RateSettingsDto> getRateSettings() {
        return rateSettings;
    }

    public void setRateSettings(List<RateSettingsDto> rateSettings) {
        this.rateSettings = rateSettings;
    }

    public BillingContactDto getBillingContactSetting() {
        return billingContactSetting;
    }

    public void setBillingContactSetting(BillingContactDto billingContactSetting) {
        this.billingContactSetting = billingContactSetting;
    }
}
