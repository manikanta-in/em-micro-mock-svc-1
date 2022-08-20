package eyemed.group.controllers.api.exposed;

import eyemed.group.entity.BalDirectorReport;
import eyemed.group.entity.BalPendingReturnQtyTest;
import eyemed.group.service.BalDirectorReportService;
import eyemed.group.util.MockUtil;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.jeasy.random.FieldPredicates;
import org.jeasy.random.randomizers.time.ZonedDateTimeRandomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalDirectorReportController {

  @Autowired
  BalDirectorReportService balDirectorReportService;

  EasyRandom easyRandom;

  public BalDirectorReportController() {
    // Initialize EasyRandom
    EasyRandomParameters parameters =
        new EasyRandomParameters()
            // Limit collection size to save on space
            .collectionSizeRange(1, 3)
            // Limit strings sizes to save on space
            .stringLengthRange(5, 10)
            // Exclude read-only UUID fields in the request objects
            .excludeField(FieldPredicates.ofType(UUID.class))
            .excludeField(FieldPredicates.ofType(Collection.class))
            // Ensure the ZonedDateTime fields generated by EasyRandom are UTC based; Otherwise, EasyRandom
            // will use the timezone of the system which can lead to mismatches
            .randomize(FieldPredicates.ofType(ZonedDateTime.class),
                () -> new ZonedDateTimeRandomizer()
                    .getRandomValue()
                    .withZoneSameLocal(ZoneId.of("UTC")));

    easyRandom = new EasyRandom(parameters);
  }

  @GetMapping(value = "/balDirectorReport")
  public ResponseEntity<BalDirectorReport> flightTotals() {
    BalDirectorReport balDirectorReport = easyRandom.nextObject(BalDirectorReport.class);
    balDirectorReportService.saveBalDirectory(balDirectorReport);
    return new ResponseEntity<BalDirectorReport>(balDirectorReport, HttpStatus.OK);
  }

  @GetMapping(value = "/balPendingReturnQty")
  public ResponseEntity<BalPendingReturnQtyTest> balPendingReturnQty() {
    BalPendingReturnQtyTest balDirectorReport = easyRandom.nextObject(BalPendingReturnQtyTest.class);
    balDirectorReportService.saveBalPendingReturnQtyTest(balDirectorReport);
    return new ResponseEntity<BalPendingReturnQtyTest>(balDirectorReport, HttpStatus.OK);
  }
}