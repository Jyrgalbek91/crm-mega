package impl;

import model.Student;

public interface StudentDao {
    void save(Student student);

    Student[] findAll();
}


