/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.PlantillaActividad;
import com.Edades.frmEdades;
import com.Resultados.dlgResultado;
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
                
            } else {
                vistaActividad.getLblConfir1().setText("INCORRECTO");
            }

            if (vistaActividad.getRdb4().isSelected()) {
                vistaActividad.getLblConfir2().setText("CORRECTO");
                
            } else {
                vistaActividad.getLblConfir2().setText("INCORRECTO");
            }

            if (vistaActividad.getTxtRespuesta1().getText().toUpperCase().equals(vistaActividad.getLblRespC1().getText())) {
                vistaActividad.getLblConfir3().setText("CORRECTO");
                
            } else {
                vistaActividad.getLblConfir3().setText("INCORRECTO");
            }

            if (vistaActividad.getTxtRespuesta2().getText().toUpperCase().equals(vistaActividad.getLblRespC2().getText())) {
                vistaActividad.getLblConfir4().setText("CORRECTO");
                
            } else {
                vistaActividad.getLblConfir4().setText("INCORRECTO");
            }
            vistaActividad.getLblConfir1().setVisible(true);
            vistaActividad.getLblConfir2().setVisible(true);
            vistaActividad.getLblConfir3().setVisible(true);
            vistaActividad.getLblConfir4().setVisible(true);
            vistaActividad.getLblRespC1().setVisible(true);
            vistaActividad.getLblRespC2().setVisible(true);
            vistaResultado1.setVisible(true);
        } else if (e.getSource().equals(vistaResultado1.getBtnFinish()) && vistaResultado1.isVisible()) {
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
    
    
}
