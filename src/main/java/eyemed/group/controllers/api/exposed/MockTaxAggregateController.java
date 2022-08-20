package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Pattern;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class MockTaxAggregateController {

  @GetMapping(value = "/relationship/{rlshpId}")
  public ResponseEntity<Map<Object, Object>> mockRelationshipData(@PathVariable("rlshpId") @Pattern(regexp = "[0-9]{0,15}", message = "rlshpId is invalid") String rlshpId,
                                                    @RequestParam("sysId") @Pattern(regexp = "[A-Z]{3}", message = "sysId must be 3 letters long and uppercase") String sysId,
                                                    @RequestParam("appName") @Pattern(regexp = "^[a-zA-Z_]+$", message = "appName may only contain letters and underscores") String appName,
                                                    @RequestParam(value = "fromYear",required = false) @Pattern(regexp = "[0-9]{4}", message = "fromYear is invalid") String fromYear,
                                                    @RequestParam(value = "toYear", required = false) @Pattern(regexp = "[0-9]{4}", message = "toYear is invalid") String toYear, HttpServletRequest httpServletReq) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/taxagg/taxrlshp.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }
}
