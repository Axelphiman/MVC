/*
 * Created by JFormDesigner on Mon Dec 07 14:29:51 COT 2020
 */

package co.edu.udea.MVCDAO.dao.impl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Diego Munoz
 */
public class VentanaConsultar extends JFrame {
    EstudianteDAOFILE accesoArchivo = new EstudianteDAOFILE();

    public VentanaConsultar() {
        initComponents();
    }

    private void botonConsultar_ConsultarMouseClicked(MouseEvent e) {
        String estudianteConsultado = accesoArchivo.consultarEstudiante(textField1.getText());
        if (estudianteConsultado != null) {
            textArea1.setText(estudianteConsultado);
            textArea1.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el estudiante");
        }

    }

    private void botonSalir_ConsultarMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Diego Munoz
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        label1 = new JLabel();
        textField1 = new JTextField();
        botonConsultar_Consultar = new JButton();
        botonSalir_Consultar = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        //---- label1 ----
        label1.setText("Ingresa documento:");

        //---- botonConsultar_Consultar ----
        botonConsultar_Consultar.setText("Consultar");
        botonConsultar_Consultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonConsultar_ConsultarMouseClicked(e);
            }
        });

        //---- botonSalir_Consultar ----
        botonSalir_Consultar.setText("Salir");
        botonSalir_Consultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonSalir_ConsultarMouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                                .addComponent(label1)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(botonConsultar_Consultar))))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(botonSalir_Consultar)))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label1)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonConsultar_Consultar))
                                .addGap(18, 18, 18)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonSalir_Consultar)
                                .addContainerGap(8, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Diego Munoz
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JLabel label1;
    private JTextField textField1;
    private JButton botonConsultar_Consultar;
    private JButton botonSalir_Consultar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
