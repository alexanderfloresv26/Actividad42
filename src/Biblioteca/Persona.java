package Biblioteca;
import java.util.*;

public class Persona {
    private String nombre;
    private String identificacion;
    private String celular;
    private String direccion;
    private List<Prestamo> prestamos;

    public Persona(String nombre, String identificacion, String celular, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.celular = celular;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    public void addPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void deletePrestamo(Prestamo prestamo) {
        prestamos.remove(prestamo);
    }

    public List<Prestamo> listaPrestamo() {
        return prestamos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", celular='" + celular + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}