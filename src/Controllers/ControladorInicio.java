/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.frmTopicos;
import Views.Edades.frmEdades;
import Views.Inicio.FrmLogin;
import Views.Inicio.frmInicio;
import Views.Notas.Notas;
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
    Notas vistaNotas;
    FrmLogin vistaLogin;

    public ControladorInicio(frmInicio vistaBienvenido, frmEdades vistaDificultad, Controlador controlador,
            frmTopicos vistaTopicos, Notas vistaNotas, FrmLogin vistaLogin) {
        this.vistaBienvenido = vistaBienvenido;
        this.vistaDificultad = vistaDificultad;
        this.controlador = controlador;
        this.vistaTopicos = vistaTopicos;
        this.vistaNotas = vistaNotas;
        this.vistaLogin = vistaLogin;
        this.vistaBienvenido.getBtnStar().addActionListener(this);
        this.vistaBienvenido.getBtnCamb().addActionListener(this);
        this.vistaBienvenido.getBtnConsul().addActionListener(this);
        this.vistaBienvenido.getBtnSalir().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vistaBienvenido.getBtnStar()) && vistaBienvenido.isVisible()) { // al presionar
            controlador.cargarImagen(vistaTopicos.getBtnMenu(), "src/Recursos/Niveles/Regresar.png");
            controlador.cargarImagen(vistaTopicos.getBtnActividad(), "src/Recursos/Topicos/actividad.png");
            vistaBienvenido.dispose();
            String name = vistaBienvenido.getLblNom().getText();
            vistaDificultad.setNombreNino(name);
            vistaDificultad.setVisible(true);
            // vistaBienvenido.lblNom.setText("");

        } else if (e.getSource().equals(vistaBienvenido.getBtnConsul()) && vistaBienvenido.isVisible()) {
            controlador.cargarImagen(vistaNotas.getBtnBusc(), "src/Recursos/Notas/busqueda.png");
            controlador.cargarImagen(vistaNotas.getBtnRegre(), "src/Recursos/Niveles/Regresar.png");
            vistaNotas.setVisible(true);
            vistaBienvenido.dispose();
        } else if (e.getSource().equals(vistaBienvenido.getBtnCamb()) && vistaBienvenido.isVisible()) {
            vistaLogin.setVisible(true);
            vistaBienvenido.dispose();
        } else if (e.getSource().equals(vistaBienvenido.getBtnSalir()) && vistaBienvenido.isVisible()) {
            System.exit(0);
        }
    }

}
