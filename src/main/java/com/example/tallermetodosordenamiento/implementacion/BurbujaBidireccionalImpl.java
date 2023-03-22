package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.BurbujaBidireccional;

public class BurbujaBidireccionalImpl implements BurbujaBidireccional{

    @Override
    public void BurbujaBidireccional(double[] arr) {
        int n = arr.length; // Longitud de la matriz
        double temp = 0; // Variable temporal para almacenar el valor actual de un elemento durante el intercambio
        boolean intercambio = true; // Bandera que indica si se ha realizado algún intercambio en la iteración actual

        // Bucle externo que recorre toda la matriz
        for(int i = 0; i < n/2 && intercambio; i++) {
            intercambio = false;

            // Bucle interno que recorre la matriz desde el inicio y desde el final de la submatriz sin ordenar
            for(int j = i; j < n-i-1; j++) {
                // Compara el elemento actual con el siguiente y si están en el orden incorrecto, los intercambia
                if(arr[j] > arr[j+1]) {
                    // Intercambia los elementos
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    intercambio = true;
                }
            }

            // Bucle interno que recorre la matriz desde el final y desde el inicio de la submatriz sin ordenar
            for(int j = n-i-2; j > i; j--) {
                // Compara el elemento actual con el anterior y si están en el orden incorrecto, los intercambia
                if(arr[j] < arr[j-1]) {
                    // Intercambia los elementos
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    intercambio = true;
                }
            }
        }
    }
}
