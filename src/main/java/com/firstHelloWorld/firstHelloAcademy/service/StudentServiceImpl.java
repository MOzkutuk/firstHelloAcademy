package com.firstHelloWorld.firstHelloAcademy.service;

import com.firstHelloWorld.firstHelloAcademy.DAO.StudentDAO;
import com.firstHelloWorld.firstHelloAcademy.api.Clazz;
import com.firstHelloWorld.firstHelloAcademy.api.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> loadStudents() {
        return studentDAO.loadStudents();
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {

        studentDAO.saveStudent(student);

    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public void update(Student student) {

        studentDAO.update(student);

    }

    @Override
    @Transactional
    public void deleteStudent(int id) {

        studentDAO.deleteStudent(id);

    }
}
