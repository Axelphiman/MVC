/*
 * Created by JFormDesigner on Mon Dec 07 13:19:11 COT 2020
 */

package co.edu.udea.MVCDAO.dao.impl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Diego Munoz
 */
public class VentanaListar extends JFrame {
    EstudianteDAOFILE accesoArchivo = new EstudianteDAOFILE();
    public VentanaListar() { initComponents();
        textArea1.setText(accesoArchivo.listarEstudiante());
    }

    private void botonSalir_ListarMouseClicked(MouseEvent e) {
        textArea1.setText("");
       this.dispose();
    }


   

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Diego Munoz
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        botonSalir_Listar = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        //---- botonSalir_Listar ----
        botonSalir_Listar.setText("Salir");
        botonSalir_Listar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonSalir_ListarMouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(158, 158, 158)
                    .addComponent(botonSalir_Listar)
                    .addContainerGap(162, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(botonSalir_Listar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Diego Munoz
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton botonSalir_Listar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
