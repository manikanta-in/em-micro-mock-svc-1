package eyemed.group.model.dto;

import eyemed.group.model.dto.applications.ClientApplicationRecipientDto;

import java.util.List;

public class BatchRequestDto{

    private List<ClientApplicationRecipientDto> addList;
    private List<ClientApplicationRecipientDto> delList;
    private List<ClientApplicationRecipientDto> updList;

    public List<ClientApplicationRecipientDto> getAddList() {
        return addList;
    }

    public void setAddList(List<ClientApplicationRecipientDto> addList) {
        this.addList = addList;
    }

    public List<ClientApplicationRecipientDto> getDelList() {
        return delList;
    }

    public void setDelList(List<ClientApplicationRecipientDto> delList) {
        this.delList = delList;
    }

    public List<ClientApplicationRecipientDto> getUpdList() {
        return updList;
    }

    public void setUpdList(List<ClientApplicationRecipientDto> updList) {
        this.updList = updList;
    }
}

