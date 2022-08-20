package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 11/8/2018.
 */
public class LatestFamilyCoverageDates {

    private String memberCK;
    private DateTime latestMemberEffectiveDate;

    public String getMemberCK() {
        return memberCK;
    }

    public void setMemberCK(String memberCK) {
        this.memberCK = memberCK;
    }

    public DateTime getLatestMemberEffectiveDate() {
        return latestMemberEffectiveDate;
    }

    public void setLatestMemberEffectiveDate(DateTime latestMemberEffectiveDate) {
        this.latestMemberEffectiveDate = latestMemberEffectiveDate;
    }
}
