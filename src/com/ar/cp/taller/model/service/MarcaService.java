/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cp.taller.model.service;

import java.util.List;
import com.ar.cp.taller.model.dao.*;
import com.ar.cp.taller.model.entity.*;

/**
 *
 * @author Gastón
 */
public class MarcaService {

    public List<Marca> getAll(){
        MarcaDao dao = new MarcaDao();
        return dao.getAll();
    }
    
    public boolean existeMarca(String nombre){
        MarcaDao dao = new MarcaDao();
        Marca marca = dao.getByNombre(nombre);
        return marca != null;
    }
    
    public boolean existeMarca(Integer id){
        MarcaDao dao = new MarcaDao();
        Marca marca = dao.getById(id);
        return marca != null;
    }
     
    public void nuevaMarca(String nombre){
        if(!existeMarca(nombre)){
            MarcaDao dao = new MarcaDao();
            Marca marca = new Marca();
            marca.setNombre(nombre);
            dao.save(marca);           
        }   
    }
    
    public void eliminarMarca (Integer id){
        if(existeMarca(id)){
           MarcaDao dao = new MarcaDao();
           Marca marca = dao.getById(id);
           dao.delete(marca);
        }
    }
    
    public void eliminarMarca (String nombre){
        if(existeMarca(nombre)){
           MarcaDao dao = new MarcaDao();
           Marca marca = dao.getByNombre(nombre);
           dao.delete(marca);
        }
    }
    
    public void modificarMarca (Integer id, String nombre){
        MarcaDao dao = new MarcaDao();
        Marca marca = dao.getById(id);
        marca.setNombre(nombre);
        dao.save(marca);
    }

}
