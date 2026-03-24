package Biblioteca;
import java.util.*;

public class Material {
    private String codigo;
    private String titulo;
    private String autor;
    private int yearPublicacion;
    private int paginasN;
    private boolean estado; // true = disponible, false = prestado

    public Material(String codigo, String titulo, String autor, int yearPublicacion, int paginasN, boolean estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.yearPublicacion = yearPublicacion;
        this.paginasN = paginasN;
        this.estado = estado;
    }

    public void cambiarEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Material{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", año=" + yearPublicacion +
                ", paginas=" + paginasN +
                ", estado=" + (estado ? "Disponible" : "Prestado") +
                '}';
    }
}