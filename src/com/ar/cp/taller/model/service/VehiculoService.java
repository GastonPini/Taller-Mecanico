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
public class VehiculoService {

    public List<Vehiculo> getAll(){
        VehiculoDao dao = new VehiculoDao();
        return dao.getAll();
    }
    
    public boolean existeVehiculo(String patente){
        VehiculoDao dao = new VehiculoDao();
        Vehiculo vehiculo = dao.getByPatente(patente);
        return vehiculo != null;
    }
    public boolean existeVehiculo(Integer id){
        VehiculoDao dao = new VehiculoDao();
        Vehiculo vehiculo = dao.getById(id);
        return vehiculo != null;
    }
    
    public void nuevoVehiculo(String patente, String descripcion, Modelo modelo, String numerochasis, String numeromotor){
        if(!existeVehiculo(descripcion)){
            VehiculoDao dao = new VehiculoDao();
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPatente(patente);
            vehiculo.setDescripcion(descripcion);
            vehiculo.setModelo(modelo);
            vehiculo.setNumerochasis(numerochasis);
            vehiculo.setNumeromotor(numeromotor);
            dao.save(vehiculo);           
        }
    }
    
    public void eliminarVehiculo(Integer id){
        if(existeVehiculo(id)){
           VehiculoDao dao = new VehiculoDao();
           Vehiculo vehiculo = dao.getById(id);
           dao.delete(vehiculo); 
        }
    }
    public void eliminarVehiculo(String patente){
        if(existeVehiculo(patente)){
           VehiculoDao dao = new VehiculoDao();
           Vehiculo vehiculo = dao.getByPatente(patente);
           dao.delete(vehiculo);   
        }
    }
    
    public void modificarVehiculo(String patente, String descripcion, Modelo modelo, String numerochasis, String numeromotor){
        VehiculoDao dao = new VehiculoDao();
        Vehiculo vehiculo = dao.getByPatente(patente);
        vehiculo.setPatente(patente);
        vehiculo.setDescripcion(descripcion);
        vehiculo.setModelo(modelo);
        vehiculo.setNumerochasis(numerochasis);
        vehiculo.setNumeromotor(numeromotor);
        dao.save(vehiculo);
    }
    
}
