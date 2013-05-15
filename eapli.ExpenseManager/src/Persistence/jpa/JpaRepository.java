/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.jpa;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Diogo Leite
 */
public abstract class JpaRepository<T, PK extends Serializable> {

    @PersistenceUnit
    static protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("eapli.expensesPU");

    protected EntityManager getEntityManager() {

        EntityManager entityManager = emf.createEntityManager();
        return entityManager;
    }
    protected Class<T> entityClass;

    public JpaRepository() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }

    public T save(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException();
        }
        EntityManager em = getEntityManager();
        assert em != null;
        try {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                em.persist(entity);
                tx.commit();
            } catch (PersistenceException ex) {
                tx = em.getTransaction();
                tx.begin();
                entity = em.merge(entity);
                tx.commit();
            } 
        }
            finally {
                em.close();
            }
        
            return entity;
        }

    }
