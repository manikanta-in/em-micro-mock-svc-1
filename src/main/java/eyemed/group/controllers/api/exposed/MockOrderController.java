package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order/api/")
public class MockOrderController {

    @SneakyThrows
    @PostMapping(value = "order/equity")
    public ResponseEntity<Map<Object, Object>> gridSearch(@RequestBody Map data) throws InterruptedException {
        //Thread.sleep(20000);
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/grids.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }
}
