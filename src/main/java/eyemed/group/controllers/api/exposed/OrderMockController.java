package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import java.util.List;
import java.util.Map;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OrderMockController {

  @SneakyThrows
  @GetMapping(value = "/api/auth")
  public ResponseEntity<Map<Object, Object>> authSearch() throws InterruptedException {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/order/auth.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }


  @SneakyThrows
  @GetMapping(value = "/api/identity/me")
  public ResponseEntity<Map<Object, Object>> identity() throws InterruptedException {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/order/identity.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/api/get-feature-toggles")
  public ResponseEntity<Map<Object, Object>> featureToggels(@RequestBody Map data) throws InterruptedException {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/order/get-feature-toggles.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/api/permissions")
  public ResponseEntity<List<Map<Object, Object>>> adminRoles(@RequestBody Map data) throws InterruptedException {
    List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/order/admin-roles.json");
    return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/api/permissions")
  public ResponseEntity<List<Map<Object, Object>>> getAdminRoles() throws InterruptedException {
    List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/order/admin-roles.json");
    return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/api/get-user-roles")
  public ResponseEntity<Map<Object, Object>> userRoles(@RequestBody Map data) throws InterruptedException {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/order/user-roles.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/api/search")
  public ResponseEntity<Map<Object, Object>> search(@RequestBody Map data) throws InterruptedException {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/order/search.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }



}
