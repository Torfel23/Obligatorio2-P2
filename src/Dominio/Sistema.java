/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Sistema {
    /*
    
    Métodos:

void agregarEditorial(Editorial editorial): Añade una nueva editorial al sistema.
void agregarGenero(Genero genero): Añade un nuevo género al sistema.
void agregarAutor(Autor autor): Añade un nuevo autor al sistema.
void agregarLibro(Libro libro): Añade un nuevo libro al sistema.
void registrarVenta(Venta venta): Registra una nueva venta.
List<Autor> getAutores(): Devuelve la lista de autores registrados.
List<Genero> getGeneros(): Devuelve la lista de géneros disponibles.
List<Libro> buscarLibros(String titulo, String autor, String genero): Busca libros según el título, autor o género.
List<Venta> getVentasPorIsbn(String isbn): Devuelve las ventas relacionadas con un ISBN específico.
boolean autorExiste(String nombre): Verifica si un autor con un nombre específico ya está registrado.
boolean libroExiste(String isbn): Verifica si un libro con un ISBN específico ya está registrado.*/
    
    
    
   // Atributos:
    private List<Editorial> editoriales;
    private List<Genero> generos;
    private List<Autor> autores;
    private List<Libro> libros;
    private List<Venta> ventas; 
    
    
     // Constructor:
    public Sistema() {
        this.editoriales = new ArrayList<>();
        this.generos = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    // Methods
    public void agregarEditorial(Editorial editorial) {
        if (editorial != null) {
            editoriales.add(editorial);
        }
    }

    public void agregarGenero(Genero genero) {
        if (genero != null) {
            generos.add(genero);
        }
    }

    public void agregarAutor(Autor autor) {
        if (autor != null && !autorExiste(autor.getNombre())) {
            autores.add(autor);
        }
    }

    public void agregarLibro(Libro libro) {
        if (libro != null && !libroExiste(libro.getIsbn())) {
            libros.add(libro);
        }
    }

    public void registrarVenta(Venta venta) {
        if (venta != null) {
            ventas.add(venta);
        }
    }

    public List<Autor> getAutores() {
        return new ArrayList<>(autores);
    }

    public List<Genero> getGeneros() {
        return new ArrayList<>(generos);
    }

    public List<Libro> buscarLibros(String titulo, String autor, String genero) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            boolean coincideTitulo = (titulo == null || libro.getTitulo().toLowerCase().contains(titulo.toLowerCase()));
            boolean coincideAutor = (autor == null || libro.getAutor().getNombre().toLowerCase().contains(autor.toLowerCase()));
            boolean coincideGenero = (genero == null || libro.getGenero().getNombre().toLowerCase().contains(genero.toLowerCase()));
            if (coincideTitulo && coincideAutor && coincideGenero) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Venta> getVentasPorIsbn(String isbn) {
    List<Venta> resultados = new ArrayList<>();
    for (Venta venta : ventas) {
        if (venta.getLibro(isbn) != null) { // Check if any Libro in the sale matches the ISBN
            resultados.add(venta);
        }
    }
    return resultados;
}

    public boolean autorExiste(String nombre) {
        for (Autor autor : autores) {
            if (autor.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean libroExiste(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return true;
            }
        }
        return false;
    }
}
