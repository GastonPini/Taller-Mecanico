/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cp.taller.model.service;

import java.util.List;
import com.ar.cp.taller.model.dao.*;
import com.ar.cp.taller.model.entity.*;
import java.util.Date;

/**
 *
 * @author Gastón
 */
public class MantenimientoService {

    public List<Mantenimiento> getAll(){
        MantenimientoDao dao = new MantenimientoDao();
        return dao.getAll();
    }
    
    public boolean existeMantenimiento(Integer id){
        MantenimientoDao dao = new MantenimientoDao();
        Mantenimiento mantenimiento = dao.getById(id);
        return mantenimiento != null;
    }
    
    public void nuevoMantenimiento(String descripcion, String fecha, Vehiculo vehiculo){
        MantenimientoDao dao = new MantenimientoDao();
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.setDescripcion(descripcion);
        mantenimiento.setVehiculo(vehiculo);
        mantenimiento.setFecha(fecha);
        dao.save(mantenimiento);           
        
    }
    
    public void eliminarMantenimiento(Integer id){
        if(existeMantenimiento(id)){
           MantenimientoDao dao = new MantenimientoDao();
           Mantenimiento mantenimiento = dao.getById(id);
           dao.delete(mantenimiento); 
        }
    }
    
    public void modificarMantenimiento(Integer id, String descripcion, String fecha, Vehiculo vehiculo){
        MantenimientoDao dao = new MantenimientoDao();
        Mantenimiento mantenimiento = dao.getById(id);
        mantenimiento.setDescripcion(descripcion);
        mantenimiento.setVehiculo(vehiculo);
        //mantenimiento.setFecha(fecha);
        dao.save(mantenimiento);
    }
    
}
