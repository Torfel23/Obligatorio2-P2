/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Genero {
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
    @Override
    public String toString() {
        return "Genero{" + "nombre='" + nombre + '\'' + ", descripcion='" + descripcion + '\'' + '}';
    }   
}

