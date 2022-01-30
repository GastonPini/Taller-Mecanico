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
public class ModeloService {

    public List<Modelo> getAll(){
        ModeloDao dao = new ModeloDao();
        return dao.getAll();
    }
    
    public boolean existeModelo(String descripcion){
        ModeloDao dao = new ModeloDao();
        Modelo modelo = dao.getByDescripcion(descripcion);
        return modelo != null;
    }
    
    public boolean existeModelo(Integer id){
        ModeloDao dao = new ModeloDao();
        Modelo modelo = dao.getById(id);
        return modelo != null;
    }
    
    public void nuevoModelo(String descripcion, Integer anio, String combustible, Marca marca){
        if(!existeModelo(descripcion)){
            ModeloDao dao = new ModeloDao();
            Modelo modelo = new Modelo();
            modelo.setDescripcion(descripcion);
            modelo.setAnio(anio);
            modelo.setTipocombustible(combustible);
            modelo.setMarca(marca);
            dao.save(modelo);           
        }
    }
    
    public void eliminarModelo(Integer id){
        if(existeModelo(id)){
           ModeloDao dao = new ModeloDao();
           Modelo modelo = dao.getById(id);
           dao.delete(modelo); 
        }
    }
    public void eliminarModelo(String descripcion){
        if(existeModelo(descripcion)){
           ModeloDao dao = new ModeloDao();
           Modelo modelo = dao.getByDescripcion(descripcion);
           dao.delete(modelo);   
        }
    }
    
    public void modificarModelo (String descripcion, Integer anio, String combustible, Marca marca){
        ModeloDao dao = new ModeloDao();
        Modelo modelo = dao.getByDescripcion(descripcion);
        modelo.setDescripcion(descripcion);
        modelo.setAnio(anio);
        modelo.setTipocombustible(combustible);
        modelo.setMarca(marca);
        dao.save(modelo);
    }
    
}
