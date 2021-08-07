package com.firstHelloWorld.firstHelloAcademy.DAO;

import com.firstHelloWorld.firstHelloAcademy.api.Subject;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SubjectDAOImpl implements SubjectDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Subject> loadSubjects() {

        Session session = entityManager.unwrap(Session.class);

        List<Subject> theListOfSubject = session.createQuery("from subject ").getResultList();

        return theListOfSubject;
    }

    @Override
    @Transactional
    public void saveSubject(Subject subject) {

        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(subject);

    }

    @Override
    @Transactional
    public Subject getSubject(int id) {

        Session session = entityManager.unwrap(Session.class);

        Subject subject = session.get(Subject.class,id);

        return subject;
    }

    @Override
    @Transactional
    public void update(Subject subject) {

        Session session = entityManager.unwrap(Session.class);

        session.update(subject);

    }

    @Override
    @Transactional
    public void deleteSubject(int id) {

        Session session = entityManager.unwrap(Session.class);

        Subject subjectToDelete = session.get(Subject.class,id);

        session.delete(subjectToDelete);

    }
}
