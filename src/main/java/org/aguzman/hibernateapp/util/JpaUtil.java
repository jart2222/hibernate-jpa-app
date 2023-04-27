package org.aguzman.hibernateapp.util;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory entityManagerFactory=buildEntityManagerFactory();
    //el factory es unico para toda la aplicacion(singlenton)
    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("ejemploJPA");
    }

    //el manager se genera cada que se invoca el metodo
    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }
}
