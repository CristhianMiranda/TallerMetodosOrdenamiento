package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.ShellSort;

public class ShellSortImpl implements ShellSort {
    @Override
    public void ShellSort(double[] arr) {
        int n = arr.length; // Longitud de la matriz

        // Inicializa la brecha inicial en n/2 y la reduce a la mitad en cada iteración
        for(int gap = n/2; gap > 0; gap /= 2) {
            // Recorre los elementos de la brecha actual
            for(int i = gap; i < n; i++) {
                double temp = arr[i]; // Almacena el elemento actual

                // Desplaza los elementos mayores hacia la derecha en la sublista ordenada
                int j;
                for(j = i; j >= gap && arr[j-gap] > temp; j -= gap) {
                    arr[j] = arr[j-gap];
                }

                // Inserta el elemento actual en su posición correcta en la sublista ordenada
                arr[j] = temp;
            }
        }
    }
}
