package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.InsercionRecursivaSort;

public class InsercionRecursivaSortImpl implements InsercionRecursivaSort {
    @Override
    public void InsercionRecursiva(double[] arreglo) {

        recursiveInsertionSort(arreglo, arreglo.length);
    }

    /**
     * Método auxiliar que implementa el algoritmo de Recursive Insertion para ordenar un subarreglo de un arreglo de números dobles
     * en orden ascendente.
     *
     * @param arreglo el arreglo de números dobles que contiene el subarreglo a ordenar
     * @param n el tamaño del subarreglo a ordenar
     */
    private static void recursiveInsertionSort(double[] arreglo, int n) {
        // Caso base: el subarreglo tiene tamaño 1 o menos, por lo que ya está ordenado
        if (n <= 1) {
            return;
        }

        // Ordenar el subarreglo que precede al último elemento
        recursiveInsertionSort(arreglo, n - 1);

        // Insertar el último elemento en la posición correcta en el subarreglo ordenado
        double ultimo = arreglo[n - 1];
        int i = n - 2;
        while (i >= 0 && arreglo[i] > ultimo) {
            arreglo[i + 1] = arreglo[i];
            i--;
        }
        arreglo[i + 1] = ultimo;
    }
}
