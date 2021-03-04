/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Implements;

import DAO.ConectDb.Conexion;
import DAO.Modelo.Ninos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class UsuarioDAOImp implements UsuarioDAO{

    @Override
    public void Insertar(Ninos value) {
        try{
                Conexion con = new Conexion();
                con.Conectar();
                Statement st = con.getCon().createStatement();
                String sql="INSERT INTO NINOS (NOMBRE, APELLIDO) VALUES ("+ "'" + value.getNombre()+ "'" +"," + "'" + value.getApellido() + "')";
                int filas = st.executeUpdate(sql);
                st.close();
                con.desconectar();
            } catch (SQLException ex) {
                System.out.println("No se pudo insertar datos");
            }
    }

    @Override
    public List<Ninos> ConsultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ninos Consultar(String nombre, String apellido) {
        try{
                Conexion con = new Conexion();
                con.Conectar();
                Statement st = con.getCon().createStatement();
                // String consulta="SELECT * FROM NINOS WHERE NOMBRE = "+ "'" + nombre + "'" + "AND APELLIDO= " + "'" + apellido + "'";
                String consulta="SELECT * FROM NINOS WHERE NOMBRE = "+ "'" + nombre + "'" + "AND APELLIDO= " + "'" + apellido + "'";
                ResultSet rs = st.executeQuery(consulta);
                Ninos nino=null;
                if(rs.next()){
                    nino = new Ninos(rs.getBigDecimal("ID"), nombre, apellido);
                }
                rs.close();
                st.close();
                con.desconectar();
                return nino;
            } catch (SQLException ex) {
                //JLblMensaje.setText(ex.getErrorCode() + "" + ex.getMessage());
            }
            return null;
    }

    @Override
    public boolean Eliminar(Ninos value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Ninos value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ninos Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
