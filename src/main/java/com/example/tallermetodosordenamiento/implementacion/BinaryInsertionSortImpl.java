package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.BinaryInsertionSort;

import java.util.Arrays;

public class BinaryInsertionSortImpl implements BinaryInsertionSort {

    @Override
    public void BinaryInsertionSort(double[] arreglo) {
        for (int i = 1; i < arreglo.length; i++) {
            double x = arreglo[i]; // Elemento a insertar
            int j = Math.abs(Arrays.binarySearch(arreglo, 0, i, x) + 1); // Posición de inserción
            System.arraycopy(arreglo, j, arreglo, j + 1, i - j); // Desplazar los elementos hacia la derecha
            arreglo[j] = x; // Insertar el elemento en la posición correcta
        }
    }

}
