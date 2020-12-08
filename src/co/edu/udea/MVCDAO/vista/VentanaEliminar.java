/*
 * Created by JFormDesigner on Mon Dec 07 14:47:44 COT 2020
 */

package co.edu.udea.MVCDAO.vista;

import co.edu.udea.MVCDAO.dao.impl.EstudianteDAOFILE;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Diego Munoz
 */
public class VentanaEliminar extends JFrame {
    EstudianteDAOFILE accesoArchivo = new EstudianteDAOFILE();

    public VentanaEliminar() {
        initComponents();
    }

    private void botonSalir_EliminarMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void botonEliminar_EliminarMouseClicked(MouseEvent e) {
        if (accesoArchivo.eliminarEstudiante(textField1.getText())) {
            textField1.setText("");
            JOptionPane.showMessageDialog(this, "Se ha eliminado satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el estudiante");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Diego Munoz
        label1 = new JLabel();
        textField1 = new JTextField();
        botonSalir_Eliminar = new JButton();
        botonEliminar_Eliminar = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Numero documento:");

        //---- botonSalir_Eliminar ----
        botonSalir_Eliminar.setText("Salir");
        botonSalir_Eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonSalir_EliminarMouseClicked(e);
            }
        });

        //---- botonEliminar_Eliminar ----
        botonEliminar_Eliminar.setText("Eliminar");
        botonEliminar_Eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonEliminar_EliminarMouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(label1)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(botonSalir_Eliminar)
                                                .addGap(0, 159, Short.MAX_VALUE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addComponent(botonEliminar_Eliminar)))
                                .addGap(27, 27, 27))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonEliminar_Eliminar)
                                        .addComponent(label1)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSalir_Eliminar)
                                .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Diego Munoz
    private JLabel label1;
    private JTextField textField1;
    private JButton botonSalir_Eliminar;
    private JButton botonEliminar_Eliminar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
