/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Modelo;


import DAO.Modelo.Topicos;
import java.math.BigDecimal;
import java.util.List;


/**
 *
 * @author usuario
 */

public class Dificultades {

    
    private BigDecimal id;
    
    private String nombre;
    
    private List<Topicos> topicosList;

    public Dificultades() {
    }

    public Dificultades(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public List<Topicos> getTopicosList() {
        return topicosList;
    }

    public void setTopicosList(List<Topicos> topicosList) {
        this.topicosList = topicosList;
    }
    
}
