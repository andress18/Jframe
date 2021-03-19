/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;



import Models.Preguntas;
import Models.Topicos;
import Views.Actividades.frmActividadGrand;
import Views.Actividades.frmActividadPeque;
import Views.Edades.frmEdades;
import Views.Inicio.FrmCrearUsuario;
import Views.Inicio.FrmLogin;
import Views.Inicio.frmInicio;
import Views.Notas.Notas;
import Views.PlantillaActividad;
import Views.frmTopicos;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author usuario
 */
public class Controlador {
    PlantillaActividad vistaActividad;
    FrmCrearUsuario UserC;
    FrmLogin User ;
    frmActividadPeque ActP;
    frmEdades Dificultad;
    Topicos topico;
    frmActividadGrand ActG;
    frmInicio formInicio;
    frmTopicos vistaTopico;
    Notas vistaNotas;

    public Controlador(PlantillaActividad vistaActividad, FrmCrearUsuario UserC, FrmLogin User, frmActividadPeque ActP, frmEdades Dificultad, Topicos topico, frmActividadGrand ActG, frmInicio formInicio, frmTopicos vistaTopico, Notas vistaNotas) {
        this.vistaActividad = vistaActividad;
        this.UserC = UserC;
        this.User = User;
        this.ActP = ActP;
        this.Dificultad = Dificultad;
        this.topico = topico;
        this.ActG = ActG;
        this.formInicio = formInicio;
        this.vistaTopico = vistaTopico;
        this.vistaNotas = vistaNotas;
    }
    
    
    
    int n1 = 0, n2 = 0, n3 = 0, n4 = 0, l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0, p1 = 0, p2 = 0, L = 0, L1 = 0,
            L2 = 0;

    public void GenerarPreguntas(ArrayList<Preguntas> lista) {
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
    
    public void cargarImagen(JButton btn, String url){
        ImageIcon boton = new ImageIcon(url);
        Icon icono = new ImageIcon(boton.getImage().getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH));
        btn.setIcon(icono);
    }
    
    public void cargarImagen2(JLabel lbl, String url){
        ImageIcon boton = new ImageIcon(url);
        Icon icono = new ImageIcon(boton.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH));
        lbl.setIcon(icono);
    }
    
    public void quitarBordes(){
        User.getBtnEntrar().setBorder(null);
        User.getBtnCrearL().setBorder(null);
        formInicio.getBtnCamb().setBorder(null);
        formInicio.getBtnConsul().setBorder(null);
        formInicio.getBtnSalir().setBorder(null);
        formInicio.getBtnStar().setBorder(null);
        ActP.getBtnA1().setBorder(null);
        ActP.getBtnA2().setBorder(null);
        ActP.getBtnA3().setBorder(null);
        ActP.getBtnA4().setBorder(null);
        ActP.getBtnEdad().setBorder(null);
        ActG.getBtnG1().setBorder(null);
        ActG.getBtnG2().setBorder(null);
        ActG.getBtnG3().setBorder(null);
        ActG.getBtnG4().setBorder(null);
        ActG.getBtnEdad().setBorder(null);
        vistaTopico.getBtnActividad().setBorder(null);
        vistaTopico.getBtnMenu().setBorder(null);
        vistaNotas.getBtnBusc().setBorder(null);
        vistaNotas.getBtnRegre().setBorder(null);
    }

}
