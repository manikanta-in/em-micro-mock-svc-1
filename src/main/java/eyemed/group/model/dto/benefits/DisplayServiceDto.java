package eyemed.group.model.dto.benefits;

import java.util.List;

/**
 * Created by c09368 on 11/26/2018.
 */
public class DisplayServiceDto {
    protected String minServiceId;
    protected String constituentVerbiage;
    protected int displayOrder;
    protected String innMOOP;
    protected String oonMOOP;
    List<OrderedValue> serviceLineDisclaimers;

    public String getMinServiceId() {
        return minServiceId;
    }

    public void setMinServiceId(String minServiceId) {
        this.minServiceId = minServiceId;
    }

    public String getConstituentVerbiage() {
        return constituentVerbiage;
    }

    public void setConstituentVerbiage(String constituentVerbiage) {
        this.constituentVerbiage = constituentVerbiage;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getInnMOOP() {
        return innMOOP;
    }

    public void setInnMOOP(String innMOOP) {
        this.innMOOP = innMOOP;
    }

    public String getOonMOOP() {
        return oonMOOP;
    }

    public void setOonMOOP(String oonMOOP) {
        this.oonMOOP = oonMOOP;
    }

    public List<OrderedValue> getServiceLineDisclaimers() {
        return serviceLineDisclaimers;
    }

    public void setServiceLineDisclaimers(List<OrderedValue> serviceLineDisclaimers) {
        this.serviceLineDisclaimers = serviceLineDisclaimers;
    }
}
