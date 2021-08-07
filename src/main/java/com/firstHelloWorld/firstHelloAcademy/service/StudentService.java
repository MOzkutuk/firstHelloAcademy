package com.firstHelloWorld.firstHelloAcademy.service;

import com.firstHelloWorld.firstHelloAcademy.api.Student;
import java.util.List;

public interface StudentService {

    List<Student> loadStudents();
    void saveStudent(Student student);
    Student getStudent(int id);
    void update(Student student);
    void deleteStudent(int id);

}
