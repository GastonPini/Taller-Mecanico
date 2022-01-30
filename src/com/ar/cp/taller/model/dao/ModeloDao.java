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
public class ModeloDao {

    public Modelo getByDescripcion(String descripcion) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Modelo.class);
            c.add(Restrictions.eq("descripcion", descripcion));
            Modelo modelo = (Modelo) c.uniqueResult();
            return modelo;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }    
    }

    public Modelo getById(int id) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Modelo.class);
            c.add(Restrictions.eq("id", id));
            Modelo modelo = (Modelo) c.uniqueResult();
            return modelo;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }
    }

    public void save(Modelo modelo) {
        Session session = SesionDao.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(modelo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void delete(Modelo modelo) {
        Session session = SesionDao.getSessionFactory().openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(modelo);
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

    public void deleteById(int id) {     
        
        Session session = SesionDao.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            Modelo modelo = getById(id);
            tx = session.beginTransaction();
            session.delete(modelo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;
        } finally {
            session.close();
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Modelo> getAll() {
         Session session = SesionDao.getSessionFactory().openSession();
        try {
           return session.createCriteria(Modelo.class).list();
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }   
    }
    
}