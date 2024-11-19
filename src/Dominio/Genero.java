
package Dominio;

import java.io.Serializable;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Genero implements Serializable{
     // Attributes
    private String nombre;
    private String descripcion;

    // Constructor
    public Genero(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    // Getter methods
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //metodo para imprimir
    public String toString() {
        return "Genero{" + "nombre='" + nombre + '\'' + ", descripcion='" + descripcion + '\'' + '}';
    }   
}

