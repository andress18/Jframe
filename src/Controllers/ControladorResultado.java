/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Edades.frmEdades;
import Views.PlantillaActividad;
import Views.Resultados.dlgResultado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class ControladorResultado implements ActionListener {
    dlgResultado vistaResultado1;
    frmEdades vistaDificultad;
    PlantillaActividad vistaActividad;

    public ControladorResultado(dlgResultado vistaResultado1, frmEdades vistaDificultad, PlantillaActividad vistaActividad) {
        this.vistaResultado1 = vistaResultado1;
        this.vistaDificultad = vistaDificultad;
        this.vistaActividad= vistaActividad;
        this.vistaResultado1.getBtnFinish().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vistaResultado1.getBtnFinish()) && vistaResultado1.isVisible()) {
            //
            
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
