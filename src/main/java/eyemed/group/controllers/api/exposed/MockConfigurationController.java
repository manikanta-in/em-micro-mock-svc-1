package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/configurator-node")
public class MockConfigurationController {

  @GetMapping(value = "/getNodeType")
  public ResponseEntity<List<Map<Object, Object>>> getNodeType() {
    List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/configuration/getNodeType.json");
    return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/getDefaultNodeSourcingRules")
  public ResponseEntity<List<Map<Object, Object>>> getDefaultNodeSourcingRules() {
    List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/configuration/getDefaultNodeSourcingRules.json");
    return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/getNodeSubType")
  public ResponseEntity<List<Map<Object, Object>>> getNodeSubType() {
    List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/configuration/getNodeSubType.json");
    return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/getDefaultNewNodeValues")
  public ResponseEntity<Map<Object, Object>> getDefaultNewNodeValues() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/configuration/getDefaultNewNodeValues.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }


  @GetMapping(value = "/user/grouppermissions")
  public ResponseEntity<Map<Object, Object>> grouppermissions() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/configuration/grouppermissions.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/getNodeById")
  public ResponseEntity<Map<Object, Object>> getNodeById() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/configuration/getNodeById.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/getSourcingRulesByNode")
  public ResponseEntity<List<Map<Object, Object>>> getSourcingRulesByNode() {
    List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/configuration/getSourcingRulesByNode.json");
    return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
  }


  @PostMapping(value = "/search/nodeDetailsWithFilters")
  public ResponseEntity<List<Map<Object, Object>>> getNodeDetailsWithFilters() {
    List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/configuration/nodeDetailsWithFilters.json");
    return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/node/advance/details")
  public ResponseEntity<Map<Object, Object>> details() {
    Map<Object, Object> response  = MockUtil.convertJsonIntoMap("mock/configuration/details.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/manage/node/details/fulfillment")
  public ResponseEntity<Map<Object, Object>> fulfillment() {
    Map<Object, Object> response  = MockUtil.convertJsonIntoMap("mock/configuration/fulfillment1.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/manage/node/details/leadTime")
  public ResponseEntity<Map<Object, Object>> leadTime() {
    Map<Object, Object> response  = MockUtil.convertJsonIntoMap("mock/configuration/leadTime1.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

}
