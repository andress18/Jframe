/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Implements.PreguntasDAOImp;
import Models.Preguntas;
import Views.PlantillaActividad;
import Views.frmTopicos;
import Views.Edades.frmEdades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.io.*;
import com.sun.speech.freetts.*;

public class ControladorTopico implements ActionListener {
    frmTopicos vistaTopicos;
    frmEdades vistaDificultad;
    PlantillaActividad vistaActividad;
    Controlador controlador;
    private static final String VOICENAME="kevin16";  //voz

    public ControladorTopico(frmTopicos vistaTopicos, frmEdades vistaDificultad, PlantillaActividad vistaActividad,
            Controlador controlador) {
        this.vistaTopicos = vistaTopicos;
        this.vistaDificultad = vistaDificultad;
        this.vistaActividad = vistaActividad;
        this.controlador = controlador;
        this.vistaTopicos.getBtnActividad().addActionListener(this);
        this.vistaTopicos.getBtnMenu().addActionListener(this);
        this.vistaTopicos.getBtnEscu().addActionListener(this);
        this.vistaTopicos.getBtnEscu1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PreguntasDAOImp preguntasDao = new PreguntasDAOImp();
        if (e.getSource().equals(vistaTopicos.getBtnMenu()) && vistaTopicos.isVisible()) {
            vistaDificultad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("PERSONAL PRONOUNS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(1));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("PREPOSITIONS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(2));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("ADJECTIVES Ending in -ed and -ing")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(3));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("CARDINAL NUMBERS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(4));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("DATE")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(5));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("PRESENT CONTINIOUS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(6));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("VERB IN PAST SIMPLE")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(7));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("IRREGULARS VERBS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(8));
            controlador.GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        }else if (e.getSource().equals(vistaTopicos.getBtnEscu())) {
            Voice voice;
            VoiceManager vm = VoiceManager.getInstance();
            voice=vm.getVoice(VOICENAME);
            voice.allocate();

            try {
                voice.speak(vistaTopicos.getLblEjemplo().getText());
            } catch (Exception ex) {
            }
        }
        else if (e.getSource().equals(vistaTopicos.getBtnEscu1())) {
            Voice voice;
            VoiceManager vm = VoiceManager.getInstance();
            voice=vm.getVoice(VOICENAME);
            voice.allocate();

            try {
                voice.speak(vistaTopicos.getLblIngles().getText());
            } catch (Exception ex) {
            }
        }
    }

}
