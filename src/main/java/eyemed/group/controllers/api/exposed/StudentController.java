package eyemed.group.controllers.api.exposed;


import eyemed.group.entity.Student;
import eyemed.group.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/public/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student request) {
        studentService.save(request);
        return new ResponseEntity<Student>(request, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        List<Student> students =  studentService.findAll();
        return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
    }
}
