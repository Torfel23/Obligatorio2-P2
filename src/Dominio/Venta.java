/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Map;    

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Venta {
    //Atributos:
    private int numeroFactura;
    private String fecha;
    private String cliente;
    private Map<Libro, Integer> librosVendidos; 


    // Constructor
    public Venta(int numeroFactura, String fecha, String cliente, Map<Libro, Integer> librosVendidos) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.librosVendidos = librosVendidos;
    }

    //Métodos:
        
    //Getters:
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
    
    // Retrieves the first Libro in the sale with a matching ISBN
    public Libro getLibro(String isbn) {
        for (Libro libro : librosVendidos.keySet()) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null; // Return null if no Libro matches the ISBN
    }
    
    //Calcula el precio total de la venta
    public double calcularTotal() {
        double total = 0.0;
        for (Map.Entry<Libro, Integer> entry : librosVendidos.entrySet()) {
            Libro libro = entry.getKey();
            int cantidad = entry.getValue();
            total += libro.getPrecioVenta() * cantidad;
        }
        return total;
    }
    
    //Actualiza el stock de cada libro disminuyéndolo en función de la cantidad vendida
    public void actualizarStock() {
        for (Map.Entry<Libro, Integer> entry : librosVendidos.entrySet()) {
            Libro libro = entry.getKey();
            int cantidadVendida = entry.getValue();
            libro.setStock(libro.getStock() - cantidadVendida);
        }
    }

    //para mostrar detalles de venta
    
    public String toString() {
        return "Venta{" +
                "numeroFactura=" + numeroFactura +
                ", fecha='" + fecha + '\'' +
                ", cliente='" + cliente + '\'' +
                ", librosVendidos=" + librosVendidos +
                ", totalVenta=" + calcularTotal() +
                '}';
    }

}
