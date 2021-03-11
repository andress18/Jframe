/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Implements.UsuarioDAOImp;
import Models.Ninos;
import Views.Inicio.FrmCrearUsuario;
import Views.Inicio.FrmLogin;
import Views.Inicio.frmInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ControladorLogin implements ActionListener {
    Ninos ninos;
    FrmCrearUsuario vistaUserC;
    FrmLogin vistaUser;
    frmInicio vistaBienvenido;
    Controlador controlador;

    public ControladorLogin(Ninos ninos, FrmCrearUsuario vistaUserC, FrmLogin vistaUser, frmInicio vistaBienvenido,
            Controlador controlador) {
        this.ninos = ninos;
        this.vistaUserC = vistaUserC;
        this.vistaUser = vistaUser;
        this.vistaBienvenido = vistaBienvenido;
        this.controlador = controlador;
        this.vistaUser.getBtnEntrar().addActionListener(this);
        this.vistaUser.getBtnCrearL().addActionListener(this);
        this.vistaUserC.getBtnCrear().addActionListener(this);
        this.vistaUserC.getBtnRegre().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UsuarioDAOImp userDao = new UsuarioDAOImp();
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
        } else if (e.getSource().equals(vistaUserC.getBtnRegre()) && vistaUserC.isVisible()) {
            vistaUserC.dispose();
            vistaUser.setVisible(true);
            vistaUserC.getTxtNombre().setText("");
            vistaUserC.getTxtApellido().setText("");

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
                controlador.cargarImagen(vistaBienvenido.getBtnCamb(), "src/Recursos/Sistema/CambioUser.png");
                controlador.cargarImagen(vistaBienvenido.getBtnStar(), "src/Recursos/Sistema/Temas.png");
                controlador.cargarImagen(vistaBienvenido.getBtnConsul(), "src/Recursos/Sistema/notas.png");
                controlador.cargarImagen(vistaBienvenido.getBtnSalir(), "src/Recursos/Sistema/Salida.png");
                vistaBienvenido.setVisible(true);
                vistaUser.getTxtName().setText("");
                vistaUser.getTxtName1().setText("");

            }
        } else if (e.getSource().equals(vistaUser.getBtnCrearL()) && vistaUser.isVisible()) { // Para ir a crear usuario
            controlador.cargarImagen(vistaUserC.getBtnRegre(), "src/Recursos/Niveles/Regresar.png");
            vistaUser.dispose();
            vistaUserC.setVisible(true);
            vistaUser.getTxtName().setText("");
            vistaUser.getTxtName1().setText("");

        }
    }

}
