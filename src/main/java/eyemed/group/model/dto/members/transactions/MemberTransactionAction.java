package eyemed.group.model.dto.members.transactions;

public enum MemberTransactionAction {

    ADD_SUBSCRIBER("AddSub", "Add Subscriber"),
    ADD_DEPENDENT("AddDep", "Add Dependent"),
    UPDATE_SUBSCRIBER("UpdateSub", "Update Subscriber"),
    UPDATE_DEPENDENT("UpdateDep", "Update Dependent"),
    REIN_SUBSCRIBER("ReinstateSub", "Reinstate Subscriber"),
    REIN_DEPENDENT("ReinstateDep", "Reinstate Dependent"),
    TERM_SUBSCRIBER("TerminateSub", "Terminate Subscriber"),
    TERM_DEPENDENT("TerminateDep", "Terminate Dependent"),
    UPDATE_MEMBER("UpdateMbr", "Update Member"),
    NO_SAVE("NoSave","No Save"),
    SIMPLE_SAVE("SimpleSave", "Simple Save"),
    MOVE("MoveOnly", "Move"),
    MOVE_UPDATE("MoveAndUpdate", "Move And Update"),
    TRANSFER("TransferOnly", "Transfer"),
    TRANSFER_UPDATE("TransferAndUpdate", "Transfer And Update"),
    REINSTATE_MOVE_UPDATE("ReInstateAndMoveAndUpdate", "ReInstate,Move And Update"),
    REINSTATE_MOVE("ReInstateAndMove", "ReInstate And Move"),
    REINSTATE_TRANSFER_UPDATE("ReInstateAndTransferAndUpdate", "ReInstate,Transfer And Update"),
    REINSTATE_TRANSFER("ReInstateAndTransfer", "ReInstate And Transfer"),
    REINSTATE_UPDATE("ReInstateAndUpdate", "ReInstate And Update"),
    REINSTATE("ReInstateOnly", "ReInstate"),
    VOID("VoidOnly", "Void");






    private String code;
    private String description;

    MemberTransactionAction(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return description;
    }

}
