package Dominio;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */

public class Venta implements Serializable {

    private int numeroFactura;
    private String fecha;
    private String cliente;
    private Map<Libro, Integer> librosVendidos;

    public Venta(int numeroFactura, String fecha, String cliente, Map<Libro, Integer> librosVendidos) {
        if (librosVendidos == null || librosVendidos.isEmpty()) {
            throw new IllegalArgumentException("Debe haber al menos un libro en la venta.");
        }
        if (librosVendidos.entrySet().stream().anyMatch(entry -> entry.getKey().getStock() < entry.getValue())) {
            throw new IllegalArgumentException("Error: No hay suficiente stock para uno o más libros en esta venta.");
        }
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.librosVendidos = librosVendidos;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public Map<Libro, Integer> getLibrosVendidos() {
        return librosVendidos;
    }
    
    public int getCantidad(Libro libro){
        return librosVendidos.get(libro);
    }

    public Libro getLibro(String isbn) {
        return librosVendidos.keySet().stream()
                .filter(libro -> libro.getIsbn().equalsIgnoreCase(isbn))
                .findFirst()
                .orElse(null);
    }

    public double calcularTotal() {
        return librosVendidos.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPrecioVenta() * entry.getValue())
                .sum();
    }

    public void actualizarStock() {
        librosVendidos.forEach((libro, cantidad) -> libro.setStock(libro.getStock() - cantidad));
    }

    public String toString() {
        return "Venta{"
                + "numeroFactura=" + numeroFactura
                + ", fecha='" + fecha + '\''
                + ", cliente='" + cliente + '\''
                + ", librosVendidos=" + librosVendidos
                + ", totalVenta=" + calcularTotal()
                + '}';
    }
}
