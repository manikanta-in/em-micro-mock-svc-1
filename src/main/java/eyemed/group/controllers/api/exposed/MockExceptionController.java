package eyemed.group.controllers.api.exposed;

import eyemed.group.controllers.api.exceptions.ApiException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exception")
public class MockExceptionController {

    @GetMapping(value = "/authentication")
    public ResponseEntity<Object> authenticateUser()  {
       throw new ApiException("getting Authentication exception");
    }
}
