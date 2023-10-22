package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.PigeonholeSort;

import java.util.Arrays;

public class PigeonholeSortImpl implements PigeonholeSort {
    @Override
    public void pigeonHoleSort(double[] arr) {
        int n = arr.length;
        double min = arr[0], max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        int range = (int) (max - min + 1);
        double[] holes = new double[range];
        Arrays.fill(holes, 0);
        for (int i = 0; i < n; i++) {
            holes[(int) (arr[i] - min)] += 1;
        }
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (holes[i] > 0) {
                arr[index] = i + min;
                index++;
                holes[i] -= 1;
            }
        }
    }
}