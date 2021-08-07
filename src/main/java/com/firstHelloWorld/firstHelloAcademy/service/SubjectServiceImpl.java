package com.firstHelloWorld.firstHelloAcademy.service;

import com.firstHelloWorld.firstHelloAcademy.DAO.SubjectDAO;
import com.firstHelloWorld.firstHelloAcademy.api.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    @Transactional
    public List<Subject> loadSubjects() {
        return subjectDAO.loadSubjects();
    }

    @Override
    @Transactional
    public void saveSubject(Subject subject) {

        subjectDAO.saveSubject(subject);

    }

    @Override
    @Transactional
    public Subject getSubject(int id) {
        return subjectDAO.getSubject(id);
    }

    @Override
    @Transactional
    public void update(Subject subject) {

        subjectDAO.update(subject);

    }

    @Override
    @Transactional
    public void deleteSubject(int id) {

        subjectDAO.deleteSubject(id);

    }
}
