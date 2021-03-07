
package proyectoprogramacion;

import DAO.Modelo.Ninos;
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
import controlador.Controlador;
import controlador.ControladorActividades;
import controlador.ControladorBasico;
import controlador.ControladorDificultades;
import controlador.ControladorInicio;
import controlador.ControladorIntermedio;
import controlador.ControladorLogin;
import controlador.ControladorTopico;
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
        
        Controlador controlador = new Controlador(vistaActividad);
        ControladorLogin controladorLogin = new ControladorLogin(ninos, UserC, User, bienve, controlador);
        ControladorInicio controladorInicio = new ControladorInicio(bienve, Dificultad, controlador, vistaTopico);
        ControladorDificultades controladorDificultades = new ControladorDificultades(Dificultad, ActP, ActG, User, controlador);
        ControladorBasico controladorBasico = new ControladorBasico(ActP, vistaTopico, Dificultad);
        ControladorIntermedio controladorIntermedio = new ControladorIntermedio(ActG, vistaTopico, Dificultad);
        ControladorTopico controladorTopico = new ControladorTopico(vistaTopico, Dificultad, vistaActividad, controlador);
        ControladorActividades controladorActividades = new ControladorActividades(vistaActividad, vistaResultado, Dificultad);
        
        controlador.cargarImagen2(User.getLblImageL(), "src/Recursos/Inicio/ProgramInicio3.png");
        controlador.cargarImagen(User.getBtnEntrar(), "src/Recursos/Inicio/Ingreso.png");
        controlador.cargarImagen(User.getBtnCrearL(), "src/Recursos/Inicio/Registro.png");
        User.setVisible(true);
    }
    
}
