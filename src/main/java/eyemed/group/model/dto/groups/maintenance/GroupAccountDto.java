package eyemed.group.model.dto.groups.maintenance;

import java.io.Serializable;

public class GroupAccountDto extends GroupDto implements Serializable {

    private String accountManagerId;
    private String accountManagerName;
    private String accountManagerType;
    private String accountManagerPhone;
    private String accountManagerEmail;
    private String accountManagerFax;
    private String accountManagerMcreCode;
    private String accountManagerMcreDesc;
    private String accountManagerMcreLang;

    public String getAccountManagerId() { return accountManagerId; }

    public void setAccountManagerId(String accountManagerId) { this.accountManagerId = accountManagerId; }

    public String getAccountManagerName() { return accountManagerName; }

    public void setAccountManagerName(String accountManagerName) { this.accountManagerName = accountManagerName; }

    public String getAccountManagerType() { return accountManagerType; }

    public void setAccountManagerType(String accountManagerType) { this.accountManagerType = accountManagerType; }

    public String getAccountManagerPhone() { return accountManagerPhone; }

    public void setAccountManagerPhone(String accountManagerPhone) { this.accountManagerPhone = accountManagerPhone; }

    public String getAccountManagerEmail() { return accountManagerEmail; }

    public void setAccountManagerEmail(String accountManagerEmail) { this.accountManagerEmail = accountManagerEmail; }

    public String getAccountManagerFax() { return accountManagerFax; }

    public void setAccountManagerFax(String accountManagerFax) { this.accountManagerFax = accountManagerFax; }

    public String getAccountManagerMcreCode() { return accountManagerMcreCode; }

    public void setAccountManagerMcreCode(String accountManagerMcreCode) { this.accountManagerMcreCode = accountManagerMcreCode; }

    public String getAccountManagerMcreDesc() { return accountManagerMcreDesc; }

    public void setAccountManagerMcreDesc(String accountManagerMcreDesc) { this.accountManagerMcreDesc = accountManagerMcreDesc; }

    public String getAccountManagerMcreLang() { return accountManagerMcreLang; }

    public void setAccountManagerMcreLang(String accountManagerMcreLang) { this.accountManagerMcreLang = accountManagerMcreLang; }
}
