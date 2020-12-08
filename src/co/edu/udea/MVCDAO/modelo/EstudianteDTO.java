package co.edu.udea.MVCDAO.modelo;

public class EstudianteDTO {
    private String nombre;
    private String apellido;
    private String genero;
    private String documento;
    private static final String DELIMITADOR = "#";

    public EstudianteDTO(String nombre, String apellido, String genero, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return
                nombre + DELIMITADOR + apellido + DELIMITADOR + genero + DELIMITADOR + documento + DELIMITADOR+"\n";
    }
}