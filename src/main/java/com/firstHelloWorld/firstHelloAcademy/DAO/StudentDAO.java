package com.firstHelloWorld.firstHelloAcademy.DAO;


import com.firstHelloWorld.firstHelloAcademy.api.Student;
import java.util.List;

public interface StudentDAO {

    //creating DAO methods

    List<Student> loadStudents();
    void saveStudent(Student student);
    Student getStudent(int id);
    void update(Student student);
    void deleteStudent(int id );

}
