/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Modelo;

import java.math.BigDecimal;

/**
 *
 * @author usuario
 */
public class NOTA {
    private BigDecimal Usuario;
    private BigDecimal Niveles;
    private BigDecimal Temas;
    private BigDecimal Nota;

    public NOTA() {
    }

    
    public NOTA(BigDecimal Usuario, BigDecimal Niveles, BigDecimal Temas, BigDecimal Nota) {
        this.Usuario = Usuario;
        this.Niveles = Niveles;
        this.Temas = Temas;
        this.Nota = Nota;
    }

    public BigDecimal getUsuario() {
        return Usuario;
    }

    public void setUsuario(BigDecimal Usuario) {
        this.Usuario = Usuario;
    }

    public BigDecimal getNiveles() {
        return Niveles;
    }

    public void setNiveles(BigDecimal Niveles) {
        this.Niveles = Niveles;
    }

    public BigDecimal getTemas() {
        return Temas;
    }

    public void setTemas(BigDecimal Temas) {
        this.Temas = Temas;
    }

    public BigDecimal getNota() {
        return Nota;
    }

    public void setNota(BigDecimal Nota) {
        this.Nota = Nota;
    }
    
    
    
}
