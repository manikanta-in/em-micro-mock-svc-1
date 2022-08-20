package eyemed.group.model.dto;

public class StatusMessageDto extends StatusDto {
    private String userMessage;

    public StatusMessageDto() {
    }

    public StatusMessageDto(String status, String userMessage) {
        this.status = status;
        this.userMessage = userMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }
}
