package eyemed.group.model.dto.members;

import org.joda.time.DateTime;

/**
 * Created by c09368 on 11/8/2018.
 */
public class EligibilityCategoryDto {

    private int sortOrder;
    private String serviceId, service;
    private DateTime nextEligibleDate;
    private boolean eligible, funded;
    private double remainingBalance;
    private String serviceFrequency;

    public int getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public DateTime getNextEligibleDate() {
        return nextEligibleDate;
    }

    public void setNextEligibleDate(DateTime nextEligibleDate) {
        this.nextEligibleDate = nextEligibleDate;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    public boolean isFunded() {
        return funded;
    }

    public void setFunded(boolean funded) {
        this.funded = funded;
    }

    public double getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(double remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public String getServiceFrequency() {
        return serviceFrequency;
    }

    public void setServiceFrequency(String serviceFrequency) {
        this.serviceFrequency = serviceFrequency;
    }
}
