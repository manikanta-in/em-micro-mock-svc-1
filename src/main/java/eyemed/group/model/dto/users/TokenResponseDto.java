package eyemed.group.model.dto.users;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class TokenResponseDto implements Serializable {

    private TokenRequestDto getNewTokenResult;

    public TokenRequestDto getGetNewTokenResult() {
        return getNewTokenResult;
    }

    public void setGetNewTokenResult(TokenRequestDto getNewTokenResult) {
        this.getNewTokenResult = getNewTokenResult;
    }

    /** Returns a String representation of this object. */
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
