package eyemed.group.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CaaSEncryptionResponse {

  private String cipher;
  private String requestId;

  public String getCipher() {
    return cipher;
  }

  public CaaSEncryptionResponse setCipher(String cipher) {
    this.cipher = cipher;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public CaaSEncryptionResponse setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }
}
