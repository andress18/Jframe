/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Models.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public interface ClasesDAO extends CRUD<Clases>{
     public ArrayList ConsultarTodos(BigDecimal cla);
     public void ConsultarUNO(BigDecimal cla, String titulo, String descripcion, String ejemplo, String textoesp, String textoing);
}
