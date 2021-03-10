package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Implements.NotasDAOImp;
import Models.Nota;
import Views.Notas.Notas;

public class ControladorNotas implements ActionListener {
    Notas vistaNotas = new Notas();

    public ControladorNotas(Notas vistaNotas) {
        this.vistaNotas = vistaNotas;
        this.vistaNotas.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        NotasDAOImp notasDao = new NotasDAOImp();
        if (e.getSource().equals(vistaNotas.getBtnBuscar())) {

            String nombre = vistaNotas.getTxtNombre().getText();
            String apellido = vistaNotas.getTxtApellido().getText();
            int dificultadId = 1;

            if (vistaNotas.getRbtBasic().isSelected())
                dificultadId = 1;
            else if (vistaNotas.getRbtMedio().isSelected())
                dificultadId = 2;

            List<Nota> notas = new ArrayList<>();
            notas = notasDao.getNotas(nombre, apellido, dificultadId);

            DefaultTableModel table = (DefaultTableModel) vistaNotas.getTblNotas().getModel();

            while (table.getRowCount() > 0) {
                table.removeRow(0);
            }
            
            if (notas.size() > 0) {
                notas.forEach(nota -> {

                    Object[] row = { nota.getNino().toString(), nota.getNivel(), nota.getNota() };
                    table.addRow(row);
                });
            } else {
                Object[] row = { "Sin datos", "Sin datos", "Sin datos" };
                table.addRow(row);
            }

        }

    }

}
