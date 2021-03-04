/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implements;

import java.util.List;

/**
 *
 * @author User
 */
public interface CRUD<T> {
    //create read delete update
    public void Insertar(T value);
    public List<T> ConsultarTodos();
    public T Consultar();
    public boolean Eliminar(T value);
    public boolean Actualizar(T value);
}
