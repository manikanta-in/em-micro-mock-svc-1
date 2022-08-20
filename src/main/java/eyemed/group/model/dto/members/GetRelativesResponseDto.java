package eyemed.group.model.dto.members;

import eyemed.group.model.dto.CodeDataDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 11/13/2018.
 */
public class GetRelativesResponseDto {
    private int returnCode;
    private List<CodeDataDto> statuses;
    private List<RelatedMemberServiceDto> relatedMemberDtoList;

    public GetRelativesResponseDto(){
        relatedMemberDtoList = new ArrayList<>();
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

    public List<RelatedMemberServiceDto> getRelatedMemberDtoList() {
        return relatedMemberDtoList;
    }

    public void setRelatedMemberDtoList(List<RelatedMemberServiceDto> relatedMemberDtoList) {
        this.relatedMemberDtoList = relatedMemberDtoList;
    }
}
