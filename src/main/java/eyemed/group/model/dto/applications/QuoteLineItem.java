package eyemed.group.model.dto.applications;

public class QuoteLineItem {
    private boolean planActive;
    private String quoteLineItemId;
    private String sfQuoteLineItemRelationId;

    public void setPlanActive(boolean planActive) {
        this.planActive = planActive;
    }

    public boolean getPlanActive() {
        return planActive;
    }

    public void setQuoteLineItemId(String quoteLineItemId) {
        this.quoteLineItemId = quoteLineItemId;
    }

    public String getQuoteLineItemId() {
        return quoteLineItemId;
    }

    public void setSfQuoteLineItemRelationId(String sfQuoteLineItemRelationId) {
        this.sfQuoteLineItemRelationId = sfQuoteLineItemRelationId;
    }

    public String getSfQuoteLineItemRelationId() {
        return sfQuoteLineItemRelationId;
    }
}
