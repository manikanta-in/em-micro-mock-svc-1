package eyemed.group.model.dto;

public class StatusDto {
    protected String status;

    public StatusDto() {}
    public StatusDto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
