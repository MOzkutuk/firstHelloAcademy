package com.firstHelloWorld.firstHelloAcademy.service;

import com.firstHelloWorld.firstHelloAcademy.api.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> loadTeachers();
    void saveTeacher(Teacher teacher);
    Teacher getTeacher(int id);
    void update(Teacher teacher);
    void deleteTeacher(int id);

}
