package eyemed.group.model.dto.members;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c09368 on 2/4/2019.
 */
public class ResponseMemberAddressDto {
    List<AddressDto> addresses;

    public ResponseMemberAddressDto (){
        this.addresses = new ArrayList<>();
    }

    public List<AddressDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDto> addresses) {
        this.addresses = addresses;
    }
}
