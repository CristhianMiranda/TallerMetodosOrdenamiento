package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.MergeSort;

public class MergeSortImpl implements MergeSort {
    @Override
    public void MergeSort(double[] arr) {
        int n = arr.length; // Longitud de la matriz
        double[] temp = new double[n]; // Arreglo temporal para almacenar los elementos ordenados

        mergeSortHelper(arr, 0, n - 1, temp); // Llamada al método auxiliar para ordenar la matriz
    }

    /**
     * Método auxiliar que ordena una sección de una matriz utilizando el algoritmo de ordenamiento MergeSort.
     *
     * @param arr matriz de números decimales sin ordenar
     * @param left índice izquierdo de la sección a ordenar
     * @param right índice derecho de la sección a ordenar
     * @param temp arreglo temporal para almacenar los elementos ordenados
     */
    private static void mergeSortHelper(double[] arr, int left, int right, double[] temp) {
        if(left < right) {
            int middle = (left + right) / 2; // Encuentra el índice medio de la sección
            mergeSortHelper(arr, left, middle, temp); // Ordena la primera mitad de la sección
            mergeSortHelper(arr, middle + 1, right, temp); // Ordena la segunda mitad de la sección
            merge(arr, left, middle, right, temp); // Combina las dos mitades ordenadas
        }
    }

    /**
     * Método auxiliar que combina dos mitades ordenadas de una matriz.
     *
     * @param arr matriz de números decimales sin ordenar
     * @param left índice izquierdo de la primera mitad
     * @param middle índice derecho de la primera mitad y izquierdo de la segunda mitad
     * @param right índice derecho de la segunda mitad
     * @param temp arreglo temporal para almacenar los elementos ordenados
     */
    private static void merge(double[] arr, int left, int middle, int right, double[] temp) {
        int i = left; // Índice izquierdo para la primera mitad
        int j = middle + 1; // Índice izquierdo para la segunda mitad
        int k = 0; // Índice izquierdo para el arreglo temporal

        // Combina las dos mitades ordenadas en el arreglo temporal
        while(i <= middle && j <= right) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copia los elementos restantes de la primera mitad al arreglo temporal
        while(i <= middle) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copia los elementos restantes de la segunda mitad al arreglo temporal
        while(j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copia los elementos ordenados del arreglo temporal de vuelta a la matriz original
        for(i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }
}
