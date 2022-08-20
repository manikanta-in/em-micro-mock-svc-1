package eyemed.group.model.dto.groups;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 10/2/2018.
 */
public class SubGroupResponseDto {

    public List<SubGroupDto> subGroups = new ArrayList<>();

    public List<SubGroupDto> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(List<SubGroupDto> subGroups) {
        this.subGroups = subGroups;
    }
}
