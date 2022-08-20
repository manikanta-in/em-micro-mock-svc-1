package eyemed.group.model.dto.members;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class AbstractResults implements Serializable {
    private String operation;

    public AbstractResults() {
        super();
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation( final String operation ) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
