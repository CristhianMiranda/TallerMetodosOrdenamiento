package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.Seleccion;

public class SeleccionImpl implements Seleccion {

    @Override
    public void Seleccion(double[] arr) {
        int n = arr.length; // Longitud de la matriz

        // Bucle externo que recorre toda la matriz
        for(int i = 0; i < n-1; i++) {
            int min_idx = i; // Índice del elemento mínimo en la submatriz sin ordenar

            // Bucle interno que recorre la submatriz sin ordenar
            for(int j = i+1; j < n; j++) {
                // Si el elemento actual es menor que el elemento mínimo, actualiza el índice del elemento mínimo
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Intercambia el elemento mínimo con el primer elemento de la submatriz sin ordenar
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
