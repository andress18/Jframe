/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Modelo;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author usuario
 */

public class Preguntas{
    private BigDecimal id;
    private String pregunta;
    private String respuesta;
    private String opcion1;
    private String opcion2;
    private BigInteger puntuacion;
    private Topicos idtopico;

    public Preguntas() {
    }

    public Preguntas(BigDecimal id, String pregunta, String respuesta, String opcion1, String opcion2) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
    }

    

    
    
    

    public Preguntas(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public BigInteger getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(BigInteger puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Topicos getIdtopico() {
        return idtopico;
    }

    public void setIdtopico(Topicos idtopico) {
        this.idtopico = idtopico;
    }
    
}
