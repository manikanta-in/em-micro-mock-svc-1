package eyemed.group.model.dto.members;

import eyemed.group.model.dto.CodeDataDto;

import java.util.ArrayList;
import java.util.List;

public class ResultsDto extends AbstractResults {

    private int returnCode;
    private List<CodeDataDto> statuses;
    private String memberCK, subscriberCK, subscriberId, groupCK;

    /** Initialized this ResultDto */
    public ResultsDto() {
        this( null );
    }

    /** Initialized this ResultDto */
    public ResultsDto( final String operation ) {
        super();
        this.statuses = new ArrayList<>();
        this.setOperation(operation);
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public List<CodeDataDto> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<CodeDataDto> statuses) {
        this.statuses = statuses;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getMemberCK() {
        return memberCK;
    }

    public void setMemberCK(String memberCK) {
        this.memberCK = memberCK;
    }

    public String getSubscriberCK() {
        return subscriberCK;
    }

    public void setSubscriberCK(String subscriberCK) {
        this.subscriberCK = subscriberCK;
    }

    public String getGroupCK() {
        return groupCK;
    }

    public void setGroupCK(String groupCK) {
        this.groupCK = groupCK;
    }
}
