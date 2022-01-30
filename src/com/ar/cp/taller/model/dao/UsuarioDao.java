/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cp.taller.model.dao;

import com.ar.cp.taller.model.entity.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Gastón
 */
public class UsuarioDao {
    
    public Usuario getUsuarioByUsername(String username) {
        Session sesion = SesionDao.getSessionFactory().openSession();
        try {
            Criteria cr = sesion.createCriteria(Usuario.class);
            cr.add(Restrictions.eq("nombreusuario", username));
            Usuario user = (Usuario) cr.uniqueResult();
            return user;
        }
        catch (Exception e){
            sesion.close();
            throw e;
        }
        finally {
            sesion.close();
        }
        
    }
    
    public void save(Usuario user) {
        Session sesion = SesionDao.getSessionFactory().openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            sesion.saveOrUpdate(user);
            tr.commit();
        }
        catch (Exception e){
            sesion.close();
            throw e;
        }
        finally {
            sesion.close();
        }
    }
    
    public void delete(Usuario user) {
        Session sesion = SesionDao.getSessionFactory().openSession();
        Transaction tr = sesion.beginTransaction();
        try {
            sesion.delete(user);
            tr.commit();
        }
        catch (Exception e){
            sesion.close();
            throw e;
        }
        finally {
            sesion.close();
        }
    }
}
