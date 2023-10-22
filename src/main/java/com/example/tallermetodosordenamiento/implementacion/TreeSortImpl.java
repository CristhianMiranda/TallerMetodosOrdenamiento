package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.TreeSort;

import java.util.TreeSet;

public class TreeSortImpl implements TreeSort {
    @Override
    public void treeSort(double[] arr) {
        TreeSet<Double> treeSet = new TreeSet<>();
        for (double num : arr) {
            treeSet.add(num);
        }
        int i = 0;
        for (Double num : treeSet) {
            arr[i++] = num;
        }
    }
}