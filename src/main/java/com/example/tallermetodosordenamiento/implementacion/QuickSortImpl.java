package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.QuickSort;

public class QuickSortImpl implements QuickSort {
    @Override
    public void QuickSort(double[] arr) {
        quickSortHelper(arr, 0, arr.length - 1); // Llamada al método auxiliar para ordenar la matriz
    }

    /**
     * Método auxiliar que ordena una sección de una matriz utilizando el algoritmo de ordenamiento QuickSort.
     *
     * @param arr matriz de números decimales sin ordenar
     * @param low índice izquierdo de la sección a ordenar
     * @param high índice derecho de la sección a ordenar
     */
    private static void quickSortHelper(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Encuentra el índice del pivote
            quickSortHelper(arr, low, pivotIndex - 1); // Ordena la sección izquierda
            quickSortHelper(arr, pivotIndex + 1, high); // Ordena la sección derecha
        }
    }

    /**
     * Método auxiliar que particiona una sección de una matriz en dos subsecciones con valores menores y mayores que un pivote dado.
     *
     * @param arr matriz de números decimales sin ordenar
     * @param low índice izquierdo de la sección a particionar
     * @param high índice derecho de la sección a particionar
     * @return índice del pivote
     */
    private static int partition(double[] arr, int low, int high) {
        double pivotValue = arr[high]; // Escoge el último elemento de la sección como pivote
        int pivotIndex = low - 1; // Inicializa el índice del pivote

        for (int i = low; i < high; i++) {
            if (arr[i] < pivotValue) {
                pivotIndex++; // Incrementa el índice del pivote
                swap(arr, i, pivotIndex); // Intercambia el elemento actual con el pivote
            }
        }

        pivotIndex++; // Incrementa el índice del pivote para colocarlo en su posición correcta
        swap(arr, pivotIndex, high); // Coloca el pivote en su posición correcta

        return pivotIndex;
    }

    /**
     * Intercambia dos elementos en una matriz dada.
     *
     * @param arr matriz que contiene los elementos a intercambiar
     * @param i índice del primer elemento a intercambiar
     * @param j índice del segundo elemento a intercambiar
     */
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
