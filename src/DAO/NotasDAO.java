package DAO;

import java.util.List;

import Models.Nota;

public interface NotasDAO extends CRUD<Nota> {
    public List<Nota> getNotas(String nombre, String apellido,
     int DificultadId); 
}
