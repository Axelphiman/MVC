package co.edu.udea.MVCDAO.dao.impl;

import co.edu.udea.MVCDAO.dao.EstudianteDAO;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;

import java.io.*;


public class EstudianteDAOFILE implements EstudianteDAO {
    private static final String DELIMITADOR = ",";
    private static final String ESTUDIANTEFILLENAME = "texto.txt";
    private BufferedWriter escritorBuffer;
    private FileWriter escritorArchivo;
    private FileReader lectorArchivo;
    private BufferedReader lectorBuffer;
    private File archivoEstudiante;

    public EstudianteDAOFILE() {
    }

    public String listarEstudiante() {
        String archivo = " ";
        try {
            String lineaActual;
            lectorBuffer = new BufferedReader(new FileReader(ESTUDIANTEFILLENAME));

            while ((lineaActual = lectorBuffer.readLine()) != null) {
                archivo = archivo + lineaActual + "\n";
            }
            lectorBuffer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return archivo;
    }

    public String consultarEstudiante(String documento) {
        try {
            String lineaActual;
            lectorBuffer = new BufferedReader(new FileReader(ESTUDIANTEFILLENAME));
            String documentoActual;
            while ((lineaActual = lectorBuffer.readLine()) != null) {
                documentoActual = lineaActual.split(DELIMITADOR)[3];
                if (documentoActual.equalsIgnoreCase(documento)) {
                    return lineaActual;
                }
            }
            lectorBuffer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean almacenarEstudiante(EstudianteDTO estudiante) {
        boolean todoOk = true;
        try {

            escritorArchivo = new FileWriter(ESTUDIANTEFILLENAME, true);
            escritorBuffer = new BufferedWriter(escritorArchivo);
            escritorBuffer.write(estudiante.toString());

            escritorBuffer.close();
            escritorArchivo.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            todoOk = false;
        }
        return todoOk;
    }

    public boolean eliminarEstudiante(String documento) {
        String archivo = "";
        boolean flag = false;
        try {
            String lineaActual;
            lectorBuffer = new BufferedReader(new FileReader(ESTUDIANTEFILLENAME));
            String documentoActual;
            while ((lineaActual = lectorBuffer.readLine()) != null) {
                documentoActual = lineaActual.split(DELIMITADOR)[3];
                if (documentoActual.equalsIgnoreCase(documento)) {
                    flag = true;
                    continue;
                }
                archivo += lineaActual + "\n";
            }


            new File(ESTUDIANTEFILLENAME).delete();
            archivoEstudiante = new File(ESTUDIANTEFILLENAME);
            escritorArchivo = new FileWriter(archivoEstudiante);
            escritorArchivo.write(archivo);
            escritorArchivo.close();
            lectorBuffer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return flag;
    }
}
