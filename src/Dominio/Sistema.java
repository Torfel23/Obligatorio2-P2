package Dominio;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Sistema implements Serializable {

    private static final long serialVersionUID = 1L;
    private int ultimoNumeroFactura = 0;

    private List<Editorial> editoriales;
    private List<Genero> generos;
    private List<Autor> autores;
    private List<Libro> libros;
    private List<Venta> ventas;

    public Sistema() {
        this.editoriales = new ArrayList<>();
        this.generos = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.libros = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    // Métodos para persistencia
    public void saveData(String filePath) {
        try {
            if (filePath == null || filePath.isEmpty()) {
                throw new IllegalArgumentException("La ruta del archivo no puede ser nula o vacía.");
            }
            try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(filePath)))) {
                out.writeObject(this); // Serializa el objeto Sistema completo
                System.out.println("Datos guardados exitosamente en " + filePath);
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

    public static Sistema loadData(String filePath) {
        try {
            if (filePath == null || filePath.isEmpty()) {
                throw new IllegalArgumentException("La ruta del archivo no puede ser nula o vacía.");
            }
            try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(filePath)))) {
                System.out.println("Datos cargados exitosamente desde " + filePath);
                return (Sistema) in.readObject(); // Deserializa y devuelve el objeto `Sistema`
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los datos desde el archivo: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase no encontrada al cargar los datos: " + e.getMessage());
        }
        return new Sistema(); // Devuelve un sistema vacío si falla la carga
    }

    // Métodos básicos
    public void agregarEditorial(Editorial editorial) {
        if (editorial != null) {
            if (editoriales.stream().noneMatch(e -> e.getNombre().equalsIgnoreCase(editorial.getNombre()))) {
                editoriales.add(editorial);
                System.out.println("Editorial agregada: " + editorial.getNombre());
            } else {
                System.out.println("La editorial '" + editorial.getNombre() + "' ya existe.");
            }
        }
    }

    public void agregarGenero(Genero genero) {
        if (genero != null) {
            if (generos.stream().noneMatch(g -> g.getNombre().equalsIgnoreCase(genero.getNombre()))) {
                generos.add(genero);
                System.out.println("Género agregado: " + genero.getNombre());
            } else {
                System.out.println("El género '" + genero.getNombre() + "' ya existe.");
            }
        }
    }

    public void agregarAutor(Autor autor) {
        if (autor != null) {
            if (!autorExiste(autor.getNombre())) {
                autores.add(autor);
                System.out.println("Autor agregado: " + autor.getNombre());
            } else {
                System.out.println("El autor '" + autor.getNombre() + "' ya existe.");
            }
        }
    }

    public void agregarLibro(Libro libro) {
        if (libro != null) {
            if (!libroExiste(libro.getIsbn())) {
                libros.add(libro);
                System.out.println("Libro agregado: " + libro.getTitulo());
            } else {
                System.out.println("El libro con ISBN '" + libro.getIsbn() + "' ya existe.");
            }
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

    public List<Venta> getVentas() {
        return ventas;
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        return libros.stream()
                .filter(libro -> libro.getIsbn().equalsIgnoreCase(isbn))
                .findFirst()
                .orElse(null);
    }

    public List<Libro> filtrarLibros(String autor, String genero, String titulo) {
        List<Libro> filtrados = new ArrayList<Libro>();
        autor = autor.toLowerCase();
        genero = genero.toLowerCase();
        titulo = titulo.toLowerCase();
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            boolean autorMatches = (!autor.isEmpty() && libro.getAutor().getNombre().toLowerCase().contains(autor)) || autor.isEmpty();
            boolean generoMatches = (!genero.isEmpty() && libro.getGenero().getNombre().toLowerCase().contains(genero)) || genero.isEmpty();
            boolean tituloMatches = (!titulo.isEmpty() && libro.getTitulo().toLowerCase().contains(titulo)) || titulo.isEmpty();

            if (autorMatches && generoMatches && tituloMatches) {
                filtrados.add(libro);
            }

        }
        return filtrados;
    }

    public List<Venta> getVentasPorIsbn(String isbn) {
        return ventas.stream().filter(venta -> venta.getLibro(isbn) != null).toList();
    }

    public boolean autorExiste(String nombre) {
        return autores.stream().anyMatch(autor -> autor.getNombre().equalsIgnoreCase(nombre));
    }

    public boolean libroExiste(String isbn) {
        return libros.stream().anyMatch(libro -> libro.getIsbn().equalsIgnoreCase(isbn));
    }

    // Métodos guardar registros
    public boolean guardarEditorial(String nombre, String paisOrigen) {
        if (nombre == null || nombre.isEmpty() || paisOrigen == null || paisOrigen.isEmpty()) {
            return false; // Datos inválidos
        }

        if (editoriales.stream().anyMatch(e -> e.getNombre().equalsIgnoreCase(nombre))) {
            return false; // Ya existe
        }

        Editorial nuevaEditorial = new Editorial(nombre, paisOrigen);
        editoriales.add(nuevaEditorial);
        return true;
    }

    public boolean guardarGenero(String nombre, String descripcion) {
        if (nombre == null || nombre.isEmpty() || descripcion == null || descripcion.isEmpty()) {
            return false; // Datos inválidos
        }

        if (generos.stream().anyMatch(g -> g.getNombre().equalsIgnoreCase(nombre))) {
            return false; // Ya existe un género con ese nombre
        }

        Genero nuevoGenero = new Genero(nombre, descripcion);
        generos.add(nuevoGenero);
        return true; // Género agregado con éxito
    }

    public boolean guardarAutor(String nombre, String nacionalidad, List<Genero> generos) {
        if (nombre == null || nombre.isEmpty() || nacionalidad == null || nacionalidad.isEmpty() || generos == null || generos.isEmpty()) {
            return false; // Datos inválidos
        }

        if (autores.stream().anyMatch(a -> a.getNombre().equalsIgnoreCase(nombre))) {
            return false; // Ya existe un autor con ese nombre
        }

        Autor nuevoAutor = new Autor(nombre, nacionalidad, generos);
        autores.add(nuevoAutor);
        return true; // Autor agregado con éxito
    }

    public boolean guardarLibro(String isbn, String titulo, Editorial editorial, Genero genero, Autor autor,
            double precioCosto, double precioVenta, int stock, String foto) {
        if (isbn == null || isbn.isEmpty() || titulo == null || titulo.isEmpty()
                || editorial == null || genero == null || autor == null || stock < 0) {
            return false; // Datos inválidos
        }

        if (libros.stream().anyMatch(libro -> libro.getIsbn().equalsIgnoreCase(isbn))) {
            return false; // Ya existe un libro con ese ISBN
        }

        Libro nuevoLibro = new Libro(isbn, titulo, editorial, genero, autor, precioCosto, precioVenta, stock, foto);
        libros.add(nuevoLibro);
        return true; // Libro guardado con éxito
    }

    //Metodos de venta
    public boolean verificarStockVenta(Map<Libro, Integer> librosVendidos) {
        for (Map.Entry<Libro, Integer> entry : librosVendidos.entrySet()) {
            if (entry.getKey().getStock() < entry.getValue()) {
                System.out.println("Stock insuficiente para el libro: " + entry.getKey().getTitulo());
                return false;
            }
        }
        return true;
    }

    public boolean registrarVenta(Venta venta) {
        if (venta == null) {
            return false;
        }

        if (venta.getFecha() == null || venta.getFecha().isEmpty()) {
            System.out.println("La fecha no puede estar vacía.");
            return false;
        }

        // Validar stock antes de registrar la venta
        if (!verificarStockVenta(venta.getLibrosVendidos())) {
            System.out.println("Stock insuficiente. No se puede registrar la venta.");
            return false;
        }

        // Registrar la venta y actualizar stock
        ventas.add(venta);
        venta.actualizarStock();
        ultimoNumeroFactura = venta.getNumeroFactura(); // Actualizar el contador global
        saveData("data/sistema.ser"); // Guardar los datos en persistencia

        System.out.println("Venta registrada exitosamente: " + venta.getNumeroFactura());
        return true;
    }

    public int getUltimoNumeroFactura() {
        return ultimoNumeroFactura;
    }

    public void setUltimoNumeroFactura(int ultimoNumeroFactura) {
        this.ultimoNumeroFactura = ultimoNumeroFactura;
    }

    public int generarNumeroFactura() {
        return ++ultimoNumeroFactura;
    }

    public Venta buscarVentaPorNumero(int numeroFactura) {
        return ventas.stream()
                .filter(v -> v.getNumeroFactura() == numeroFactura)
                .findFirst()
                .orElse(null);
    }

    public boolean anularVenta(int numeroFactura) {
        Venta venta = buscarVentaPorNumero(numeroFactura);

        if (venta == null) {
            return false;
        }

        venta.getLibrosVendidos().forEach((libro, cantidad) -> {
            libro.setStock(libro.getStock() + cantidad);
        });

        ventas.remove(venta);
        return true;
    }

}
