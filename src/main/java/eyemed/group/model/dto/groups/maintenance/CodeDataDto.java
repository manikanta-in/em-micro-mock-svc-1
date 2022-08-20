package eyemed.group.model.dto.groups.maintenance;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class CodeDataDto implements Serializable {

    private static final long serialVersionUID = 7864628217060274497L;

    private String code, description;

    public CodeDataDto() {

    }

    public CodeDataDto( final String code, final String description ) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode( final String code ) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription( final String description ) {
        this.description = description;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString( this );
    }
}