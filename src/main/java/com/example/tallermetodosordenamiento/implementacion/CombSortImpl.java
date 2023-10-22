package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.CombSort;

public class CombSortImpl implements CombSort {
    @Override
    public void combSort(double[] arr) {
        int gap = arr.length;
        double shrink = 1.3;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            gap = (int) (gap / shrink);
            if (gap < 1) gap = 1;

            swapped = false;
            for (int i = 0; i < arr.length - gap; i++) {
                int j = i + gap;
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
        }
    }
}
