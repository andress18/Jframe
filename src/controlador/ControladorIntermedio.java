/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.Implements.ClasesDAOImp;
import DAO.Modelo.Clases;
import Vista.frmTopicos;
import com.Actividades.frmActividadGrand;
import com.Edades.frmEdades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ControladorIntermedio implements ActionListener {
    frmActividadGrand vistaGrandes;
    frmTopicos vistaTopicos;
    frmEdades vistaDificultad;

    public ControladorIntermedio(frmActividadGrand vistaGrandes, frmTopicos vistaTopicos, frmEdades vistaDificultad) {
        this.vistaGrandes = vistaGrandes;
        this.vistaTopicos = vistaTopicos;
        this.vistaDificultad = vistaDificultad;
        this.vistaGrandes.getBtnG1().addActionListener(this);
        this.vistaGrandes.getBtnG2().addActionListener(this);
        this.vistaGrandes.getBtnG3().addActionListener(this);
        this.vistaGrandes.getBtnG4().addActionListener(this);
        this.vistaGrandes.getBtnEdad().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ClasesDAOImp clasesDao = new ClasesDAOImp();
        if (e.getSource().equals(vistaGrandes.getBtnEdad()) && vistaGrandes.isVisible()) {
            vistaDificultad.setVisible(true);
            vistaGrandes.dispose();
            
        } else if (e.getSource().equals(vistaGrandes.getBtnG1()) && vistaGrandes.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(5));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }
            vistaTopicos.setVisible(true);
            vistaGrandes.dispose();

        } else if (e.getSource().equals(vistaGrandes.getBtnG2()) && vistaGrandes.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(6));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }
            vistaTopicos.setVisible(true);
            vistaGrandes.dispose();

        } else if (e.getSource().equals(vistaGrandes.getBtnG3()) && vistaGrandes.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(7));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }
            vistaTopicos.setVisible(true);
            vistaGrandes.dispose();

        } else if (e.getSource().equals(vistaGrandes.getBtnG4()) && vistaGrandes.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(8));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }
            vistaTopicos.setVisible(true);
            vistaGrandes.dispose();

        }
    }
    
    
}
