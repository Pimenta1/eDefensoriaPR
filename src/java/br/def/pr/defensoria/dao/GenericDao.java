package br.def.pr.defensoria.dao;

import br.def.pr.defensoria.util.HibernateUtil;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author joao
 */
abstract class GenericDao<T> implements Serializable  {
    private final Class<T> entityClass;
    private Transaction trns;
    private Session session;
    
     public GenericDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

     public void save(T entity) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(entity);
            trns.commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.close();
        }
        
    }
     
     public void delete(T entity) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.close();
        }
    }
     
     public void update(T entity) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.close();
        }
    }

     public <T> List<T> getAll(Class<T> type) {
      session = HibernateUtil.getSessionFactory().getCurrentSession(); 
      trns = session.beginTransaction();
      List<T> ts = session.createCriteria(type).list();
      session.close();
      return ts;
    }

     public T getById(Integer id) {
        T t = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            t =  (T) session.load(entityClass, id);
            Hibernate.initialize(t);
        } catch (HibernateException e) {
        } finally {
            if (session != null && session.isOpen()) 
                session.close();
        }
        return t;
    }

}


