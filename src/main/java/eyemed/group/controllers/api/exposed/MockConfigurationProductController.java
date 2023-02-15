package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/configurator-product")
public class MockConfigurationProductController {

  @GetMapping(value = "/buffer/exceptions")
  public ResponseEntity<Map<Object, Object>> bufferExceptions() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/configuration/exceptions.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/product/exceptions1")
  public ResponseEntity<Map<Object, Object>> productExceptions() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/configuration/exceptions.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }
}
