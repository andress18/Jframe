
package proyectoprogramacion;

import DAO.Modelo.Ninos;
import DAO.Modelo.Topicos;
import Vista.PlantillaActividad;
import Vista.frmTopicos;
import com.ActividadGrand.frmTopicoUnoGrand;
import com.Actividades.frmActividadGrand;
import com.Actividades.frmActividadPeque;
import com.Edades.frmEdades;
import com.Inicio.FrmCrearUsuario;
import com.Inicio.FrmLogin;
import com.Inicio.frmInicio;
import com.Resultados.dlgResultado;
import controlador.Controlador;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ProyectoProgramacion {

    public static void main(String[] args) {
        Ninos ninos = new Ninos();
        FrmCrearUsuario UserC = new FrmCrearUsuario();
        FrmLogin User = new FrmLogin();
        frmActividadPeque ActP = new frmActividadPeque();
        frmEdades Dificultad = new frmEdades();
        Topicos topico = new Topicos();
        frmActividadGrand ActG = new frmActividadGrand();
        frmInicio bienve = new frmInicio();
        frmTopicos vistaTopico = new frmTopicos();
        PlantillaActividad vistaActividad = new PlantillaActividad();
        dlgResultado vistaResultado = new dlgResultado(vistaActividad, true);
        
        Controlador controlador = new Controlador(ninos,topico, UserC, User, ActP,ActG, Dificultad, bienve, vistaTopico, vistaActividad, vistaResultado);
        
        ImageIcon logo = new ImageIcon("src/Recursos/Inicio/ProgramInicio3.png");
        Icon icono1 = new ImageIcon(logo.getImage().getScaledInstance(User.getLblImageL().getWidth(), User.getLblImageL().getHeight(), Image.SCALE_SMOOTH));
        User.getLblImageL().setIcon(icono1);

        ImageIcon boton1 = new ImageIcon("src/Recursos/Inicio/Ingreso.png");
        Icon icono2 = new ImageIcon(boton1.getImage().getScaledInstance(User.getBtnEntrar().getWidth(), User.getBtnEntrar().getHeight(), Image.SCALE_SMOOTH));
        User.getBtnEntrar().setIcon(icono2);

        ImageIcon boton2 = new ImageIcon("src/Recursos/Inicio/Registro.png");
        Icon icono3 = new ImageIcon(boton2.getImage().getScaledInstance(User.getBtnCrearL().getWidth(), User.getBtnCrearL().getHeight(), Image.SCALE_SMOOTH));
        User.getBtnCrearL().setIcon(icono3);
        User.repaint();
        User.setVisible(true);
    }
    
}
