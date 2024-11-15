package Dominio;

import java.io.*;
import java.nio.file.*;
import java.util.*;
/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Sistema {
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

    // Métodos para persistencia
    public void saveData(String filePath) {
    try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(filePath)))) {
        out.writeObject(this); // Serializa el objeto `Sistema` completo
    } catch (IOException e) {
        System.out.println("Error al guardar los datos: " + e.getMessage());
    }
}

public static Sistema loadData(String filePath) {
    try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(filePath)))) {
        return (Sistema) in.readObject(); // Deserializa y devuelve el objeto `Sistema`
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al cargar los datos: " + e.getMessage());
    }
    return new Sistema(); // Devuelve un sistema vacío si falla la carga
}

    // Métodos básicos
    public void agregarEditorial(Editorial editorial) {
        if (editorial != null && editoriales.stream().noneMatch(e -> e.getNombre().equalsIgnoreCase(editorial.getNombre()))) {
            editoriales.add(editorial);
        }
    }

    public void agregarGenero(Genero genero) {
        if (genero != null && generos.stream().noneMatch(g -> g.getNombre().equalsIgnoreCase(genero.getNombre()))) {
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
            venta.actualizarStock();
        }
    }

    // Métodos de consulta
    public List<Editorial> getEditoriales() {
        return new ArrayList<>(editoriales);
    }

    public List<Genero> getGeneros() {
        return new ArrayList<>(generos);
    }

    public List<Autor> getAutores() {
        return new ArrayList<>(autores);
    }

    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }

    public List<Libro> buscarLibros(String titulo, String autor, String genero) {
        return libros.stream()
                .filter(libro -> (titulo == null || libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) &&
                        (autor == null || libro.getAutor().getNombre().toLowerCase().contains(autor.toLowerCase())) &&
                        (genero == null || libro.getGenero().getNombre().toLowerCase().contains(genero.toLowerCase())))
                .toList();
    }

    public List<Venta> getVentasPorIsbn(String isbn) {
        return ventas.stream().filter(venta -> venta.getLibro(isbn) != null).toList();
    }

    // Métodos auxiliares
    public boolean autorExiste(String nombre) {
        return autores.stream().anyMatch(autor -> autor.getNombre().equalsIgnoreCase(nombre));
    }

    public boolean libroExiste(String isbn) {
        return libros.stream().anyMatch(libro -> libro.getIsbn().equalsIgnoreCase(isbn));
    }
}
