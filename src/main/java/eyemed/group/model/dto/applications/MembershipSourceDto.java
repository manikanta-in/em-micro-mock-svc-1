
package eyemed.group.model.dto.applications;

public class MembershipSourceDto {

    private String format;
    private String source;
    private String includeCobraIndicator;
    private String cobraNotes;
    private String tpaCompanyName;
    private ContactExtendedDto contact = new ContactExtendedDto();
    private String cobraFormat;
    private String cobraSource;
    private String cobraTpaCompanyName;
    private ContactExtendedDto cobraContact = new ContactExtendedDto();

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getIncludeCobraIndicator() {
        return includeCobraIndicator;
    }

    public void setIncludeCobraIndicator(String includeCobraIndicator) {
        this.includeCobraIndicator = includeCobraIndicator;
    }

    public String getCobraNotes() {
        return cobraNotes;
    }

    public void setCobraNotes(String cobraNotes) {
        this.cobraNotes = cobraNotes;
    }

    public String getTpaCompanyName() {
        return tpaCompanyName;
    }

    public void setTpaCompanyName(String tpaCompanyName) {
        this.tpaCompanyName = tpaCompanyName;
    }

    public ContactExtendedDto getContact() {
        return contact;
    }

    public void setContact(ContactExtendedDto contact) {
        this.contact = contact;
    }

    public String getCobraFormat() {
        return cobraFormat;
    }

    public void setCobraFormat(String cobraFormat) {
        this.cobraFormat = cobraFormat;
    }

    public String getCobraSource() {
        return cobraSource;
    }

    public void setCobraSource(String cobraSource) {
        this.cobraSource = cobraSource;
    }

    public String getCobraTpaCompanyName() {
        return cobraTpaCompanyName;
    }

    public void setCobraTpaCompanyName(String cobraTpaCompanyName) {
        this.cobraTpaCompanyName = cobraTpaCompanyName;
    }

    public ContactExtendedDto getCobraContact() {
        return cobraContact;
    }

    public void setCobraContact(ContactExtendedDto cobraContact) {
        this.cobraContact = cobraContact;
    }
}
