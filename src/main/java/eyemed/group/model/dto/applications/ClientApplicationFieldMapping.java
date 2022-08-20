package eyemed.group.model.dto.applications;

public class ClientApplicationFieldMapping {

    public ClientApplicationFieldMapping() {
    }

    public ClientApplicationFieldMapping(String fieldQualifier, String fieldDataLabel) {
        this.fieldQualifier = fieldQualifier;
        this.fieldDataLabel = fieldDataLabel;
    }

    private String fieldQualifier;
    private String fieldDataLabel;

    public String getFieldQualifier() {
        return fieldQualifier;
    }

    public void setFieldQualifier(String fieldQualifier) {
        this.fieldQualifier = fieldQualifier;
    }

    public String getFieldDataLabel() {
        return fieldDataLabel;
    }

    public void setFieldDataLabel(String fieldDataLabel) {
        this.fieldDataLabel = fieldDataLabel;
    }
}
