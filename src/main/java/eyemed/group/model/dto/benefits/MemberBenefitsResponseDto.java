package eyemed.group.model.dto.benefits;

/**
 * Created by c09368 on 11/28/2018.
 */
public class MemberBenefitsResponseDto {
    MemberBenefitsResultsDto benefits;

    public MemberBenefitsResultsDto getBenefits() {
        return benefits;
    }

    public void setBenefits(MemberBenefitsResultsDto benefits) {
        this.benefits = benefits;
    }
}
