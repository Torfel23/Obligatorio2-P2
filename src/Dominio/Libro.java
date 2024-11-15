
package Dominio;

import java.io.Serializable;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Libro implements Serializable{
    // Atributos:
    private String isbn;
    private String titulo;
    private Editorial editorial;
    private Genero genero;
    private Autor autor;
    private double precioCosto;
    private double precioVenta;
    private int stock;
    private String foto; // Path or filename for the book cover image

    // Constructor:
    public Libro(String isbn, String titulo, Editorial editorial, Genero genero, Autor autor, 
                 double precioCosto, double precioVenta, int stock, String foto) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.genero = genero;
        this.autor = autor;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.foto = foto;
    }

    // Métodos:
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Genero getGenero() {
        return genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }
    
    public String getFoto() {
        return foto;
    }

    // Setter method for stock
    public void setStock(int stock) {
        this.stock = stock;
    }


    //metodo para imprimir
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", editorial=" + editorial +
                ", genero=" + genero +
                ", autor=" + autor +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                ", foto='" + foto + '\'' +
                '}';
    }
}