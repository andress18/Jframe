/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implements;

import DAO.ConectDb.Conexion;
import DAO.Modelo.Dificultades;
import DAO.Modelo.Ninos;
import DAO.Modelo.Topicos;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author usuario
 */
public class TopicoDAOImp implements TopicoDAO{

    @Override
    public void Insertar(Topicos value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Topicos> ConsultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Topicos Consultar(BigDecimal dif) {
        try{
                Conexion con = new Conexion();
                con.Conectar();
                Statement st = con.getCon().createStatement();
                Dificultades dificultad = null;
                String consulta="SELECT * FROM TOPICOS WHERE DIFICULTAD = "+dif;
                ResultSet rs = st.executeQuery(consulta);
                Topicos topico=null;
                while(rs.next()){
                    topico = new Topicos(rs.getBigDecimal("ID"), rs.getString("NOMBRE") , rs.getString("TITULO_ACTIVIDAD"), dificultad);
                }
                rs.close();
                st.close();
                con.desconectar();
                return topico;
            } catch (SQLException ex) {
                //JLblMensaje.setText(ex.getErrorCode() + "" + ex.getMessage());
            }
            return null;
    }

    @Override
    public boolean Eliminar(Topicos value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Topicos value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Topicos Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
