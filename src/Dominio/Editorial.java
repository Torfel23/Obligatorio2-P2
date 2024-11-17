package Dominio;

import java.io.Serializable;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Editorial implements Serializable {

    private static final long serialVersionUID = 1L;
//Atributos:

    private String nombre;
    private String paisOrigen;

    public Editorial(String nombre, String paisOrigen) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }
    //Métodos:

    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    //metodo para imprimir
    public String toString() {
        return "Editorial{" + "nombre='" + nombre + '\'' + ", paisOrigen='" + paisOrigen + '\'' + '}';
    }
}
