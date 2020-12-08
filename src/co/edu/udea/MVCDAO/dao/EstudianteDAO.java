package co.edu.udea.MVCDAO.dao;

import co.edu.udea.MVCDAO.modelo.EstudianteDTO;

import java.util.List;

public interface EstudianteDAO {
    public boolean almacenarEstudiante(EstudianteDTO estudiante);

    public boolean eliminarEstudiante(String documento);

    public String listarEstudiante();

    public String consultarEstudiante(String documento);

}
