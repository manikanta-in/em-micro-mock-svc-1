package eyemed.group.controllers.api.exposed;


import eyemed.group.util.MockUtil;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/agg/accounts/")
public class MockAggAccountController {


  @GetMapping(value = "/relationship/{id}")
  public ResponseEntity<Map<Object, Object>> getRelationShip(@PathVariable String id) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/accounts/relationShip.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }
}
