/*
 * Created by JFormDesigner on Mon Dec 07 13:19:11 COT 2020
 */

package co.edu.udea.MVCDAO.vista;

import co.edu.udea.MVCDAO.dao.impl.EstudianteDAOFILE;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 * @author Diego Munoz
 */
public class VentanaListar extends JFrame {
    EstudianteDAOFILE accesoArchivo = new EstudianteDAOFILE();

    public VentanaListar() {
        initComponents();
        textArea1.setText(accesoArchivo.listarEstudiante());
        textArea1.setEditable(false);
    }

    private void botonSalir_ListarMouseClicked(MouseEvent e) {
        textArea1.setText("");
        this.dispose();
    }

    private void botonIngresarMouseClicked(MouseEvent e) {
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Diego Munoz
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        botonSalir_Listar = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {

            //---- textArea1 ----
            textArea1.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
            scrollPane1.setViewportView(textArea1);
        }

        //---- botonSalir_Listar ----
        botonSalir_Listar.setText("Salir");
        botonSalir_Listar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonIngresarMouseClicked(e);
                botonSalir_ListarMouseClicked(e);
            }
        });

        //---- label1 ----
        label1.setText("Listar Estudiantes");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 248, Short.MAX_VALUE)
                    .addComponent(label1)
                    .addGap(244, 244, 244))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(257, Short.MAX_VALUE)
                    .addComponent(botonSalir_Listar)
                    .addGap(248, 248, 248))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 542, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(botonSalir_Listar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE))
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
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
