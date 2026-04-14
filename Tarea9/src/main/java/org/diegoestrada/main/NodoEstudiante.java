
package org.diegoestrada.main;

/**
 *
 * @author estra
 */
public class NodoEstudiante {
    public String carnet;
    public String nombre;
    public double nota;
    public NodoEstudiante siguiente;
    
    //Constructor
    NodoEstudiante(String carnet, String nombre, double nota){
        this.carnet = carnet;
        this.nombre = nombre;
        this.nota = nota;
        this.siguiente = null;
    }
}
