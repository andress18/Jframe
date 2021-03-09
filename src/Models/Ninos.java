/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 *
 * @author usuario
 */

public class Ninos {

    
    private BigDecimal id;
    
    private String nombre;
    
    private String apellido;
    
    private BigInteger calificacion;

    public Ninos() {
    }

    public Ninos(BigDecimal id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public BigInteger getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigInteger calificacion) {
        this.calificacion = calificacion;
    }

    
    
}
