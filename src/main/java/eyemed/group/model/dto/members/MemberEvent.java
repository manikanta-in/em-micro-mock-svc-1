package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 12/6/2018.
 */
public class MemberEvent {

    private String memberCK, groupCK, eligibilityType, cspd, cspi, voidInd;
    private DateTime effDate, insqDate;

    public String getMemberCK() {
        return memberCK;
    }

    public void setMemberCK(String memberCK) {
        this.memberCK = memberCK;
    }

    public String getGroupCK() {
        return groupCK;
    }

    public void setGroupCK(String groupCK) {
        this.groupCK = groupCK;
    }

    public String getEligibilityType() {
        return eligibilityType;
    }

    public void setEligibilityType(String eligibilityType) {
        this.eligibilityType = eligibilityType;
    }

    public String getCspd() {
        return cspd;
    }

    public void setCspd(String cspd) {
        this.cspd = cspd;
    }

    public String getCspi() {
        return cspi;
    }

    public void setCspi(String cspi) {
        this.cspi = cspi;
    }

    public String getVoidInd() {
        return voidInd;
    }

    public void setVoidInd(String voidInd) {
        this.voidInd = voidInd;
    }

    public DateTime getEffDate() {
        return effDate;
    }

    public void setEffDate(DateTime effDate) {
        this.effDate = effDate;
    }

    public DateTime getInsqDate() {
        return insqDate;
    }

    public void setInsqDate(DateTime insqDate) {
        this.insqDate = insqDate;
    }
}
