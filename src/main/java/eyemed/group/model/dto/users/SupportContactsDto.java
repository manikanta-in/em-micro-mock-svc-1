package eyemed.group.model.dto.users;

import java.io.Serializable;
import java.util.HashMap;

public class SupportContactsDto implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String groupId;
    private String subject;
    private String category;
    private HashMap<String, Object> attachments;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public HashMap<String, Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(HashMap<String, Object> attachments) {
        this.attachments = attachments;
    }




}

