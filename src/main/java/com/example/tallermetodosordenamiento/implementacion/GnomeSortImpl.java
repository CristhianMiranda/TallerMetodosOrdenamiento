package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.GnomeSort;

public class GnomeSortImpl implements GnomeSort {
    @Override
    public void GnomeSort(double[] arreglo) {
        int pos = 1; // Posición de inicio

        while (pos < arreglo.length) {
            if (arreglo[pos] >= arreglo[pos - 1]) {
                // Si los elementos están en orden correcto, avanzar
                pos++;
            } else {
                // Si los elementos no están en orden correcto, intercambiar y retroceder
                double temp = arreglo[pos];
                arreglo[pos] = arreglo[pos - 1];
                arreglo[pos - 1] = temp;
                pos--;

                // Asegurarse de que no nos salgamos del límite inferior del arreglo
                if (pos == 0) {
                    pos = 1;
                }
            }
        }
    }
}
