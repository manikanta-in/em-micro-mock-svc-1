package eyemed.group.model.dto.groups.maintenance;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;


public class AddressDto implements Serializable {

    private static final long serialVersionUID = 5478408254094946435L;

    private String line1, line2, line3, city, state, zip, county, countryCode, type, foreignIndicator, phone, email;

    public AddressDto() {
        super();
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1( final String line1 ) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2( final String line2 ) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3( final String line3 ) {
        this.line3 = line3;
    }

    public String getCity() {
        return city;
    }

    public void setCity( final String city ) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState( final String state ) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip( final String zip ) {
        this.zip = zip;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty( final String county ) {
        this.county = county;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getType() {
        return this.type;
    }

    public void setType( final String type ) {
        this.type = type;
    }

    public String getForeignIndicator() { return this.foreignIndicator; }

    public void setForeignIndicator( final String foreignIndicator) { this.foreignIndicator = foreignIndicator; }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString( this );
    }
}