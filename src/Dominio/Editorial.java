/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;

/**
 *
 * @author pipetorrendell
 * @author nicholasdavies
 */
public class Editorial implements Serializable{
    //Atributos:
    
    private String nombre;
    private String paisOrigen;
    
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
