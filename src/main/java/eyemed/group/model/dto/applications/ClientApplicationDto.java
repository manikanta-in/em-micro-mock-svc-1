
package eyemed.group.model.dto.applications;

public class ClientApplicationDto {

    private String status;
    private String userStatus;
    private String validationRequiredIndicator;
    private String recipientType;
    private String recipientName;
    private String recipientEmail;
    private ClientContractDto contract = new ClientContractDto();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getValidationRequiredIndicator() {
        return validationRequiredIndicator;
    }

    public void setValidationRequiredIndicator(String validationRequiredIndicator) {
        this.validationRequiredIndicator = validationRequiredIndicator;
    }

    public String getRecipientType() {
        return recipientType;
    }

    public void setRecipientType(String recipientType) {
        this.recipientType = recipientType;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public ClientContractDto getContract() {
        return contract;
    }

    public void setContract(ClientContractDto contract) {
        this.contract = contract;
    }

}
