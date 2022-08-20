package eyemed.group.model.dto.users;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class VerifyTokenResultDto implements Serializable {

    private VerifyTokenDto verifyTokenResult;

    public VerifyTokenDto getVerifyTokenResult() {
        return verifyTokenResult;
    }

    public void setVerifyTokenResult(VerifyTokenDto verifyTokenResult) {
        this.verifyTokenResult = verifyTokenResult;
    }

    /** Returns a String representation of this object. */
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
