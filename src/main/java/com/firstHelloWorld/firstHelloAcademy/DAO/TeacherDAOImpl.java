package com.firstHelloWorld.firstHelloAcademy.DAO;

import com.firstHelloWorld.firstHelloAcademy.api.Teacher;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TeacherDAOImpl implements TeacherDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Teacher> loadTeachers() {

        Session session = entityManager.unwrap(Session.class);

        List<Teacher> theListOfTeacher = session.createQuery("from teacher ").getResultList();

        return theListOfTeacher;
    }

    @Override
    @Transactional
    public void saveTeacher(Teacher teacher) {

        Session session = entityManager.unwrap(Session.class);

        session.save(teacher);

    }

    @Override
    @Transactional
    public Teacher getTeacher(int id) {

        Session session = entityManager.unwrap(Session.class);

        Teacher teacher = session.get(Teacher.class,id);

        return teacher;
    }

    @Override
    @Transactional
    public void update(Teacher teacher) {

        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(teacher);

    }

    @Override
    @Transactional
    public void deleteTeacher(int id) {

        Session session = entityManager.unwrap(Session.class);

        Teacher teacherToDelete = session.get(Teacher.class,id);

        session.delete(teacherToDelete);

    }
}
