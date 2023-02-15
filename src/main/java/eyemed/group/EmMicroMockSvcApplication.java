package eyemed.group;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

@SpringBootApplication
public class EmMicroMockSvcApplication {

    public static void main(String[] args) {
        System.out.println(null + "ddd");
        SpringApplication.run(EmMicroMockSvcApplication.class, args);
    }

}
