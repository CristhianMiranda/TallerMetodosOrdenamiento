package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.Insercion;

public class InsercionImpl implements Insercion {
    @Override
    public void Insercion(double[] arr) {
        int n = arr.length; // Longitud de la matriz

        // Bucle externo que recorre toda la matriz
        for(int i = 1; i < n; i++) {
            double key = arr[i]; // Elemento actual en la submatriz sin ordenar
            int j = i - 1; // Índice del último elemento en la submatriz ordenada

            // Bucle interno que recorre la submatriz ordenada
            while(j >= 0 && arr[j] > key) {
                // Desplaza los elementos mayores hacia la derecha para hacer espacio para el elemento actual
                arr[j+1] = arr[j];
                j--;
            }

            // Inserta el elemento actual en su posición correcta en la submatriz ordenada
            arr[j+1] = key;
        }
    }
}
