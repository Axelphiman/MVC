package co.edu.udea.MVCDAO.dao;
import co.edu.udea.MVCDAO.modelo.EstudianteDTO;
import java.util.List;

public interface EstudianteDAO {
    public boolean almacenarEstudiante(EstudianteDTO estudiante);
    public boolean eliminarEstudiante(String documento); // se asume que se ingresa el documento para buscar
    public boolean actualiceEstudiante(String documento); // aun no se que parametro recibir, problema para mañana
    public  String listarEstudiante(); // mostrar todos los estudiantes
    public String consultarEstudiante(String documento); //solo por documento

}
