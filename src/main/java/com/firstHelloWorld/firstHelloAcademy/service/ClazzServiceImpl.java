package com.firstHelloWorld.firstHelloAcademy.service;

import com.firstHelloWorld.firstHelloAcademy.DAO.ClazzDAO;
import com.firstHelloWorld.firstHelloAcademy.api.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService{

    @Autowired
    private ClazzDAO clazzDAO;

    @Override
    @Transactional
    public List<Clazz> loadClazzes() {
        return clazzDAO.loadClazzes();
    }

    @Override
    @Transactional
    public void saveClazz(Clazz clazz) {

        clazzDAO.saveClazz(clazz);

    }

    @Override
    @Transactional
    public Clazz getClazz(int id) {
        return clazzDAO.getClazz(id);
    }

    @Override
    @Transactional
    public void update(Clazz clazz) {

        clazzDAO.update(clazz);

    }

    @Override
    @Transactional
    public void deleteClazz(int id) {

        clazzDAO.deleteClazz(id);

    }
}
