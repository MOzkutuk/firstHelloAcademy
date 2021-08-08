package com.firstHelloWorld.firstHelloAcademy.DAO;

import com.firstHelloWorld.firstHelloAcademy.api.Clazz;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ClazzDAOImpl implements ClazzDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Clazz> loadClazzes() {

        Session session = entityManager.unwrap(Session.class);

        List<Clazz> theListOfClazz = session.createQuery("from class ").getResultList();

        return theListOfClazz;
    }

    @Override
    @Transactional
    public void saveClazz(Clazz clazz) {

        Session session = entityManager.unwrap(Session.class);

        session.saveOrUpdate(clazz);

    }

    @Override
    @Transactional
    public Clazz getClazz(int id) {

        Session session = entityManager.unwrap(Session.class);

        Clazz clazz = session.get(Clazz.class,id);

        return clazz;
    }

    @Override
    @Transactional
    public void update(Clazz clazz) {

        Session session = entityManager.unwrap(Session.class);

        session.update(clazz);

    }

    @Override
    @Transactional
    public void deleteClazz(int id) {

        Session session = entityManager.unwrap(Session.class);

        String qryString ="DELETE FROM class c WHERE c.id = :cId";

        Query query = session.createQuery(qryString);

       query.setParameter("cId",id);

       int count = query.executeUpdate();

        System.out.println(count + " Record(s) Deleted.");

    }
}
