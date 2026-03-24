package Biblioteca;
import java.time.LocalDate;
import java.util.*;

public class Prestamo {
    private LocalDate fechaSolicitud;
    private LocalDate fechaDevolucion;
    private List<Material> materiales;

    public Prestamo(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
        this.materiales = new ArrayList<>();
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean addMaterial(Material material) {
        if (materiales.size() < 3 && material.getEstado()) {
            materiales.add(material);
            material.cambiarEstado(false); // pasa a prestado
            return true;
        }
        return false;
    }

    public void removeMaterial(Material material) {
        if (materiales.remove(material)) {
            material.cambiarEstado(true); // vuelve a disponible
        }
    }

    public List<Material> listaMaterial() {
        return materiales;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaSolicitud=" + fechaSolicitud +
                ", fechaDevolucion=" + fechaDevolucion +
                ", materiales=" + materiales +
                '}';
    }
}