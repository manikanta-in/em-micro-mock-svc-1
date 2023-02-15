package eyemed.group.controllers.api.exposed;

import eyemed.group.model.NersData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import eyemed.group.model.PatchEntity;
import eyemed.group.util.MockUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ners")
public class MockNersController {


  @GetMapping
  public ResponseEntity<List<NersData>> findAll() {
    List<NersData> dataList = new ArrayList<>();
    NersData nersData = new NersData();
    nersData.setId(1);
    nersData.setName("TEST");
    nersData.setDescription("TEST DESC");
    NersData nersData1 = new NersData();
    nersData1.setId(1);
    nersData1.setName("TEST");
    nersData1.setDescription("TEST DESC");
    dataList.add(nersData);
    dataList.add(nersData1);
    return new ResponseEntity<List<NersData>>(dataList, HttpStatus.OK);
  }


    @PatchMapping
    public ResponseEntity<Void> patch(@RequestBody List<PatchEntity> req) {
        System.out.println(req);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
