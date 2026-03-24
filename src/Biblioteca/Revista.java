package Biblioteca;

public class Revista extends Material{
    private String numeroEdicion;
    private String mesPublicacion;

    public Revista(String codigo, String titulo, String autor, int yearPublicacion, int paginasN, boolean estado,
                   String numeroEdicion, String mesPublicacion) {
        super(codigo, titulo, autor, yearPublicacion, paginasN, estado);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", edicion='" + numeroEdicion + '\'' +
                ", mes='" + mesPublicacion + '\'';
    }
}
