
package org.diegoestrada.main;

/**
 *
 * @author estra
 */
public class ListaEstudiantes {
 
    NodoEstudiante head;
    
    public void agregarInicio(String carnet, String nombre, double nota){
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        nuevo.siguiente = head;
        head = nuevo;
    }
    
    public void agregarFinal(String carnet, String nombre, double nota){
        NodoEstudiante nuevo = new NodoEstudiante(carnet, nombre, nota);
        NodoEstudiante actual;
        actual = head;
        while(actual.siguiente != null){
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
    }
    
    public void eliminarPorCarnet(String carnet){
        //Si la lista esta vacia
        if(head == null) return;
        
        //Caso 1: Si es el primer nodo 
        if(head.carnet == carnet){
            head = head.siguiente;
            return;
        }
        
        //Caso 2 y 3: Buscar el nodo 
        NodoEstudiante anterior = head;
        while(anterior.siguiente !=null){
            if(anterior.siguiente.carnet == carnet){
                anterior.siguiente = anterior.siguiente.siguiente;
                return;
            }
            anterior = anterior.siguiente;
        }
        //Si no encuentra el caso
        System.out.println("Nodo no encontrado");
    }
    
    public boolean buscarPorCarnet(String carnet){
        NodoEstudiante actual = head;
        //Recorre toda la lista
        while(actual != null){
            if(actual.carnet.equals(carnet)){
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }
    
    public void imprimirLista(){
        if(head == null){
            System.out.println("La lista esta vacia");
            return;
        }
        
        //Recorre e imprime cada nodo
        NodoEstudiante actual = head;
        StringBuilder sb = new StringBuilder("HEAD");
        while(actual != null){
            sb.append("-> [ ")
                    .append(actual.carnet)
                    .append(actual.nombre)
                    .append(actual.nota)
                    .append("]");
            actual = actual.siguiente;
        }
        
        sb.append("-> null");
        System.out.println(sb);
    }
    
    public double obtenerPromedio(){
        //Validacion por si la lista este vacia
        double suma = 0;
        int cantidad = 0;
        NodoEstudiante actual = head;
        
        while(actual != null){
            suma +=  actual.nota;
            cantidad ++;
            actual = actual.siguiente;
        }
        return suma / cantidad;
    }
    
    public double obtenerMejorNota(){
        double mejor = head.nota;
        
        NodoEstudiante actual = head.siguiente;
        while(actual != null){
            if(actual.nota > mejor){
                mejor = actual.nota;
            }
            actual = actual.siguiente;
        }
        return mejor;
    }
}
