package org.diegoestrada.main;

/**
 *
 * @author estra
 */
public class Tarea9 {

    public static void main(String[] args) {
        //
        ListaEstudiantes lista = new ListaEstudiantes();
        lista.agregarInicio("202300001", "Ana", 85.0);
        lista.agregarInicio("202300002", "Luis", 90.0);
        lista.agregarFinal("202300003", "María", 78.0);
        lista.imprimirLista();
        lista.eliminarPorCarnet("202300001");
        lista.imprimirLista();
    }
}
