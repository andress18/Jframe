/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implements;
import DAO.Modelo.*;
import java.math.BigDecimal;
/**
 *
 * @author usuario
 */
public interface TopicoDAO extends CRUD<Topicos>{
    public Topicos Consultar(BigDecimal dif);
}
