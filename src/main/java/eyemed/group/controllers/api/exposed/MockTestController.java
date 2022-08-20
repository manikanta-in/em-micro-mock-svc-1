package eyemed.group.controllers.api.exposed;


import eyemed.group.service.RetryService;
import eyemed.group.util.MockUtil;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/api/test")
public class MockTestController {

  @Autowired
  RetryService retryService;

  @GetMapping
  public ResponseEntity<Map<Object, Object>> testRetryApi() {
    String url = "http://localhost:1234" ;
    HttpEntity<String> httpEntity = new HttpEntity<String>("Hello");
    retryService.invokeRetryApi(url,httpEntity,String.class);
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/grids.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }
}
