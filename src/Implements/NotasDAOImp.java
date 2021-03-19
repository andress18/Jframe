/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Models.Nota;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.NotasDAO;
import DAO.ConectDb.Conexion;

/**
 *
 * @author usuario
 */
public class NotasDAOImp implements NotasDAO {

    @Override
    public void Insertar(Nota value) {
        // TODO Auto-generated method stub
        int dificultad = 1;
        switch (value.getNivel()) {
        case "Facil":
            dificultad = 1;
            break;
        case "Medio":
            dificultad = 2;
            break;
        case "Dificil":
            dificultad = 3;
            break;

        default:
            break;
        }
        if (!value.getNino().equals("-----------")) {
            Conexion con = new Conexion();
            try {
                String[] ninoName = value.getNino().split(" ");
                String consulta = String.format("SELECT * FROM NINOS WHERE NOMBRE = '%s'" + " AND APELLIDO = '%s'",
                        ninoName[0], ninoName[1]);
                ResultSet query1 = executeQuery(consulta);
                int idNino = 1;
                while (query1.next())
                    idNino = query1.getInt("ID");
                con.Conectar();
                Statement st = con.getCon().createStatement();
                String query = String.format("INSERT INTO NOTAS VALUES (%d, %d, %s)", idNino, dificultad,
                        value.getNota());
                st.executeUpdate(query);
                con.desconectar();
            } catch (SQLException e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public List<Nota> ConsultarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Nota Consultar() {
        return null;
    }

    @Override
    public boolean Eliminar(Nota value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean Actualizar(Nota value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Nota> getNotas(String nombre, String apellido, int DificultadId) {
        List<Nota> notas = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            con.Conectar();
            Statement st = con.getCon().createStatement();
            String consulta = String.format(
                    "SELECT CONCAT(N.NOMBRE, ' ',  N.APELLIDO) as Nino, DF.NOMBRE as Dificultad, NT.PUNTAJE as Puntaje"
                            + " FROM NOTAS NT INNER JOIN DIFICULTADES DF ON DF.ID = NT.ID_Dificultad"
                            + " INNER JOIN NINOS N ON N.ID = NT.ID_Nino WHERE N.Nombre = '%s' AND N.APELLIDO = '%s' AND DF.ID = %d",
                    nombre.toUpperCase(), apellido.toUpperCase(), DificultadId);
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                notas.add(new Nota(rs.getString("Nino"), rs.getString("Dificultad"), rs.getInt("Puntaje")));
            }

            return notas;
        } catch (SQLException exception) {
            // TODO: handle exception

            return notas;
        }
    }

    private ResultSet executeQuery(String query) {
        try {
            Conexion con = new Conexion();
            con.Conectar();
            Statement st = con.getCon().createStatement();
            ResultSet rs = st.executeQuery(query);
            con.desconectar();
            return rs;
        } catch (SQLException exception) {
            return null;
        }
    }

}
