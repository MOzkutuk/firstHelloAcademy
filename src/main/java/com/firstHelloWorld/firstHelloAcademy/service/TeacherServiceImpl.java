package com.firstHelloWorld.firstHelloAcademy.service;

import com.firstHelloWorld.firstHelloAcademy.DAO.TeacherDAO;
import com.firstHelloWorld.firstHelloAcademy.api.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherDAO teacherDAO;

    @Override
    @Transactional
    public List<Teacher> loadTeachers() {
        return teacherDAO.loadTeachers();
    }

    @Override
    @Transactional
    public void saveTeacher(Teacher teacher) {

        teacherDAO.saveTeacher(teacher);

    }

    @Override
    @Transactional
    public Teacher getTeacher(int id) {
        return teacherDAO.getTeacher(id);
    }

    @Override
    @Transactional
    public void update(Teacher teacher) {

        teacherDAO.update(teacher);

    }

    @Override
    @Transactional
    public void deleteTeacher(int id) {

        teacherDAO.deleteTeacher(id);

    }
}
