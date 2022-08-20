package eyemed.group.controllers.api.exposed;

import eyemed.group.util.MockUtil;
import lombok.SneakyThrows;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/grids")
public class MockGridController {

    @GetMapping
    public ResponseEntity<Map<Object, Object>> grids() {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/grids.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }

    @SneakyThrows
    @PostMapping
    public ResponseEntity<Map<Object, Object>> gridSearch() throws InterruptedException {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/grids.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }


    @PostMapping(value = "/GridFilterValues")
    public ResponseEntity<List<Map<Object, Object>>> gridFilterValues() {
        List<Map<Object, Object>> response = MockUtil.convertJsonIntoListMap("mock/GridFilterValues.json");
        return new ResponseEntity<List<Map<Object, Object>>>(response, HttpStatus.OK);
    }

    @SneakyThrows
    @GetMapping(value = "/GridDefinitions/{id}")
    public ResponseEntity<Map<Object, Object>> gridDefinitions(@PathVariable("id") String id) throws InterruptedException {
        Map<Object, Object> response = MockUtil.convertJsonIntoMap("mock/grid/GridDefinitions.json");
        return new ResponseEntity<Map<Object, Object>>(response, HttpStatus.OK);
    }
}



