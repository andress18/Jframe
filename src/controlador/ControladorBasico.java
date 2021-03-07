/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.Implements.ClasesDAOImp;
import DAO.Modelo.Clases;
import Vista.frmTopicos;
import com.Actividades.frmActividadPeque;
import com.Edades.frmEdades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ControladorBasico implements ActionListener {
    frmActividadPeque vistaPeque;
    frmTopicos vistaTopicos;
    frmEdades vistaDificultad;

    public ControladorBasico(frmActividadPeque vistaPeque, frmTopicos vistaTopicos, frmEdades vistaDificultad) {
        this.vistaPeque = vistaPeque;
        this.vistaTopicos = vistaTopicos;
        this.vistaDificultad = vistaDificultad;
        this.vistaPeque.getBtnA1().addActionListener(this);
        this.vistaPeque.getBtnA2().addActionListener(this);
        this.vistaPeque.getBtnA3().addActionListener(this);
        this.vistaPeque.getBtnA4().addActionListener(this);
        this.vistaPeque.getBtnEdad().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ClasesDAOImp clasesDao = new ClasesDAOImp();
        if (e.getSource().equals(vistaPeque.getBtnA1()) && vistaPeque.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(1));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }

            vistaTopicos.setVisible(true);
            vistaPeque.dispose();

        } else if (e.getSource().equals(vistaPeque.getBtnA2()) && vistaPeque.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(2));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }

            vistaTopicos.setVisible(true);
            vistaPeque.dispose();

        } else if (e.getSource().equals(vistaPeque.getBtnA3()) && vistaPeque.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(3));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }

            vistaTopicos.setVisible(true);
            vistaPeque.dispose();

        } else if (e.getSource().equals(vistaPeque.getBtnA4()) && vistaPeque.isVisible()) { // Topico Tema 1
            ArrayList<Clases> lista = clasesDao.ConsultarTodos(new BigDecimal(4));
            for (int i = 0; i < lista.size(); i++) {
                vistaTopicos.getLblTitulo().setText(lista.get(i).getTema());
                vistaTopicos.getLblDescripcion().setText("<html><p> " + lista.get(i).getExplicacion() + " </p></html>");
                vistaTopicos.getLblEjemplo().setText(lista.get(i).getEjemplo());
                vistaTopicos.getLblIngles().setText(lista.get(i).getTextoing());
                vistaTopicos.getLblEspañol().setText(lista.get(i).getTextoesp());
            }

            vistaTopicos.setVisible(true);
            vistaPeque.dispose();

        } else if (e.getSource().equals(vistaPeque.getBtnEdad()) && vistaPeque.isVisible()) {
            vistaDificultad.setVisible(true);
            vistaPeque.dispose();
        }
    }
    
    
    
}
