/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.Implements.ClasesDAOImp;
import DAO.Implements.PreguntasDAOImp;
import DAO.Implements.TopicoDAO;
import DAO.Implements.TopicoDAOImp;
import DAO.Implements.UsuarioDAOImp;
import DAO.Modelo.Clases;
import DAO.Modelo.Ninos;
import DAO.Modelo.Preguntas;
import DAO.Modelo.Topicos;
import Vista.PlantillaActividad;
import Vista.frmTopicos;
import com.Actividades.frmActividadGrand;
import com.Actividades.frmActividadPeque;
import com.Edades.frmEdades;
import com.Inicio.FrmCrearUsuario;
import com.Inicio.FrmLogin;
import com.Inicio.frmInicio;
import com.Resultados.dlgResultado;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Controlador implements ActionListener {
    Ninos ninos;
    Topicos topicos;
    FrmCrearUsuario vistaUserC;
    FrmLogin vistaUser;
    frmActividadPeque vistaPeque;
    frmActividadGrand vistaGrandes;
    frmEdades vistaDificultad;
    frmInicio vistaBienvenido;
    frmTopicos vistaTopicos;
    PlantillaActividad vistaActividad;
    dlgResultado vistaResultado1;

    public Controlador(Ninos ninos, Topicos topicos, FrmCrearUsuario vistaUserC, FrmLogin vistaUser,
            frmActividadPeque vistaPeque, frmActividadGrand vistaGrandes, frmEdades vistaDificultad,
            frmInicio vistaBienvenido, frmTopicos vistaTopicos, PlantillaActividad vistaActividad,
            dlgResultado vistaResultado1) {
        this.ninos = ninos;
        this.topicos = topicos;
        this.vistaUserC = vistaUserC;
        this.vistaUser = vistaUser;
        this.vistaPeque = vistaPeque;
        this.vistaGrandes = vistaGrandes;
        this.vistaDificultad = vistaDificultad;
        this.vistaBienvenido = vistaBienvenido;
        this.vistaTopicos = vistaTopicos;
        this.vistaActividad = vistaActividad;
        this.vistaResultado1 = vistaResultado1;
        this.vistaUserC.getBtnCrear().addActionListener(this);
        this.vistaPeque.getBtnA1().addActionListener(this);
        this.vistaPeque.getBtnA2().addActionListener(this);
        this.vistaPeque.getBtnA3().addActionListener(this);
        this.vistaPeque.getBtnA4().addActionListener(this);
        this.vistaPeque.getBtnEdad().addActionListener(this);
        this.vistaGrandes.getBtnG1().addActionListener(this);
        this.vistaGrandes.getBtnG2().addActionListener(this);
        this.vistaGrandes.getBtnG3().addActionListener(this);
        this.vistaGrandes.getBtnG4().addActionListener(this);
        this.vistaGrandes.getBtnEdad().addActionListener(this);
        this.vistaUser.getBtnEntrar().addActionListener(this);
        this.vistaBienvenido.getBtnStar().addActionListener(this);
        this.vistaTopicos.getBtnActividad().addActionListener(this);
        this.vistaTopicos.getBtnMenu().addActionListener(this);
        this.vistaActividad.getBtnTerminar().addActionListener(this);
        this.vistaDificultad.getBtnPeque().addActionListener(this);
        this.vistaDificultad.getBtnGrand().addActionListener(this);
        this.vistaDificultad.getBtnCamb().addActionListener(this);
        this.vistaResultado1.getBtnFinish().addActionListener(this);
    }

    int n1 = 0, n2 = 0, n3 = 0, n4 = 0, l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0, p1 = 0, p2 = 0, L = 0, L1 = 0,
            L2 = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        UsuarioDAOImp userDao = new UsuarioDAOImp();
        ClasesDAOImp clasesDao = new ClasesDAOImp();
        PreguntasDAOImp preguntasDao = new PreguntasDAOImp();

        if (e.getSource().equals(vistaUserC.getBtnCrear()) && vistaUserC.isVisible()) { // Crear nuevo usuario
            if ((vistaUserC.getTxtNombre().getText().isEmpty()) || (vistaUserC.getTxtApellido().getText().isEmpty())) {
                JOptionPane.showMessageDialog(vistaUserC, "Datos no Ingresados", "Error de validacion",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                ninos.setNombre(vistaUserC.getTxtNombre().getText().toUpperCase());
                ninos.setApellido(vistaUserC.getTxtApellido().getText().toUpperCase());
                userDao.Insertar(ninos);
                JOptionPane.showMessageDialog(vistaUserC, "Datos creados exitosamente", "Creacion",
                        JOptionPane.INFORMATION_MESSAGE);
                vistaUserC.dispose();
                vistaUser.setVisible(true);
                vistaUserC.getTxtNombre().setText("");
                vistaUserC.getTxtApellido().setText("");
                System.out.println("Datos incertados correctamente");
            }
        } else if (e.getSource().equals(vistaUser.getBtnEntrar()) && vistaUser.isVisible()) { // Logonearte
            // TODO Tiene que verificar si los nombre y apellidos estan en la base de datos
            // userDao.Consultar(vistaUser.getTxtName().getText(),
            // vistaUser.getTxtName1().getText());
            if ((userDao.Consultar(vistaUser.getTxtName().getText().toUpperCase(),
                    vistaUser.getTxtName1().getText().toUpperCase())) == null) {
                JOptionPane.showMessageDialog(vistaUserC, "Datos no encontrados", "Error de validacion",
                        JOptionPane.ERROR_MESSAGE);
                vistaUser.getTxtName().setText("");
                vistaUser.getTxtName1().setText("");
                vistaUser.getTxtName().getFocusListeners();
            } else {
                vistaBienvenido.lblNom.setText(vistaUser.getTxtName().getText().toUpperCase() + " "
                        + vistaUser.getTxtName1().getText().toUpperCase());
                vistaUser.dispose();
                vistaBienvenido.setVisible(true);
                vistaUser.getTxtName().setText("");
                vistaUser.getTxtName1().setText("");
                
            }
        } else if (e.getSource().equals(vistaUser.getBtnCrearL()) && vistaUser.isVisible()) { // Para ir a crear usuario
            vistaUser.dispose();
            vistaUserC.setVisible(true);
            vistaUser.getTxtName().setText("");
            vistaUser.getTxtName1().setText("");
        } else if (e.getSource().equals(vistaBienvenido.getBtnStar()) && vistaBienvenido.isVisible()) { // al presionar
                                                                                                        // star
            vistaBienvenido.dispose();
            vistaDificultad.setVisible(true);
            vistaBienvenido.lblNom.setText("");
        } else if (e.getSource().equals(vistaDificultad.getBtnCamb()) && vistaDificultad.isVisible()) { // Cuando
                                                                                                        // quieres
                                                                                                        // cambiar de
                                                                                                        // usuario
            vistaDificultad.dispose();
            vistaUser.setVisible(true);
        } else if (e.getSource().equals(vistaDificultad.getBtnGrand()) && vistaDificultad.isVisible()) { // Al presionar
                                                                                                         // en
                                                                                                         // Intermedio
            vistaDificultad.dispose();
            vistaGrandes.setVisible(true);
        } else if (e.getSource().equals(vistaDificultad.getBtnPeque()) && vistaDificultad.isVisible()) { // Al presionar
                                                                                                         // en Basico
            vistaPeque.setVisible(true);
            vistaDificultad.dispose();
        } else if (e.getSource().equals(vistaPeque.getBtnA1()) && vistaPeque.isVisible()) { // Topico Tema 1
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
        } else if (e.getSource().equals(vistaGrandes.getBtnEdad()) && vistaGrandes.isVisible()) {
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

        } else if (e.getSource().equals(vistaTopicos.getBtnMenu()) && vistaTopicos.isVisible()) {
            vistaDificultad.setVisible(true);
            vistaTopicos.dispose();
        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("PERSONAL PRONOUNS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(1));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("PREPOSITIONS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(2));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("ADJECTIVES Ending in -ed and -ing")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(3));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("CARDINAL NUMBERS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(4));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("DATE")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(5));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("PRESENT CONTINIOUS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(6));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("VERB IN PAST SIMPLE")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(7));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaTopicos.getBtnActividad())
                && vistaTopicos.getLblTitulo().getText().equals("IRREGULARS VERBS")) {
            ArrayList<Preguntas> lista = preguntasDao.ConsultarTodos(new BigDecimal(8));
            GenerarPreguntas(lista);
            vistaActividad.setVisible(true);
            vistaTopicos.dispose();

        } else if (e.getSource().equals(vistaActividad.getBtnTerminar()) && vistaActividad.isVisible()) {

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

            if (vistaActividad.getTxtRespuesta1().getText().toUpperCase()
                    .equals(vistaActividad.getLblRespC1().getText())) {
                vistaActividad.getLblConfir3().setText("CORRECTO");
            } else {
                vistaActividad.getLblConfir3().setText("INCORRECTO");
            }

            if (vistaActividad.getTxtRespuesta2().getText().toUpperCase()
                    .equals(vistaActividad.getLblRespC2().getText())) {
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

        // TODO Realizar validaciones(else if) para cada boton de los frmActividadPeque,
        // frmActividadGrand : se pueden nombrar los botones como se guste
    }

    private void GenerarPreguntas(ArrayList<Preguntas> lista) {
        Aleatorio a1 = new Aleatorio(0, 4);
        Aleatorio a2 = new Aleatorio(1, 3);
        Aleatorio a3 = new Aleatorio(1, 2);
        L = a3.generar();
        n1 = a1.generar();
        n2 = a1.generar();
        n3 = a1.generar();
        n4 = a1.generar();
        p1 = a2.generar();
        p2 = a2.generar();
        if (p1 == 1) {
            l1 = 400;
            l2 = 30; // Para que la posicion de los rdb sea aleatoria
            l3 = 200;
        } else if (p1 == 2) {
            l1 = 30;
            l2 = 200;
            l3 = 400;
        } else {
            l1 = 200;
            l2 = 400;
            l3 = 30;
        }
        if (p2 == 1) {
            l4 = 20;
            l5 = 190; // Para que la posicion de los rdb de pregunta 2 sea aleatoria
            l6 = 390;
        } else if (p2 == 2) {
            l4 = 190;
            l5 = 390;
            l6 = 20;
        } else {
            l4 = 390;
            l5 = 20;
            l6 = 190;
        }
        if (L == 1) {
            L1 = 306;
            L2 = 46;
        } else {
            L1 = 46;
            L2 = 306;
        }
        vistaActividad.getPanelS().setLocation(10, L1);
        vistaActividad.getPanelC().setLocation(10, L2);
        vistaActividad.getRdb1().setLocation(l1, 80);
        vistaActividad.getRdb2().setLocation(l2, 80);
        vistaActividad.getRdb3().setLocation(l3, 80);
        vistaActividad.getRdb4().setLocation(l4, 80);
        vistaActividad.getRdb5().setLocation(l5, 80);
        vistaActividad.getRdb6().setLocation(l6, 80);
        vistaActividad.getLblConfir1().setVisible(false);
        vistaActividad.getLblConfir2().setVisible(false);
        vistaActividad.getLblConfir3().setVisible(false);
        vistaActividad.getLblConfir4().setVisible(false);
        vistaActividad.getLblRespC1().setVisible(false);
        vistaActividad.getLblRespC2().setVisible(false);

        for (int i = 0; i < lista.size(); i++) {
            vistaActividad.getLblPreguntaSelect1().setText(lista.get(n1).getPregunta());
            vistaActividad.getRdb1().setText(lista.get(n1).getRespuesta());
            vistaActividad.getRdb2().setText(lista.get(n1).getOpcion1());
            vistaActividad.getRdb3().setText(lista.get(n1).getOpcion2());
            vistaActividad.getLblPreguntaSelect2().setText(lista.get(n2).getPregunta());
            vistaActividad.getRdb4().setText(lista.get(n2).getRespuesta());
            vistaActividad.getRdb5().setText(lista.get(n2).getOpcion1());
            vistaActividad.getRdb6().setText(lista.get(n2).getOpcion2());
            vistaActividad.getLblPreguntaCompl3().setText(lista.get(n3).getPregunta());
            vistaActividad.getLblRespC1().setText(lista.get(n3).getRespuesta());
            vistaActividad.getLblPreguntaCompl4().setText(lista.get(n4).getPregunta());
            vistaActividad.getLblRespC2().setText(lista.get(n4).getRespuesta());
        }
    }

}
