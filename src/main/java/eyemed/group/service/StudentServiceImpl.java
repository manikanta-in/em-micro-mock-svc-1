package eyemed.group.service;

import eyemed.group.entity.Student;
import eyemed.group.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAll() {
        List<Student> list = new ArrayList<>();
        studentRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
