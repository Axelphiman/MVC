package co.edu.udea.MVCDAO.vista;

import co.edu.udea.MVCDAO.dao.impl.EstudianteDAOFILE;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import co.edu.udea.MVCDAO.negocio.Validar;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Diego Munoz
 */
public class VentanaActualizar extends JFrame {
    private static final String DELIMITADOR = "#";
    EstudianteDAOFILE accesoArchivo = new EstudianteDAOFILE();

    public VentanaActualizar() {
        initComponents();
    }

    private void botonConsultar_ActualizarMouseClicked(MouseEvent e) {
        String estudiante = accesoArchivo.consultarEstudiante(textField5.getText());
        if (estudiante != null) {
            String[] estudianteLista = estudiante.split(DELIMITADOR);
            textField1.setText(estudianteLista[0].trim());
            textField2.setText(estudianteLista[1].trim());
            textField4.setText(estudianteLista[3].trim());
            textField5.setEditable(false);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el estudiante");
        }
    }

    private void botonActualizar_ActualizarMouseClicked(MouseEvent e) {
        if (!Validar.validarNombre(textField1.getText()) || !Validar.validarNombre(textField2.getText()) ||
                !Validar.validarDocumento(textField4.getText())) {
            JOptionPane.showMessageDialog(this, "Por favor rellene todos los datos");
        } else {
            accesoArchivo.eliminarEstudiante(textField5.getText().trim());
            textField5.setEditable(true);
            accesoArchivo.almacenarEstudiante(new EstudianteDTO(textField1.getText(), textField2.getText(),
                    (String) comboBox1.getSelectedItem(), textField4.getText()));

            textField1.setText("");
            textField2.setText("");
            textField4.setText("");
            textField5.setText("");
            JOptionPane.showMessageDialog(this, "Se ha actualizado satisfactoriamente");
        }
    }

    private void botonSalir_ActualizarMouseClicked(MouseEvent e) {
        this.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Diego Munoz
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        botonActualizar_Actualizar = new JButton();
        botonSalir_Actualizar = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField4 = new JTextField();
        botonConsultar_Actualizar = new JButton();
        label5 = new JLabel();
        textField5 = new JTextField();
        String [] opciones = {"Hombre", "Mujer", "Otro"};
        comboBox1 = new JComboBox(opciones);

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

        //---- botonActualizar_Actualizar ----
        botonActualizar_Actualizar.setText("Actualizar");
        botonActualizar_Actualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonActualizar_ActualizarMouseClicked(e);
            }
        });

        //---- botonSalir_Actualizar ----
        botonSalir_Actualizar.setText("Salir");
        botonSalir_Actualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonSalir_ActualizarMouseClicked(e);
            }
        });

        //---- botonConsultar_Actualizar ----
        botonConsultar_Actualizar.setText("Consultar");
        botonConsultar_Actualizar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                botonConsultar_ActualizarMouseClicked(e);
            }
        });

        //---- label5 ----
        label5.setText("Ingresa documento:");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(label2)
                        .addComponent(label1)
                        .addComponent(label3))
                    .addGap(55, 55, 55)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textField1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(textField2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(comboBox1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                    .addContainerGap(26, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(85, Short.MAX_VALUE)
                    .addComponent(botonConsultar_Actualizar)
                    .addGap(108, 108, 108))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(botonActualizar_Actualizar)
                    .addGap(31, 31, 31)
                    .addComponent(botonSalir_Actualizar)
                    .addGap(0, 37, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(label5)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(botonConsultar_Actualizar)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(botonActualizar_Actualizar)
                        .addComponent(botonSalir_Actualizar))
                    .addGap(47, 47, 47))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Diego Munoz
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JButton botonActualizar_Actualizar;
    private JButton botonSalir_Actualizar;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField4;
    private JButton botonConsultar_Actualizar;
    private JLabel label5;
    private JTextField textField5;
    private JComboBox comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
