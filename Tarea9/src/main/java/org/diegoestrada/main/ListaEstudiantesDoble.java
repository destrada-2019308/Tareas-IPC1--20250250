package org.diegoestrada.main;

/**
 *
 * @author estra
 */
public class ListaEstudiantesDoble {
    NodoEstudianteDoble head;
    NodoEstudianteDoble tail;
    
    public void agregarInicio(String carnet, String nombre, double nota){
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if(head == null){
            head = tail = nuevo;
        }else{
            nuevo.siguiente = head;
            nuevo.anterior = nuevo;
            head = nuevo;
        }
    }
    
    public void agregarFinal(String carnet, String nombre, double nota){
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        if(head == null){
            head = tail = nuevo;
        }else{
            nuevo.anterior = tail;
            tail.siguiente = nuevo;
            tail = nuevo;
        }
    }
    
    public boolean eliminarPorCarnet(String carnet){
        if(head == null) return false;
        NodoEstudianteDoble actual = head;
        //Busca el nodo
        while (actual != null) {
            if (actual.carnet.equals(carnet)) {
                // Reconectar el anterior
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    head = actual.siguiente;  // era el primero
                }
                // Reconectar el siguiente
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    tail = actual.anterior;  // era el último
                }
                return true;  // encontrado y eliminado
            }
            actual = actual.siguiente;
        }
        return false;  // no existe ese carnet
    } 
    
    // Head -> tail
    public void imprimirAdelante() {
        NodoEstudianteDoble actual = head;
        while (actual != null) {
            System.out.println(actual.carnet + " | " + actual.nombre + " | " + actual.nota);
            actual = actual.siguiente;
        }
    }

    // Tail -> head
    public void imprimirAtras() {
        NodoEstudianteDoble actual = tail;
        while (actual != null) {
            System.out.println(actual.carnet + " | " + actual.nombre + " | " + actual.nota);
            actual = actual.anterior;
        }
    }
    
    //Inserta manteniendo orden ascendente por nota
    public void agregarOrdenado(String carnet, String nombre, double nota){
        NodoEstudianteDoble nuevo = new NodoEstudianteDoble(carnet, nombre, nota);
        // Lista vacía
        if (head == null) {
            head = nuevo;
            tail = nuevo;
            return;
        }
        // Va al inicio (nota menor que el primero)
        if (nota <= head.nota) {
            nuevo.siguiente = head;
            head.anterior = nuevo;
            head = nuevo;
            return;
        }
        // Va al final (nota mayor que el último)
        if (nota >= tail.nota) {
            nuevo.anterior = tail;
            tail.siguiente = nuevo;
            tail = nuevo;
            return;
        }
        // Va en medio y buscar su posición
        NodoEstudianteDoble actual = head;
        while (actual != null && actual.nota < nota) {
            actual = actual.siguiente;
        }
        // Insertar antes de actual
        NodoEstudianteDoble previo = actual.anterior;
        previo.siguiente = nuevo;
        nuevo.anterior = previo;
        nuevo.siguiente = actual;
        actual.anterior = nuevo;
    }
    
}
