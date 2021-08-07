package com.firstHelloWorld.firstHelloAcademy.service;

import com.firstHelloWorld.firstHelloAcademy.api.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> loadSubjects();
    void saveSubject(Subject subject);
    Subject getSubject(int id);
    void update(Subject subject);
    void deleteSubject(int id);


}
