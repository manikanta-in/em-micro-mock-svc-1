package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/public/users")
public class MockPublicController {


    @GetMapping(value = "/authentication")
    public ResponseEntity<Map<Object, Object>> authentication() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/authentication.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


    @PostMapping(value = "/authentication")
    public ResponseEntity<Map<Object, Object>> saveAuthentication(@RequestBody Map<Object, Object> request) {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/authentication.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }
}
