/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sjsu.mybus.model;

import javax.persistence.*;

/**
 *
 * @author aldok
 */
public class BusDAO {

    private EntityManagerFactory emf;

    private EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("MyBusPU");
        }

        return emf.createEntityManager();
    }

    public Bus[] getBuses() {

        EntityManager em = getEntityManager();

        try {
            javax.persistence.Query q = em.createQuery("select c from bus as c");
            return (Bus[]) q.getResultList().toArray(new Bus[0]);
        } finally {
            em.close();
        }
    }
}
