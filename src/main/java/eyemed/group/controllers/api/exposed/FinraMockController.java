package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user/v1/")
public class FinraMockController {

    @GetMapping(value = "/profile")
    public ResponseEntity<Map<Object, Object>> profile() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/finra/profile.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }
}
