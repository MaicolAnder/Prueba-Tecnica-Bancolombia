package org.example;

import evalart.ConcatenadorNombres;
import evalart.FiltrarNumerosPares;
import evalart.GestorDeVectores;
import evalart.HilosParesImpares;

import java.util.Vector;

/**
 * @author Miguel A Tunubalá
 * Clase para ejecución de prueba técnica en evalart de Bancolombia
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Prueba técnica de bancolombia");

        // Ejecutar lógica para hilos pares e impares
        HilosParesImpares.HilosParesImpares();

        // Ejecutar lógica para gestor de vectores
        Vector<Integer> vector = new Vector<>();
        GestorDeVectores.agregarElemento(vector, 5);
        GestorDeVectores.agregarElemento(vector, 10);
        GestorDeVectores.eliminarElemento(vector, 0);

        int indice = GestorDeVectores.buscarElemento(vector, 10);
        System.out.println("Indice buscado " +indice);

        // Logica la Filtras números pares de un array.
        FiltrarNumerosPares.FiltrarNumerosPares();

        // Logica para concatenar nombres sin usar el operador
        ConcatenadorNombres.ConcatenadorNombres();
    }
}

