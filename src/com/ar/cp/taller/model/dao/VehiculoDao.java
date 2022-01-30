/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cp.taller.model.dao;

import java.util.List;
import com.ar.cp.taller.model.entity.*;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Gastón
 */
public class VehiculoDao {

    public Vehiculo getByNombre(String nombre) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Vehiculo.class);
            c.add(Restrictions.eq("nombre", nombre));
            Vehiculo vehiculo = (Vehiculo) c.uniqueResult();
            return vehiculo;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }    
    }

    public Vehiculo getByPatente(String patente) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Vehiculo.class);
            c.add(Restrictions.eq("patente", patente));
            Vehiculo vehiculo = (Vehiculo) c.uniqueResult();
            return vehiculo;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }
    }
    
    public Vehiculo getById(Integer id) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Vehiculo.class);
            c.add(Restrictions.eq("id", id));
            Vehiculo vehiculo = (Vehiculo) c.uniqueResult();
            return vehiculo;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }
    }

    public void save(Vehiculo vehiculo) {
        Session session = SesionDao.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(vehiculo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void delete(Vehiculo vehiculo) {
        Session session = SesionDao.getSessionFactory().openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(vehiculo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
    }

    public void deleteByPatente(String patente) {
        
        Session session = SesionDao.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            Vehiculo vehiculo = getByPatente(patente);
            tx = session.beginTransaction();
            session.delete(vehiculo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
        
    }

    public List<Vehiculo> getAll() {
         Session session = SesionDao.getSessionFactory().openSession();
        try {
           return session.createCriteria(Vehiculo.class).list();
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }    
    }

}