package eyemed.group.model.dto.reports;

import java.io.Serializable;

/**
 * Created by c09368 on 1/30/2019.
 */
public class CreateEnrollRequestDto implements Serializable {

    private String userId;
    private String groupCk;
    private String subGroupCk;
    private String subGroupCks;
    private String eligibility;
    private String email_id;
    private String create_user;
    private String create_prg;
    private String action;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupCk() {
        return groupCk;
    }

    public void setGroupCk(String groupCk) {
        this.groupCk = groupCk;
    }

    public String getSubGroupCk() {
        return subGroupCk;
    }

    public void setSubGroupCk(String subGroupCk) {
        this.subGroupCk = subGroupCk;
    }

    public String getSubGroupCks() {
        return subGroupCks;
    }

    public void setSubGroupCks(String subGroupCks) {
        this.subGroupCks = subGroupCks;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public String getCreate_prg() {
        return create_prg;
    }

    public void setCreate_prg(String create_prg) {
        this.create_prg = create_prg;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
