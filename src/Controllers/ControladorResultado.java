/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Edades.frmEdades;
import Views.Inicio.frmInicio;
import Views.PlantillaActividad;
import Views.Resultados.dlgResultado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Implements.NotasDAOImp;
import Models.Nota;

/**
 *
 * @author usuario
 */
public class ControladorResultado implements ActionListener {
    dlgResultado vistaResultado1;
    frmEdades vistaDificultad;
    PlantillaActividad vistaActividad;
    ControladorDificultades Dificultad;
    frmInicio vistaInicio;

    public void setVistaInicio(frmInicio vistaInicio) {
        this.vistaInicio = vistaInicio;
    }

    private String nino;

    public ControladorResultado(dlgResultado vistaResultado1, frmEdades vistaDificultad,
            PlantillaActividad vistaActividad, frmInicio vistaInicio, ControladorDificultades dificultad) {
        this.vistaResultado1 = vistaResultado1;
        this.vistaDificultad = vistaDificultad;
        this.vistaActividad = vistaActividad;
        this.vistaResultado1.getBtnFinish().addActionListener(this);
        this.Dificultad = dificultad;
        this.vistaInicio = vistaInicio;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vistaResultado1.getBtnFinish()) && vistaResultado1.isVisible()) {
            //
            NotasDAOImp notaDao = new NotasDAOImp();
            String dificultadValue = Dificultad.getDificultad() == 1 ? "Facil" : "Medio";
            double calificacion = 0;
            try {
                String[] calificacionStr = vistaResultado1.getLblNota().getText().split("/");
                calificacion = Double.parseDouble(calificacionStr[0]);
            } catch (NumberFormatException exception) {
                // TODO: handle exception
            }
            String nombreNino = vistaInicio.getLblNom().getText();
            Nota nota = new Nota(nombreNino, dificultadValue, calificacion);
            notaDao.Insertar(nota);

            vistaDificultad.setVisible(true);
            vistaActividad.dispose();
            vistaResultado1.dispose();
            vistaActividad.getButtonGroup1().clearSelection();
            vistaActividad.getButtonGroup2().clearSelection();
            vistaActividad.getTxtRespuesta1().setText("");
            vistaActividad.getTxtRespuesta2().setText("");
            vistaActividad.getLblConfir1().setVisible(false);
            vistaActividad.getLblConfir2().setVisible(false);
            vistaActividad.getLblConfir3().setVisible(false);
            vistaActividad.getLblConfir4().setVisible(false);
            vistaActividad.getLblRespC1().setVisible(false);
            vistaActividad.getLblRespC2().setVisible(false);
        }
    }

    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

}
