package eyemed.group.model.dto.applications;

import eyemed.group.model.dto.StatusMessageDto;

public class ClientApplicationSigningUrlDto extends StatusMessageDto {

    private String signingUrl;

    public ClientApplicationSigningUrlDto() {
    }

    public ClientApplicationSigningUrlDto(String status, String userMessage, String signingUrl) {
        super(status, userMessage);
        this.signingUrl = signingUrl;
    }

    public String getSigningUrl() {
        return signingUrl;
    }

    public void setSigningUrl(String signingUrl) {
        this.signingUrl = signingUrl;
    }
}
