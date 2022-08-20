package eyemed.group.model.dto.applications;

public class ClientApplicationIncomingDto {
    private String finalValidationIndicator;
    private ClientContractDto contract = new ClientContractDto();

    public String getFinalValidationIndicator() {
        return finalValidationIndicator;
    }

    public void setFinalValidationIndicator(String finalValidationIndicator) {
        this.finalValidationIndicator = finalValidationIndicator;
    }

    public ClientContractDto getContract() {
        return contract;
    }

    public void setContract(ClientContractDto contract) {
        this.contract = contract;
    }
}
