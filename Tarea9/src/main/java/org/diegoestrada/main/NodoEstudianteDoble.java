package org.diegoestrada.main;

/**
 *
 * @author estra
 */
public class NodoEstudianteDoble {

    String carnet;
    String nombre;
    double nota;
    NodoEstudianteDoble siguiente;
    NodoEstudianteDoble anterior;
    
    public NodoEstudianteDoble(String carnet, String nombre, double nota){
        this.carnet = carnet;
        this.nombre = nombre; 
        this.nota = nota;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public NodoEstudianteDoble(String carnet, String nombre, double nota, NodoEstudianteDoble siguiente, NodoEstudianteDoble anterior){
        this.carnet = carnet;
        this.nombre = nombre; 
        this.nota = nota;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
}
