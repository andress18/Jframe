/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Models.*;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
 *
 * @author usuario
 */
public interface PreguntasDAO extends CRUD<Preguntas>{
    public ArrayList ConsultarTodos(BigDecimal cla);
}
