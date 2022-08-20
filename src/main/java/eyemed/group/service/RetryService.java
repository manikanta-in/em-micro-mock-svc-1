package eyemed.group.service;

import java.util.concurrent.atomic.AtomicInteger;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class RetryService {

  private final RestTemplate restTemplate;
  private final RetryTemplate retryTemplate;


  public  <T> ResponseEntity<T> invokeRetryApi(String url,  HttpEntity<?> httpEntity, Class<T> responseType) {
    AtomicInteger retryCount = new AtomicInteger();
    return retryTemplate.execute(context -> {
      retryCount.getAndIncrement();
      log.info("retryCount :: "+retryCount);
      try {
        return restTemplate.exchange(url, HttpMethod.POST, httpEntity, responseType);
      }catch (Exception e) {
        log.error(e.getMessage());
        throw e;
      }
    });
  }

}
