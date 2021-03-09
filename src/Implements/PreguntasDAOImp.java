/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import DAO.PreguntasDAO;
import DAO.ConectDb.Conexion;
import Models.Clases;
import Models.Dificultades;
import Models.Preguntas;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class PreguntasDAOImp implements PreguntasDAO{

    @Override
    public void Insertar(Preguntas value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Preguntas> ConsultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Preguntas Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(Preguntas value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Preguntas value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList ConsultarTodos(BigDecimal cla) {
        ArrayList lpreg = new ArrayList();
        try{
                Conexion con = new Conexion();
                con.Conectar();
                Statement st = con.getCon().createStatement();
                
                String consulta="SELECT * FROM PREGUNTAS WHERE ID_TOPICO = "+cla;
                ResultSet rs = st.executeQuery(consulta);
                Preguntas preguntas=null;
                
                while(rs.next()){
                    preguntas = new Preguntas(rs.getBigDecimal("ID"), rs.getString("PREGUNTA"), rs.getString("RESPUESTA"), rs.getString("OPCION1"), rs.getString("OPCION2"));
                    lpreg.add(preguntas);
                }
                rs.close();
                st.close();
                con.desconectar();
                
            } catch (SQLException ex) {
                //JLblMensaje.setText(ex.getErrorCode() + "" + ex.getMessage());
            }
            finally{
                return lpreg;
        }
    }
    
}
