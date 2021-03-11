/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.PlantillaActividad;
import Views.Edades.frmEdades;
import Views.Resultados.dlgResultado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class ControladorActividades implements ActionListener {
    PlantillaActividad vistaActividad;
    dlgResultado vistaResultado1;
    frmEdades vistaDificultad;
    double nota=0;

    public ControladorActividades(PlantillaActividad vistaActividad, dlgResultado vistaResultado1, frmEdades vistaDificultad) {
        this.vistaActividad = vistaActividad;
        this.vistaResultado1 = vistaResultado1;
        this.vistaDificultad = vistaDificultad;
        this.vistaActividad.getBtnTerminar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vistaActividad.getBtnTerminar()) && vistaActividad.isVisible()) {

            if (vistaActividad.getRdb1().isSelected()) {
                vistaActividad.getLblConfir1().setText("CORRECTO");
                nota=nota+2.5;
                
            } else {
                vistaActividad.getLblConfir1().setText("INCORRECTO");
            }

            if (vistaActividad.getRdb4().isSelected()) {
                vistaActividad.getLblConfir2().setText("CORRECTO");
                nota=nota+2.5;
                
            } else {
                vistaActividad.getLblConfir2().setText("INCORRECTO");
            }

            if (vistaActividad.getTxtRespuesta1().getText().toUpperCase().equals(vistaActividad.getLblRespC1().getText())) {
                vistaActividad.getLblConfir3().setText("CORRECTO");
                nota=nota+2.5;
                
            } else {
                vistaActividad.getLblConfir3().setText("INCORRECTO");
            }

            if (vistaActividad.getTxtRespuesta2().getText().toUpperCase().equals(vistaActividad.getLblRespC2().getText())) {
                vistaActividad.getLblConfir4().setText("CORRECTO");
                nota=nota+2.5;
                
            } else {
                vistaActividad.getLblConfir4().setText("INCORRECTO");
            }
            vistaResultado1.getLblNota().setText(String.format("%.2f /10",nota));
            vistaActividad.getLblConfir1().setVisible(true);
            vistaActividad.getLblConfir2().setVisible(true);
            vistaActividad.getLblConfir3().setVisible(true);
            vistaActividad.getLblConfir4().setVisible(true);
            vistaActividad.getLblRespC1().setVisible(true);
            vistaActividad.getLblRespC2().setVisible(true);
            vistaResultado1.setVisible(true);
            nota=0;
        } 
    }
    
    
}
