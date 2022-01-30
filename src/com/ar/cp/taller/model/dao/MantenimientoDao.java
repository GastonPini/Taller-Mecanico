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
public class MantenimientoDao {

    public Mantenimiento getByDescripcion(String descripcion) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Mantenimiento.class);
            c.add(Restrictions.eq("descripcion", descripcion));
            Mantenimiento mantenimiento = (Mantenimiento) c.uniqueResult();
            return mantenimiento;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }    
    }

    public Mantenimiento getById(int id) {
        Session session = SesionDao.getSessionFactory().openSession();
        try {
            Criteria c;
            c = session.createCriteria(Mantenimiento.class);
            c.add(Restrictions.eq("id", id));
            Mantenimiento mantenimiento = (Mantenimiento) c.uniqueResult();
            return mantenimiento;
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }
    }

    public void save(Mantenimiento mantenimiento) {
        Session session = SesionDao.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(mantenimiento);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
    }

    public void delete(Mantenimiento mantenimiento) {
        Session session = SesionDao.getSessionFactory().openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(mantenimiento);
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
            Mantenimiento mantenimiento = getById(id);
            tx = session.beginTransaction();
            session.delete(mantenimiento);
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

    public List<Mantenimiento> getAll() {
         Session session = SesionDao.getSessionFactory().openSession();
        try {
           return session.createCriteria(Mantenimiento.class).list();
        } catch (HibernateException e) {
            session.close();
            throw e;
        } finally {
            session.close();
        }   
    }
    
}