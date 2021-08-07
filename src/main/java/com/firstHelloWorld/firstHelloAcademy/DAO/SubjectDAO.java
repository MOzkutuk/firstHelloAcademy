package com.firstHelloWorld.firstHelloAcademy.DAO;

import com.firstHelloWorld.firstHelloAcademy.api.Subject;

import java.util.List;

public interface SubjectDAO {

    //creating DAO methods

    List<Subject> loadSubjects();
    void saveSubject(Subject subject);
    Subject getSubject(int id);
    void update(Subject subject);
    void deleteSubject(int id);

}
