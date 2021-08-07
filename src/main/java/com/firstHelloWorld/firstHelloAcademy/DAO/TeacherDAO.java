package com.firstHelloWorld.firstHelloAcademy.DAO;

import com.firstHelloWorld.firstHelloAcademy.api.Teacher;

import java.util.List;

public interface TeacherDAO {

    //creating DAO methods

    List<Teacher> loadTeachers();
    void saveTeacher(Teacher teacher);
    Teacher getTeacher(int id);
    void update(Teacher teacher);
    void deleteTeacher(int id);

}
