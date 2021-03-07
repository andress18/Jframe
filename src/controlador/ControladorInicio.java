/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.frmTopicos;
import com.Edades.frmEdades;
import com.Inicio.frmInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class ControladorInicio implements ActionListener {
    frmInicio vistaBienvenido;
    frmEdades vistaDificultad;
    Controlador controlador;
    frmTopicos vistaTopicos;

    public ControladorInicio(frmInicio vistaBienvenido, frmEdades vistaDificultad, Controlador controlador, frmTopicos vistaTopicos) {
        this.vistaBienvenido = vistaBienvenido;
        this.vistaDificultad = vistaDificultad;
        this.controlador = controlador;
        this.vistaTopicos = vistaTopicos;
        this.vistaBienvenido.getBtnStar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vistaBienvenido.getBtnStar()) && vistaBienvenido.isVisible()) { // al presionar
            controlador.cargarImagen(vistaTopicos.getBtnMenu(), "src/Recursos/Niveles/Regresar.png");
            controlador.cargarImagen(vistaTopicos.getBtnActividad(), "src/Recursos/Topicos/actividad.png");
            vistaBienvenido.dispose();
            vistaDificultad.setVisible(true);
            vistaBienvenido.lblNom.setText("");
            
        }
    }
    
    
}
