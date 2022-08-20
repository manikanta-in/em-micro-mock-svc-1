package eyemed.group.model.dto.members.transactions;

/**
 * Created by c09368 on 12/13/2018.
 */
public class MemberCoverageDto {

    private String memberCk;
    private String memberType;
    private String actionType;
    private boolean memberVoided;

    public String getMemberCk() {
        return memberCk;
    }

    public void setMemberCk(String memberCk) {
        this.memberCk = memberCk;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public boolean isMemberVoided() {
        return memberVoided;
    }

    public void setMemberVoided(boolean memberVoided) {
        this.memberVoided = memberVoided;
    }
}
