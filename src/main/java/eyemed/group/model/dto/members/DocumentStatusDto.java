package eyemed.group.model.dto.members;

import java.io.Serializable;

/**
 * @author Gopu Nanjan
 **/
public class DocumentStatusDto  implements Serializable {

    private String messageCode;
    private String defaultMessage;
    private String contentType;
    private byte[] content;

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
