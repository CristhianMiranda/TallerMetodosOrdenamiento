package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.BitonicSort;

public class BitonicSortImpl implements BitonicSort {


    @Override
    public void BitonicSort(double a[], int N, int up)
    {
        bitonicSort(a, 0, N, up);
    }
    void compAndSwap(double a[], int i, int j, int dir)
    {
        if ((a[i] > a[j] && dir == 1)
                || (a[i] < a[j] && dir == 0)) {
            // Swapping elements
            double temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    void bitonicMerge(double a[], int low, int cnt, int dir)
    {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++)
                compAndSwap(a, i, i + k, dir);
            bitonicMerge(a, low, k, dir);
            bitonicMerge(a, low + k, k, dir);
        }
    }

    void bitonicSort(double a[], int low, int cnt, int dir)
    {
        if (cnt > 1) {
            int k = cnt / 2;

            bitonicSort(a, low, k, 1);

            bitonicSort(a, low + k, k, 0);

            bitonicMerge(a, low, cnt, dir);
        }
    }

}
