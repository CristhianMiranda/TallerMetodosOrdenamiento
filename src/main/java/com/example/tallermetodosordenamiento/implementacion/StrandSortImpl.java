package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.StrandSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrandSortImpl implements StrandSort {
    @Override
    public void strandSort(double[] arr) {
        if (arr.length <= 1) {
            return;
        }

        List<Double> list = new ArrayList<>();
        for (double value : arr) {
            list.add(value);
        }
        List<Double> sorted = new ArrayList<>();

        while (!list.isEmpty()) {
            List<Double> sublist = new ArrayList<>();
            sublist.add(list.remove(0));

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= sublist.get(sublist.size() - 1)) {
                    sublist.add(list.remove(i));
                    i--;
                }
            }

            sorted = mergeLists(sorted, sublist);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sorted.get(i);
        }
    }

    private static List<Double> mergeLists(List<Double> list1, List<Double> list2) {
        List<Double> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
    }
}
