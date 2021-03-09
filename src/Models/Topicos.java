/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author usuario
 */

public class Topicos{

    
    private BigDecimal id;
    private String nombre;
    private String tituloActividad;
    private Dificultades dificultad;
    private List<Preguntas> preguntasList;
    private List<Clases> clasesList;

    public Topicos() {
    }

    public Topicos(BigDecimal id, String nombre, String tituloActividad, Dificultades dificultad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloActividad = tituloActividad;
        this.dificultad = dificultad;
        
    }
    
    

    public Topicos(BigDecimal id) {
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

    public String getTituloActividad() {
        return tituloActividad;
    }

    public void setTituloActividad(String tituloActividad) {
        this.tituloActividad = tituloActividad;
    }

    public Dificultades getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultades dificultad) {
        this.dificultad = dificultad;
    }

    
    public List<Preguntas> getPreguntasList() {
        return preguntasList;
    }

    public void setPreguntasList(List<Preguntas> preguntasList) {
        this.preguntasList = preguntasList;
    }

    public List<Clases> getClasesList() {
        return clasesList;
    }

    public void setClasesList(List<Clases> clasesList) {
        this.clasesList = clasesList;
    }

}
