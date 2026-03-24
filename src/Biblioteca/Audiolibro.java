package Biblioteca;

public class Audiolibro extends Material {
    private int minutos;
    private String narrador;
    private String formato;

    public Audiolibro(String codigo, String titulo, String autor, int yearPublicacion, int paginasN, boolean estado,
                      int minutos, String narrador, String formato) {
        super(codigo, titulo, autor, yearPublicacion, paginasN, estado);
        this.minutos = minutos;
        this.narrador = narrador;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", duracion=" + minutos +
                ", narrador='" + narrador + '\'' +
                ", formato='" + formato + '\'';
    }
}