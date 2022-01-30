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
public class PersonaDao {

    public Persona getByNombre(String nombre) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Persona.class);
            c.add(Restrictions.eq("nombre", nombre));
            Persona persona = (Persona) c.uniqueResult();
            return persona;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }    
    }

    public Persona getById(int id) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Persona.class);
            c.add(Restrictions.eq("id", id));
            Persona persona = (Persona) c.uniqueResult();
            return persona;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }
    }

    public void save(Persona persona) {
        Session session = SesionDao.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(persona);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void delete(Persona persona) {
        Session session = SesionDao.getSessionFactory().openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(persona);
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
            Persona persona = getById(id);
            tx = session.beginTransaction();
            session.delete(persona);
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

    public List<Persona> getAll() {
         Session session = SesionDao.getSessionFactory().openSession();
        try {
           return session.createCriteria(Persona.class).list();
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }    
    }

}