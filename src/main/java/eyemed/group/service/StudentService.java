package eyemed.group.service;

import eyemed.group.entity.Student;

import java.util.List;

public interface StudentService {

    public void save(Student student);

    public List<Student> findAll();
}
