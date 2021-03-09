/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.*;

/**
 *
 * @author User
 */
public interface UsuarioDAO extends CRUD<Ninos>{
    public Ninos Consultar(String nombre, String apellido);
        
}
