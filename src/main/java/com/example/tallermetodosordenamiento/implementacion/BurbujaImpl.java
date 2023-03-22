package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.Burbuja;

public class BurbujaImpl implements Burbuja {
    @Override
    /**
     * Ordena una matriz de números de punto flotante utilizando el algoritmo de ordenamiento burbuja.
     * @param arr matriz de números de punto flotante sin ordenar
     */
    public void Burbuja(double[] arr) {
        int n = arr.length; // Longitud de la matriz
        double temp = 0; // Variable temporal para almacenar el valor actual de un elemento durante el intercambio

        // Bucle externo que recorre toda la matriz
        for(int i = 0; i < n; i++) {
            // Bucle interno que recorre la matriz desde el segundo elemento hasta el final de la submatriz sin ordenar
            for(int j = 1; j < (n - i); j++) {
                // Compara el elemento actual con el elemento anterior y si están en el orden incorrecto, los intercambia
                if(arr[j-1] > arr[j]) {
                    // Intercambia los elementos
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
