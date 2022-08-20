package eyemed.group.service;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import eyemed.group.model.CaaSEncryptionResponse;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
public class RetryServiceTest {

  private final String CAAS_URL = "caasUrl";
  private final String BACKUP_URL = "caasBackUpUrl";
  private final String ENC_CONTEXT = "caasEncryptContext";
  private final String REQUEST_ID = "request_id";
  private final String CIPHER = "cipher-value-1912-pRiYaThAm";

  @InjectMocks
  RetryService retryService;


  @Mock
  RetryTemplate retryTemplate;

  @Mock
  RestTemplate restTemplate;


  @Test
  public void testInvokeRetryApi() throws Exception {
    when(retryTemplate.execute(any(RetryCallback.class), any(), any())).thenAnswer(invocation -> {
      RetryCallback retry = invocation.getArgument(0);
      return retry.doWithRetry(null);
    });
    when(restTemplate.exchange(anyString(), any(HttpMethod.class),
        any(HttpEntity.class), any(Class.class)))
        .thenReturn(new ResponseEntity<>(new CaaSEncryptionResponse().setCipher(CIPHER).setRequestId(REQUEST_ID),
            HttpStatus.OK));
    HttpHeaders httpHeaders = new HttpHeaders(); // make part of init
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity httpEntity = new HttpEntity("", httpHeaders);
    ResponseEntity<CaaSEncryptionResponse> caaSEncryptionResponse =
        retryService.invokeRetryApi(CAAS_URL, httpEntity, CaaSEncryptionResponse.class);
    assertNotNull(caaSEncryptionResponse.getBody());
    assertEquals(REQUEST_ID, caaSEncryptionResponse.getBody().getRequestId());
    assertEquals(CIPHER, caaSEncryptionResponse.getBody().getCipher());
  }

  @Test
  public void testInvokeRetryApiWithException() {
    when(retryTemplate.execute(any(RetryCallback.class), any(), any())).thenAnswer(invocation -> {
      RetryCallback retry = invocation.getArgument(0);
      return retry.doWithRetry(null);
    });
    when(restTemplate.exchange(anyString(), any(HttpMethod.class),
        any(HttpEntity.class), any(Class.class)))
        .thenThrow(new RuntimeException("Throw Run Time Exception"));
    HttpHeaders httpHeaders = new HttpHeaders(); // make part of init
    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity httpEntity = new HttpEntity("", httpHeaders);
    Throwable exception = assertThrows(RuntimeException.class,
        () -> {
          retryService.invokeRetryApi(CAAS_URL, httpEntity, CaaSEncryptionResponse.class);
        });
    assertNotNull(exception);
    assertEquals(exception.getMessage(), "Throw Run Time Exception");
  }

}
