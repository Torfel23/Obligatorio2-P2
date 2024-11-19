
package Dominio;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Autor implements Serializable{
    
    /*Atributos:*/
    private String nombre;
    private String nacionalidad;
    private List<Genero> generos;

    
    /*Constructor: */
    public Autor(String nombre, String nacionalidad, List<Genero> generos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.generos = generos;
    }
    /*Métodos:*/
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    //metodo para imprimir
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", generos=" + generos +
                '}';
    }
    
}
