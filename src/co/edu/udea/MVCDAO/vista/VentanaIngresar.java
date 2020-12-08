/*
 * Created by JFormDesigner on Mon Dec 07 12:09:18 COT 2020
 */

package co.edu.udea.MVCDAO.vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import co.edu.udea.MVCDAO.dao.impl.EstudianteDAOFILE;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import co.edu.udea.MVCDAO.negocio.Validar;
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
        String apellido = textField2.getText();
        String genero = (String) comboBox1.getSelectedItem();
        if (!Validar.validarNombre(nombre) || !Validar.validarNombre(apellido) || !Validar.validarDocumento(documento)) {
            JOptionPane.showMessageDialog(this, "Datos incompletos");
        } else {
            EstudianteDTO estudiante = new EstudianteDTO(Validar.rellenarDato(nombre), Validar.rellenarDato(apellido),
                    Validar.rellenarDato(genero), Validar.rellenarDato(documento));

            accesoArchivo.almacenarEstudiante(estudiante);
            JOptionPane.showMessageDialog(this, "Guardado satisfactoriamente");
            textField1.setText("");
            textField2.setText("");
            textField4.setText("");
        }

    }

    private void botonIngresarMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button1MouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Diego Munoz
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField4 = new JTextField();
        botonIngresar_ingresar = new JButton();
        button1 = new JButton();
        String [] opciones = {"Hombre","Mujer","Otro"};
        comboBox1 = new JComboBox(opciones);
        label5 = new JLabel();

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
                botonIngresarMouseClicked(e);
                botonIngresar_ingresarMouseClicked(e);
            }
        });

        //---- button1 ----
        button1.setText("Salir");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- label5 ----
        label5.setText("Ingresar Estudiante");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(67, Short.MAX_VALUE)
                    .addComponent(botonIngresar_ingresar)
                    .addGap(34, 34, 34)
                    .addComponent(button1)
                    .addGap(56, 56, 56))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3)
                                .addComponent(label4))
                            .addGap(53, 53, 53)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBox1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(textField2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(textField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(label5)))
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(label5)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonIngresar_ingresar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(19, Short.MAX_VALUE))
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
    private JLabel label4;
    private JTextField textField4;
    private JButton botonIngresar_ingresar;
    private JButton button1;
    private JComboBox comboBox1;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
