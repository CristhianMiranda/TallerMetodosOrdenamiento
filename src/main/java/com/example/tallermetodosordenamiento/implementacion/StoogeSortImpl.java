package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.StoogeSort;

public class StoogeSortImpl implements StoogeSort {

    @Override
    public void StoogeSort(double[] arr) {
        stoogeSortHelper(arr, 0, arr.length - 1); // Llamada al método auxiliar para ordenar la matriz
    }

    /**
     * Método auxiliar que ordena una sección de una matriz utilizando el algoritmo de ordenamiento StoogeSort.
     *
     * @param arr matriz de números decimales sin ordenar
     * @param i índice izquierdo de la sección a ordenar
     * @param j índice derecho de la sección a ordenar
     */
    private static void stoogeSortHelper(double[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            // Si el elemento en el índice izquierdo es mayor que el elemento en el índice derecho,
            // intercambiar los elementos para que el elemento más pequeño esté en el índice izquierdo
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        if (i + 1 >= j) {
            // Si la sección es lo suficientemente pequeña (i.e., tiene longitud 2 o menos), detener la recursión
            return;
        }

        int k = (j - i + 1) / 3; // Calcular el tamaño de la sección que se va a ordenar

        // Ordenar la primera y última dos terceras partes de la sección recursivamente
        stoogeSortHelper(arr, i, j - k);
        stoogeSortHelper(arr, i + k, j);
        stoogeSortHelper(arr, i, j - k);
    }
}
