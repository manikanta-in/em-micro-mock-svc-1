package eyemed.group.model.dto.applications;

public class ClientImplementationDto {
    ClientContractDto clientContractDto;
    QuoteDto quoteDto;
    String quoteType;
    String groupType;

    public ClientContractDto getClientContractDto() {
        return clientContractDto;
    }

    public void setClientContractDto(ClientContractDto clientContractDto) {
        this.clientContractDto = clientContractDto;
    }

    public QuoteDto getQuoteDto() {
        return quoteDto;
    }

    public void setQuoteDto(QuoteDto quoteDto) {
        this.quoteDto = quoteDto;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
}
