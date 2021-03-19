
package proyectoprogramacion;

import Models.Ninos;
import Models.Topicos;
import Views.PlantillaActividad;
import Views.frmTopicos;

import Views.Actividades.frmActividadGrand;
import Views.Actividades.frmActividadPeque;
import Views.Edades.frmEdades;
import Views.Inicio.FrmCrearUsuario;
import Views.Inicio.FrmLogin;
import Views.Inicio.frmInicio;
import Views.Notas.Notas;
import Views.Resultados.dlgResultado;
import Controllers.Controlador;
import Controllers.ControladorActividades;
import Controllers.ControladorBasico;
import Controllers.ControladorDificultades;
import Controllers.ControladorInicio;
import Controllers.ControladorIntermedio;
import Controllers.ControladorLogin;
import Controllers.ControladorNotas;
import Controllers.ControladorResultado;
import Controllers.ControladorTopico;

public class ProyectoProgramacion {

    public static void main(String[] args) {
        Ninos ninos = new Ninos();
        FrmCrearUsuario UserC = new FrmCrearUsuario();
        FrmLogin User = new FrmLogin();
        frmActividadPeque ActP = new frmActividadPeque();
        frmEdades Dificultad = new frmEdades();
        Topicos topico = new Topicos();
        frmActividadGrand ActG = new frmActividadGrand();
        frmInicio formInicio = new frmInicio();
        frmTopicos vistaTopico = new frmTopicos();
        PlantillaActividad vistaActividad = new PlantillaActividad();
        dlgResultado vistaResultado = new dlgResultado(vistaActividad, true);

        Notas vistaNotas = new Notas();
        ControladorNotas controladorNotas = new ControladorNotas(vistaNotas, formInicio);

        Controlador controlador = new Controlador(vistaActividad, UserC, User, ActP, Dificultad, topico, ActG, formInicio, vistaTopico, vistaNotas);
        
        ControladorLogin controladorLogin = new ControladorLogin(ninos, UserC, User, formInicio, controlador);
        
        ControladorInicio controladorInicio = new ControladorInicio(formInicio, Dificultad, controlador, vistaTopico,
                vistaNotas, User);
        
        ControladorDificultades controladorDificultades = new ControladorDificultades(Dificultad, ActP, ActG, User,
                controlador, formInicio);
        
        ControladorBasico controladorBasico = new ControladorBasico(ActP, vistaTopico, Dificultad);
        
        ControladorIntermedio controladorIntermedio = new ControladorIntermedio(ActG, vistaTopico, Dificultad);
        
        ControladorTopico controladorTopico = new ControladorTopico(vistaTopico, Dificultad, vistaActividad,
                controlador);
        
        ControladorActividades controladorActividades = new ControladorActividades(vistaActividad, vistaResultado,
                Dificultad);
        
        ControladorResultado controladorResultado = new ControladorResultado(vistaResultado, Dificultad, vistaActividad,
                formInicio, controladorDificultades);

        controlador.cargarImagen2(User.getLblImageL(), "src/Recursos/Inicio/ProgramInicio3.png");
        controlador.cargarImagen(User.getBtnEntrar(), "src/Recursos/Inicio/Ingreso.png");
        controlador.cargarImagen(User.getBtnCrearL(), "src/Recursos/Inicio/Registro.png");
        controlador.quitarBordes();
        User.setVisible(true);
    }
}
