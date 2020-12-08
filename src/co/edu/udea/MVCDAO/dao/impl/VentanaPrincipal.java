/*
 * Created by JFormDesigner on Mon Dec 07 11:56:07 COT 2020
 */

package co.edu.udea.MVCDAO.dao.impl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
import net.miginfocom.swing.*;

/**
 * @author Diego Munoz
 */
public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        initComponents();
    }

    private void botonIngresarMouseClicked(MouseEvent e) {
        VentanaIngresar ventanaIngresar = new VentanaIngresar();
        ventanaIngresar.setVisible(true);
    }

    private void botonListarMouseClicked(MouseEvent e) {
        VentanaListar ventanaListar = new VentanaListar();
        ventanaListar.setVisible(true);

    }

    private void botonConsultarMouseClicked(MouseEvent e) {
        VentanaConsultar ventanaConsultar = new VentanaConsultar();
        ventanaConsultar.setVisible(true);
    }

    private void botonEliminarMouseClicked(MouseEvent e) {
        VentanaEliminar ventanaEliminar = new VentanaEliminar();
        ventanaEliminar.setVisible(true);
    }

    private void botonActualizarMouseClicked(MouseEvent e) {
    VentanaActualizar ventanaActualizar = new VentanaActualizar();
    ventanaActualizar.setVisible(true);
    }

    private void botonSalirMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        botonIngresar = new JButton();
        botonListar = new JButton();
        botonConsultar = new JButton();
        botonEliminar = new JButton();
        botonActualizar = new JButton();
        botonSalir = new JButton();
        label1 = new JLabel();

        //======== this ========
        setResizable(false);
        Container contentPane = getContentPane();

        //---- botonIngresar ----
        botonIngresar.setText("Ingresar");
        botonIngresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonIngresarMouseClicked(e);
            }
        });

        //---- botonListar ----
        botonListar.setText("Listar");
        botonListar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonListarMouseClicked(e);
            }
        });

        //---- botonConsultar ----
        botonConsultar.setText("Consultar");
        botonConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonConsultarMouseClicked(e);
            }
        });

        //---- botonEliminar ----
        botonEliminar.setText("Eliminar");
        botonEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonEliminarMouseClicked(e);
            }
        });

        //---- botonActualizar ----
        botonActualizar.setText("Actualizar");
        botonActualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonActualizarMouseClicked(e);
            }
        });

        //---- botonSalir ----
        botonSalir.setText("Salir");
        botonSalir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonSalirMouseClicked(e);
            }
        });

        //---- label1 ----
        label1.setText("Gesti\u00f3n de Estudiantes");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 5f));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonIngresar, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonConsultar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonListar, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonActualizar, GroupLayout.Alignment.TRAILING))
                    .addGap(26, 26, 26))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(botonIngresar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonListar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(botonConsultar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonActualizar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEliminar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSalir, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton botonIngresar;
    private JButton botonListar;
    private JButton botonConsultar;
    private JButton botonEliminar;
    private JButton botonActualizar;
    private JButton botonSalir;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
