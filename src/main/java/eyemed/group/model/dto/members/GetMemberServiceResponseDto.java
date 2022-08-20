package eyemed.group.model.dto.members;

import eyemed.group.model.dto.CodeDataDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/8/2018.
 */
public class GetMemberServiceResponseDto {

    private int returnCode;
    private List<CodeDataDto> statuses;
    MemberDto memberDto;
    List<SubscriberEvent> subscriberEvents;
    List<MemberEvent> memberEvents;

    public GetMemberServiceResponseDto(){
        super();
        this.statuses = new ArrayList<>();
        this.subscriberEvents = new ArrayList<>();
        this.memberEvents = memberEvents;

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

    public MemberDto getMemberDto() {
        return memberDto;
    }

    public void setMemberDto(MemberDto memberDto) {
        this.memberDto = memberDto;
    }

    public List<SubscriberEvent> getSubscriberEvents() {
        return subscriberEvents;
    }

    public void setSubscriberEvents(List<SubscriberEvent> subscriberEvents) {
        this.subscriberEvents = subscriberEvents;
    }

    public List<MemberEvent> getMemberEvents() {
        return memberEvents;
    }

    public void setMemberEvents(List<MemberEvent> memberEvents) {
        this.memberEvents = memberEvents;
    }
}
