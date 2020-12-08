package co.edu.udea.MVCDAO.dao.impl;
import co.edu.udea.MVCDAO.dao.EstudianteDAO;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstudianteDAOFILE implements EstudianteDAO {
    private static final String DELIMITADOR = ",";
    private static final String ESTUDIANTEFILLENAME = "texto.txt";
    private BufferedWriter escritoBuffer;
    private FileWriter escritorArchivo;
    private Scanner lector;
    private File archivoEstudiante;

    public EstudianteDAOFILE(){

    }

    public String listarEstudiante(){
        String completo= " ";
        try {
            String linea;
            BufferedReader fr = new BufferedReader(new FileReader( "texto.txt"));

            while ((linea = fr.readLine()) != null) {
                completo = completo+linea+ "\n";
            }
            fr.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
        return completo;
    }// mostrar todos los estudiantes

    public String consultarEstudiante(String documento){
        try {
            String linea;
            BufferedReader fr = new BufferedReader(new FileReader( "texto.txt"));
            String documentoActual;
            while ((linea = fr.readLine()) != null) {
                documentoActual = linea.split(",")[3];
                if(documentoActual.equalsIgnoreCase(documento)){
                    return linea;
                }
            }

        }catch (IOException e){ }
        return null;
    } //solo por documento

    public boolean almacenarEstudiante(EstudianteDTO estudiante){
        boolean todoOk = true;
        try(
                FileWriter fw = new FileWriter("texto.txt", true);
                FileReader fr = new FileReader("texto.txt");
                BufferedReader br = new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw)
        ){

            bw.write(estudiante.toString());
            bw.flush();
            String linea;
            String newLine = "\n";

            while( (linea = br.readLine())!= null){
            }
            bw.close();
            fr.close();
            br.close();
            fw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            todoOk = false;
        }
        return todoOk;
    }

    public boolean eliminarEstudiante(String documento){
        String texto = "";
        boolean flag = false;
        try {
            String linea;

            BufferedReader fr = new BufferedReader(new FileReader( "texto.txt"));
            String documentoActual;
            while ((linea = fr.readLine()) != null) {
                documentoActual = linea.split(",")[3];
                if(documentoActual.equalsIgnoreCase(documento)){
                    flag = true;
                    continue;
                }
                texto += linea;
            }
            fr.close();
            new File(ESTUDIANTEFILLENAME).delete();
            File archivo = new File(ESTUDIANTEFILLENAME);
            FileWriter writer = new FileWriter(archivo);
            writer.write(texto);
            writer.close();

        }catch (IOException e){ }
        return flag;
    }


    public boolean actualiceEstudiante(String documento){
        if( !consultarEstudiante(documento).equals(null)){


        }
        else{

        }
        return false;
    } // aun no se que parametro recibir, problema para mañana


}
