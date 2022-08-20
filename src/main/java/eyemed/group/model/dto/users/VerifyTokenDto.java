package eyemed.group.model.dto.users;

import java.io.Serializable;

public class VerifyTokenDto implements Serializable {

    private String message;
    private String statusCode;
    private Integer attemptCount;

    public Integer getAttemptCount() {
        return attemptCount == null ? 0 : attemptCount;
    }

    public void setAttemptCount(Integer attemptCount) {
        this.attemptCount = attemptCount;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "VerifyTokenDto{"
                + "statusCode='" + statusCode + "'"
                + "message='" + message + "'"
                + '}';
    }
}
