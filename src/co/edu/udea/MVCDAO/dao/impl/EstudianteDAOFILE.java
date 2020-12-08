package co.edu.udea.MVCDAO.dao.impl;

import co.edu.udea.MVCDAO.dao.EstudianteDAO;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;

import java.io.*;

public class EstudianteDAOFILE implements EstudianteDAO {
    private static final String DELIMITADOR = "#";
    private static final String ESTUDIANTEFILLENAME = "texto.txt";
    private FileWriter escritorArchivo;
    private BufferedReader lectorBuffer;

    public EstudianteDAOFILE() {
    }

    public String listarEstudiante() {
        StringBuilder archivo = new StringBuilder();
        try {
            String lineaActual;
            lectorBuffer = new BufferedReader(new FileReader(ESTUDIANTEFILLENAME));

            while ((lineaActual = lectorBuffer.readLine()) != null) {
                archivo.append(lineaActual);
                archivo.append("\n");
            }
            lectorBuffer.close();
        } catch (IOException ignored) {}
        return archivo.toString();
    }

    public String consultarEstudiante(String documento) {
        try {
            String lineaActual;
            lectorBuffer = new BufferedReader(new FileReader(ESTUDIANTEFILLENAME));
            String documentoActual;
            while ((lineaActual = lectorBuffer.readLine()) != null) {
                documentoActual = lineaActual.split(DELIMITADOR)[3];
                if (documentoActual.trim().equalsIgnoreCase(documento)) {
                    return lineaActual;
                }
            }
            lectorBuffer.close();
        } catch (IOException ignored) { }
        return null;
    }

    public boolean almacenarEstudiante(EstudianteDTO estudiante) {
        boolean todoOk = true;
        try {
            escritorArchivo = new FileWriter(ESTUDIANTEFILLENAME, true);
            BufferedWriter escritorBuffer = new BufferedWriter(escritorArchivo);
            escritorBuffer.write(estudiante.toString());
            escritorBuffer.close();
            escritorArchivo.close();
        } catch (IOException e) {
            todoOk = false;
        }
        return todoOk;
    }

    public boolean eliminarEstudiante(String documento) {
        StringBuilder archivo = new StringBuilder();
        boolean flag = false;
        try {
            String lineaActual;
            lectorBuffer = new BufferedReader(new FileReader(ESTUDIANTEFILLENAME));
            String documentoActual;
            while ((lineaActual = lectorBuffer.readLine()) != null) {
                documentoActual = lineaActual.split(DELIMITADOR)[3].trim();
                if (documentoActual.equalsIgnoreCase(documento.trim())) {
                    flag = true;
                    continue;
                }
                archivo.append(lineaActual);
            }

            new File(ESTUDIANTEFILLENAME).delete();
            File archivoEstudiante = new File(ESTUDIANTEFILLENAME);
            escritorArchivo = new FileWriter(archivoEstudiante);
            escritorArchivo.write(archivo.toString());
            escritorArchivo.close();
            lectorBuffer.close();
        } catch (IOException ignored) { }
        return flag;
    }
}
