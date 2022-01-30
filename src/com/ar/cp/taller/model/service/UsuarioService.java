/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ar.cp.taller.model.service;

import com.ar.cp.taller.model.dao.*;
import com.ar.cp.taller.model.entity.*;

/**
 *
 * @author Gastón
 */
public class UsuarioService {
    
    public boolean validarUsuario(String usernameInput, String passwordInput){
        UsuarioDao userDao = new UsuarioDao();
        Usuario usuario = userDao.getUsuarioByUsername(usernameInput);
        if (usuario != null) {
            boolean loginAceptado = usuario.getPassword().equals(passwordInput);
            return loginAceptado;
        } else {
            return false;
        }
    }
    
    public boolean isAdmin(String usernameInput) {
        UsuarioDao userDao = new UsuarioDao();
        Usuario usuario = userDao.getUsuarioByUsername(usernameInput);
        if (usuario != null) {
            boolean isAdmin = usuario.getRol().equals("Admin".toLowerCase());
            return isAdmin;
        } else {
            return false;
        }
    }
    
    public String getNombreApellido(String usernameInput) {
        UsuarioDao userDao = new UsuarioDao();
        Usuario usuario = userDao.getUsuarioByUsername(usernameInput);
        if (usuario != null) {
            String nombreApellido = usuario.getPersona().getNombre() + " " + usuario.getPersona().getApellido();
            return nombreApellido;
        } else {
            return "";
        }
    }
}
