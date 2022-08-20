package eyemed.group.controllers.api.exposed;


import eyemed.group.util.MockUtil;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1.0/api")
public class JetController {

  @PostMapping(value = "/flight/flighttotals")
  public ResponseEntity<Map<Object, Object>> flightTotals(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/flightTotals.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/flight/flighttotals")
  public ResponseEntity<Map<Object, Object>> getFlightTotals() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/flightTotals.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/flight/flightstatus")
  public ResponseEntity<Map<Object, Object>> flightStatus(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/flightStatus.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }


  @PostMapping(value = "/usersecurity/sessionlogin")
  public ResponseEntity<Map<Object, Object>> sessionLogin(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/sessionlogin.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/utility/rbac/securitygrouproles")
  public ResponseEntity<Map<Object, Object>> securitygrouproles(@RequestBody List<Map> data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/securitygrouproles.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/utility/analytics/loganalytics")
  public ResponseEntity<Map<Object, Object>> loganalytics(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/sessionlogin.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/utility/rbac/useraccesstemplate")
  public ResponseEntity<Map<Object, Object>> useraccesstemplate(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/useraccesstemplate.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/airportprinters/getallaiportcodes")
  public ResponseEntity<Map<Object, Object>> getallaiportcodes(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/getallaiportcodes.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/airportprinters/getallprinters")
  public ResponseEntity<Map<Object, Object>> getallprinters(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/getallprinters.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }


  @PostMapping(value = "/checkin/getagentscurrencycode")
  public ResponseEntity<Map<Object, Object>> getagentscurrencycode(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/getagentscurrencycode.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/usersecurity/initialload")
  public ResponseEntity<Map<Object, Object>> initialload(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/initialload.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }


  @PostMapping(value = "/configvalues/exitrowssr")
  public ResponseEntity<Map<Object, Object>> exitrowssr(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/exitrowssr.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }


  @GetMapping(value = "/usersecurity/positivenote")
  public ResponseEntity<Map<Object, Object>> positivenote() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/positivenote.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/flight/flightsearch")
  public ResponseEntity<Map<Object, Object>> flightsearch(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/flightsearch.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }


  @PostMapping(value = "/usersecurity/refreshtoken")
  public ResponseEntity<Map<Object, Object>> refreshtoken(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/sessionlogin.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/checkin/traveloptions/travelers/travelerslist/awaiting")
  public ResponseEntity<Map<Object, Object>> awaiting() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/awaiting.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/flight/travelerslist/awaiting")
  public ResponseEntity<Map<Object, Object>> travelerslistAwaiting() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/awaiting.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/checkin/traveloptions/travelers/travelerslist/All")
  public ResponseEntity<Map<Object, Object>> travelerslist() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/travelerslist.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/checkin/traveloptions/travelers/travelerslist/accomodated")
  public ResponseEntity<Map<Object, Object>> accomodated() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/accomodated.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @GetMapping(value = "/flight/travelerslist/accomodated")
  public ResponseEntity<Map<Object, Object>> travelerslistAccomodated() {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/accomodated.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/pnrmgmt/itinerary/seatmapdetails/ufd")
  public ResponseEntity<Map<Object, Object>> seatmapdetails(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/ufd.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/flight/customer/action/getguidatgate")
  public ResponseEntity<Map<Object, Object>> getguidatgate(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/guid.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/flight/seat/mgmt/needseat")
  public ResponseEntity<Map<Object, Object>> needseat(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/needseat.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }

  @PostMapping(value = "/flight/pax/additionalinfo")
  public ResponseEntity<Map<Object, Object>> additionalinfo(@RequestBody Map data) {
    Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/jet/additionalinfo.json");
    return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
  }




}
