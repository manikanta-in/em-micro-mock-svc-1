package eyemed.group.model.validation;

import java.util.ArrayList;
import java.util.List;

public class FlexibleValidationResult {
    private int errorCount;
    private int warningCount;
    private List<FlexibleValidationItem> errors = new ArrayList<>();

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    public int getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(int warningCount) {
        this.warningCount = warningCount;
    }

    public List<FlexibleValidationItem> getErrors() {
        return errors;
    }

    public void setErrors(List<FlexibleValidationItem> errors) {
        this.errors = errors;
    }

    public void add(FlexibleValidationItem item) {
        if(item.getLevel().equalsIgnoreCase("ERROR")) {
            errorCount++;
        } else if (item.getLevel().equalsIgnoreCase("WARNING")) {
            warningCount++;
        }
        errors.add(item);
    }
}
