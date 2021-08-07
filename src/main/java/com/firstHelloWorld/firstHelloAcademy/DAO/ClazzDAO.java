package com.firstHelloWorld.firstHelloAcademy.DAO;

import com.firstHelloWorld.firstHelloAcademy.api.Clazz;

import java.util.List;

public interface ClazzDAO {

    List<Clazz> loadClazzes();
    void saveClazz(Clazz clazz);
    Clazz getClazz(int id);
    void update(Clazz clazz);
    void deleteClazz(int id);

}
