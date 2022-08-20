package eyemed.group.model.dto.applications;

import java.util.List;

public class QuoteDto {
    private String quoteId;
    private List<QuoteLineItem> quoteLineItems;

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public List<QuoteLineItem> getQuoteLineItems() {
        return quoteLineItems;
    }

    public void setQuoteLineItems(List<QuoteLineItem> quoteLineItems) {
        this.quoteLineItems = quoteLineItems;
    }

}
