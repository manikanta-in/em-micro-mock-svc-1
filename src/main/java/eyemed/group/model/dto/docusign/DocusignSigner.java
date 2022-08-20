package eyemed.group.model.dto.docusign;

public class DocusignSigner {
    private String name;
    private String email;
    private String clientId;

    public DocusignSigner() {
    }

    public DocusignSigner(String name, String email, String clientId) {
        this.name = name;
        this.email = email;
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
