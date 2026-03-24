package Biblioteca;
public class Libro extends Material {
    private String genero;
    private String editorial;

    public Libro(String codigo, String titulo, String autor, int yearPublicacion, int paginasN, boolean estado,
                 String genero, String editorial) {
        super(codigo, titulo, autor, yearPublicacion, paginasN, estado);
        this.genero = genero;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", genero='" + genero + '\'' +
                ", editorial='" + editorial + '\'';
    }
}