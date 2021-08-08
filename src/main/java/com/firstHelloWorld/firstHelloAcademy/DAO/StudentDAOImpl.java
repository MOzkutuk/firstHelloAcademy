package com.firstHelloWorld.firstHelloAcademy.DAO;

import com.firstHelloWorld.firstHelloAcademy.api.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private EntityManager entityManager;


    @Override
    @Transactional
    public List<Student> loadStudents() {

        Session session = entityManager.unwrap(Session.class);

        List<Student> theListOfStudent = session.createQuery("from student ").getResultList();

        return theListOfStudent;

    }

    @Override
    @Transactional
    public void saveStudent(Student student) {

        Session session = entityManager.unwrap(Session.class);

        session.save(student);

    }

    @Override
    @Transactional
    public Student getStudent(int id) {

        Session session = entityManager.unwrap(Session.class);

        return session.get(Student.class,id);

    }

    @Override
    @Transactional
    public void update(Student student) {

        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(student);

    }

    @Override
    @Transactional
    public void deleteStudent(int id) {

        Session session = entityManager.unwrap(Session.class);

        String qryString = "delete from student s where s.id=:sId";

        Query query = session.createQuery(qryString);

        query.setParameter("sId", id);

        int count2 = query.executeUpdate();

        System.out.println(count2 + " Record(s) Deleted.");

    }
}
