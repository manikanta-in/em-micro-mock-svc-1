package eyemed.group.controllers.api.towers;

import eyemed.group.util.MockUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class ClaimsPublicController {

    @GetMapping(value = "/v0/ciam-public/me")
    public ResponseEntity<Map<Object, Object>> publicClaims() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/towers/ciam-public.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


    //architecture-reference-implementations_echo-oauth-token/echo

    @GetMapping(value = "/v0/architecture-reference-implementations_echo-oauth-token/echo")
    public ResponseEntity<Map<Object, Object>> architectureReferenceImplementations() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/towers/ciam-public.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


    @PostMapping(value = "v0/workflow/v1/api/task/findAllByCriteria")
    public ResponseEntity<Map<Object, Object>> findAllByCriteria(@RequestBody Map data) {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/towers/task.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }

    @PostMapping(value = "v0/reference/v1/account/searchAccountByFilters")
    public ResponseEntity<List<Map<Object, Object>>> searchAccountByFilters(@RequestBody Map data) {
        List<Map<Object, Object>>  response = MockUtil.convertJsonIntoListMap("mock/towers/searchAccounts.json");
        return new ResponseEntity<List<Map<Object, Object>> >(response, HttpStatus.OK);
    }

    @GetMapping(value = "v0/investmentproduct/v1/account/search/accountId/2159")
    public ResponseEntity<Map<Object, Object>> investmentproducts() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/towers/investmentproducts.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


}
