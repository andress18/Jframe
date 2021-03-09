/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.math.BigDecimal;

/**
 *
 * @author usuario
 */

public class Clases {

   
    
    private BigDecimal id;
   
    private String tema;

    private String textoesp;
    
    private String textoing;
    
    private String ejemplo;
    
    private String explicacion;
    
    private Topicos idtopico;

    public Clases() {
    }

    public Clases(BigDecimal id, String tema, String textoesp, String textoing, String ejemplo, String explicacion) {
        this.id = id;
        this.tema = tema;
        this.textoesp = textoesp;
        this.textoing = textoing;
        this.ejemplo = ejemplo;
        this.explicacion = explicacion;
    }

    

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTextoesp() {
        return textoesp;
    }

    public void setTextoesp(String textoesp) {
        this.textoesp = textoesp;
    }

    public String getTextoing() {
        return textoing;
    }

    public void setTextoing(String textoing) {
        this.textoing = textoing;
    }

    public String getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(String ejemplo) {
        this.ejemplo = ejemplo;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public Topicos getIdtopico() {
        return idtopico;
    }

    public void setIdtopico(Topicos idtopico) {
        this.idtopico = idtopico;
    }

    

    
    
}
