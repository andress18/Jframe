/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Actividades.frmActividadGrand;
import Views.Actividades.frmActividadPeque;
import Views.Edades.frmEdades;
import Views.Inicio.FrmLogin;
import Views.Inicio.frmInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author usuario
 */
public class ControladorDificultades implements ActionListener {
    frmEdades vistaDificultad;
    frmActividadPeque vistaPeque;
    frmActividadGrand vistaGrandes;
    FrmLogin vistaUser;
    Controlador controlador;
    frmInicio vistaInicio;
    private int dificultad = 1;

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public ControladorDificultades(frmEdades vistaDificultad, frmActividadPeque vistaPeque,
            frmActividadGrand vistaGrandes, FrmLogin vistaUser, Controlador controlador, frmInicio vistaInicio) {
        this.vistaDificultad = vistaDificultad;
        this.vistaPeque = vistaPeque;
        this.vistaGrandes = vistaGrandes;
        this.vistaUser = vistaUser;
        this.controlador = controlador;
        this.vistaInicio = vistaInicio;
        this.vistaDificultad.getBtnPeque().addActionListener(this);
        this.vistaDificultad.getBtnGrand().addActionListener(this);
        this.vistaDificultad.getBtnCamb().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vistaDificultad.getBtnCamb()) && vistaDificultad.isVisible()) { // Cuando
            vistaDificultad.dispose();
            vistaInicio.setVisible(true);

        } else if (e.getSource().equals(vistaDificultad.getBtnGrand()) && vistaDificultad.isVisible()) { // Al presionar
            controlador.cargarImagen(vistaGrandes.getBtnG3(), "src/Recursos/Topicos/pastsimple.png");
            controlador.cargarImagen(vistaGrandes.getBtnG2(), "src/Recursos/Topicos/presentecontinuos.png");
            controlador.cargarImagen(vistaGrandes.getBtnG4(), "src/Recursos/Topicos/irregularverbs.png");
            controlador.cargarImagen(vistaGrandes.getBtnG1(), "src/Recursos/Topicos/date.png");
            controlador.cargarImagen(vistaGrandes.getBtnEdad(), "src/Recursos/Niveles/Regresar.png");
            dificultad = 2;
            vistaDificultad.dispose();
            vistaPeque.setNombreNino(vistaDificultad.getNombreNino());
            vistaPeque.setDificultad(dificultad);
            vistaGrandes.setVisible(true);

        } else if (e.getSource().equals(vistaDificultad.getBtnPeque()) && vistaDificultad.isVisible()) { // Al presionar
            controlador.cargarImagen(vistaPeque.getBtnA1(), "src/Recursos/Topicos/pronouns.png");
            controlador.cargarImagen(vistaPeque.getBtnA3(), "src/Recursos/Topicos/adjectives.png");
            controlador.cargarImagen(vistaPeque.getBtnA4(), "src/Recursos/Topicos/numbers.png");
            controlador.cargarImagen(vistaPeque.getBtnA2(), "src/Recursos/Topicos/prepositions.png");
            controlador.cargarImagen(vistaPeque.getBtnEdad(), "src/Recursos/Niveles/Regresar.png");
            dificultad = 1;
            vistaDificultad.dispose();
            vistaPeque.setNombreNino(vistaDificultad.getNombreNino());
            vistaPeque.setDificultad(dificultad);
            vistaPeque.setVisible(true);

        }
    }

}
