package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rest/report")
public class MockPmrController {

    @GetMapping(value = "/GetSummaryDashboardTable")
    public ResponseEntity<Map<Object, Object>> groups() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/GetSummaryDashboardTable.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/summary/refresh")
    public ResponseEntity<Map<Object, Object>> summaryRefresh() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/summaryRefresh.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/events/EventDetails")
    public ResponseEntity<Map<Object, Object>> eventDetails() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/GridDetails.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


}

