package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.BucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSortImpl implements BucketSort {
    @Override
    public void BucketSort(double[] arreglo) {
        if (arreglo == null || arreglo.length <= 1) {
            return;
        }

        // Encontrar el valor máximo del arreglo
        double maxValor = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maxValor) {
                maxValor = arreglo[i];
            }
        }

        // Crear los buckets y distribuir los elementos en ellos
        int numBuckets = arreglo.length;
        List<Double>[] buckets = new List[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new ArrayList<Double>();
        }

        for (int i = 0; i < arreglo.length; i++) {
            int bucketIndex = (int) ((arreglo[i] / maxValor) * (numBuckets - 1));
            buckets[bucketIndex].add(arreglo[i]);
        }

        // Ordenar los buckets y combinar los elementos en el arreglo original
        int index = 0;
        for (int i = 0; i < numBuckets; i++) {
            List<Double> bucket = buckets[i];
            Collections.sort(bucket);
            for (double elemento : bucket) {
                arreglo[index++] = elemento;
            }
        }
    }
}
