package eyemed.group.service;

import eyemed.group.model.EkataRiskAnalysisResponse;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.UUID;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.jeasy.random.FieldPredicates;
import org.jeasy.random.randomizers.time.ZonedDateTimeRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EkataResponseTest {

  protected EasyRandom easyRandom;

  @BeforeEach
  public void setUp() {
    EasyRandomParameters parameters =
        new EasyRandomParameters()
            .collectionSizeRange(1, 3)
            .stringLengthRange(5, 16)
            .excludeField(FieldPredicates.ofType(UUID.class))
            .randomize(FieldPredicates.ofType(ZonedDateTime.class),
                () -> new ZonedDateTimeRandomizer()
                    .getRandomValue()
                    .withZoneSameLocal(ZoneId.of("UTC")));

    easyRandom = new EasyRandom(parameters);
  }

  @Test
  public void testInput() {
    EkataRiskAnalysisResponse response = easyRandom.nextObject(EkataRiskAnalysisResponse.class);
    System.out.println(response);
  }
}
