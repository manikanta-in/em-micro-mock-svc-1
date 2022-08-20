package eyemed.group.model.dto.groups;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public class SubGroupCksResponseDto implements Serializable {

    public Map<String, Set<String>> getSubGroupCks() {
        return subGroupCks;
    }

    public void setSubGroupCks(Map<String, Set<String>> subGroupCks) {
        this.subGroupCks = subGroupCks;
    }

    private Map<String,Set<String>> subGroupCks;
}
