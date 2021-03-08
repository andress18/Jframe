/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implements;

import DAO.ConectDb.Conexion;
import DAO.Modelo.Clases;
import DAO.Modelo.Dificultades;
import DAO.Modelo.Topicos;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class ClasesDAOImp implements ClasesDAO {

    @Override
    public void Insertar(Clases value) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public ArrayList ConsultarTodos(BigDecimal cla) {
        ArrayList lclas = new ArrayList();
        try {
            Conexion con = new Conexion();
            con.Conectar();
            Statement st = con.getCon().createStatement();
            Dificultades dificultad = null;
            String consulta = "SELECT * FROM CLASES WHERE ID_TOPICO = " + cla;
            ResultSet rs = st.executeQuery(consulta);
            Clases clases = null;

            while (rs.next()) {
                clases = new Clases(rs.getBigDecimal("ID"), rs.getString("TEMA"), rs.getString("TEXTOESP"),
                        rs.getString("TEXTOENG"), rs.getString("EJEMPLO"), rs.getString("EXPLICACION"));
                lclas.add(clases);
            }
            rs.close();
            st.close();
            con.desconectar();

        } catch (SQLException ex) {
            // JLblMensaje.setText(ex.getErrorCode() + "" + ex.getMessage());
        } finally {
            return lclas;
        }

    }

    @Override
    public Clases Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean Eliminar(Clases value) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean Actualizar(Clases value) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public List<Clases> ConsultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void ConsultarUNO(BigDecimal cla, String titulo, String descripcion, String ejemplo, String textoesp,
            String textoing) {

    }

}
