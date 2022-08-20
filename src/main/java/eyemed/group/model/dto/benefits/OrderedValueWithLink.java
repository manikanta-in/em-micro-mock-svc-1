package eyemed.group.model.dto.benefits;

import java.util.Comparator;

/**
 * Created by c09368 on 11/26/2018.
 */
public class OrderedValueWithLink  extends OrderedValue implements Comparator<OrderedValueWithLink> {

    private String link;

    public String getLink() {

        return link;
    }

    public void setLink(String link) {

        this.link = link;
    }

    public int compare(OrderedValueWithLink orderedValue, OrderedValueWithLink orderedValue2) {
        return orderedValue.getOrder().compareTo(orderedValue2.getOrder());
    }
}
