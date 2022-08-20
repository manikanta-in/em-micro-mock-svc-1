package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 11/8/2018.
 */
public class MaintenanceDto {

    private String type;
    private String userId;
    private String program;
    private DateTime date;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }
}
