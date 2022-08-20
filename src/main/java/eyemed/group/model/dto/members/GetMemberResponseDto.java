package eyemed.group.model.dto.members;

import eyemed.group.model.dto.benefits.AmountLimitDto;
import eyemed.group.model.dto.benefits.MemberBenefitsResultsDto;

/**
 * Created by c09368 on 11/8/2018.
 */
public class GetMemberResponseDto {

    GetMemberResultsDto member;
    MemberBenefitsResultsDto benefits;
    AmountLimitDto amountLimit;

    public GetMemberResponseDto(){
        super();

    }

    public GetMemberResultsDto getMember() {
        return member;
    }

    public void setMember(GetMemberResultsDto member) {
        this.member = member;
    }

    public MemberBenefitsResultsDto getBenefits() {
        return benefits;
    }

    public void setBenefits(MemberBenefitsResultsDto benefits) {
        this.benefits = benefits;
    }

    public AmountLimitDto getAmountLimit() {
        return amountLimit;
    }

    public void setAmountLimit(AmountLimitDto amountLimit) {
        this.amountLimit = amountLimit;
    }
}
