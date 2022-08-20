package eyemed.group.model.dto.members.search;

import eyemed.group.model.dto.CodeDataDto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 10/8/2018.
 */
public class MemberSearchResponseDto {
    private boolean healthIdMatch;
    private boolean moreResults;
    private boolean subGroupSecurityViolation;
    private boolean ssnMatch;
    private List<MatchingMembersDto> matchingMembers;
    private List<CodeDataDto> statuses;

    public MemberSearchResponseDto(){
        matchingMembers = new ArrayList<>();
        statuses = new ArrayList<>();
    }

    public boolean isHealthIdMatch() {
        return healthIdMatch;
    }

    public void setHealthIdMatch(boolean healthIdMatch) {
        this.healthIdMatch = healthIdMatch;
    }

    public boolean isMoreResults() {
        return moreResults;
    }

    public void setMoreResults(boolean moreResults) {
        this.moreResults = moreResults;
    }

    public boolean isSubGroupSecurityViolation() {
        return subGroupSecurityViolation;
    }

    public void setSubGroupSecurityViolation(boolean subGroupSecurityViolation) {
        this.subGroupSecurityViolation = subGroupSecurityViolation;
    }

    public boolean isSsnMatch() {
        return ssnMatch;
    }

    public void setSsnMatch(boolean ssnMatch) {
        this.ssnMatch = ssnMatch;
    }

    public List<MatchingMembersDto> getMatchingMembers() {
        return matchingMembers;
    }

    public void setMatchingMembers(List<MatchingMembersDto> matchingMembers) {
        this.matchingMembers = matchingMembers;
    }

    public List<CodeDataDto> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<CodeDataDto> statuses) {
        this.statuses = statuses;
    }
}
