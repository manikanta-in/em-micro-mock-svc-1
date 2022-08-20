package eyemed.group.controllers.api.exposed;


import eyemed.group.util.MockUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/private")
public class MockPrivateController {

    @GetMapping(value = "/groups")
    public ResponseEntity<Map<Object, Object>> groups() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/groups.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/invoices")
    public ResponseEntity<Map<Object, Object>> invoices() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/invoices.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


    @GetMapping(value = "/configurations")
    public ResponseEntity<Map<Object, Object>> configurations() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/configurations.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


    @GetMapping(value = "/parent-groups/{id}/events")
    public ResponseEntity<Map<Object, Object>> parentGroups(@PathVariable String id) {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/parentgroups.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


    @GetMapping(value = "/session")
    public ResponseEntity<Map<Object, Object>> session() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/session.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/groups/{grpId}/subgroups/{subGrpId}")
    public ResponseEntity<Map<Object, Object>> subgroups(@PathVariable String grpId,@PathVariable String subGrpId) {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/subgroups.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


}
