package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.TimSort;

import java.util.Arrays;

public class TimSortImpl implements TimSort {
    @Override
    public void TimSort(double[] arr) {
        Arrays.sort(arr);
    }
}
