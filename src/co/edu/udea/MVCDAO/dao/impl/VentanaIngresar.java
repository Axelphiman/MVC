/*
 * Created by JFormDesigner on Mon Dec 07 12:09:18 COT 2020
 */

package co.edu.udea.MVCDAO.dao.impl;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import com.intellij.uiDesigner.core.*;

/**
 * @author Diego Munoz
 */
public class VentanaIngresar extends JFrame {
    public VentanaIngresar() {
        initComponents();
    }
    EstudianteDAOFILE accesoArchivo = new EstudianteDAOFILE();
    private void botonIngresar_ingresarMouseClicked(MouseEvent e) {
        String documento = textField4.getText();
        String nombre = textField1.getText();
        String genero = textField3.getText();
        if (nombre.equalsIgnoreCase("")  || documento.equalsIgnoreCase("") || genero.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,"Datos incompletos");
        }else {
            EstudianteDTO estudiante = new EstudianteDTO(nombre, textField2.getText(), genero.charAt(0), textField4.getText());
            accesoArchivo.almacenarEstudiante(estudiante);
            JOptionPane.showMessageDialog(this,"Guardado satisfactoriamente");
            this.dispose();
        }
    }

    private void botonIngresarMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Diego Munoz
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        label4 = new JLabel();
        textField4 = new JTextField();
        botonIngresar_ingresar = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Nombre");

        //---- label2 ----
        label2.setText("Apellido");

        //---- label3 ----
        label3.setText("Genero");

        //---- label4 ----
        label4.setText("Documento");

        //---- botonIngresar_ingresar ----
        botonIngresar_ingresar.setText("Ingresar");
        botonIngresar_ingresar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonIngresar_ingresarMouseClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3)
                        .addComponent(label4))
                    .addGap(55, 55, 55)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(botonIngresar_ingresar)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(26, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                    .addComponent(botonIngresar_ingresar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Diego Munoz
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JLabel label4;
    private JTextField textField4;
    private JButton botonIngresar_ingresar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
