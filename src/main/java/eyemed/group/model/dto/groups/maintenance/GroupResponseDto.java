package eyemed.group.model.dto.groups.maintenance;

import java.util.List;

public class GroupResponseDto {

    private ResultDto group;
    private String status;
    private int serviceCode;
    private int returnCode;
    private List<CodeDataDto> errors;
    /**
     * Initialized this GroupResponseDto
     */
    public GroupResponseDto() {
        this(null);
    }

    /**
     * Initialized this GroupResponseDto
     */
    public GroupResponseDto(final String status) {
        this.setStatus(status);
    }

    public ResultDto getGroup() {
        return group;
    }

    public void setGroup(ResultDto group) {
        this.group = group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public List<CodeDataDto> getErrors() {
        return errors;
    }

    public void setErrors(List<CodeDataDto> errors) {
        this.errors = errors;
    }
}
