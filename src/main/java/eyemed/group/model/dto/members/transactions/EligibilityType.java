package eyemed.group.model.dto.members.transactions;

import java.io.Serializable;

/**
 * Created by c09368 on 1/10/2019.
 */
public enum EligibilityType implements Serializable {
    VoidMember, VoidSubscriber, Reinstate, ReinstateFamily, No_Reinstate, EligibilityChanged, EnrollDateChange;
}

