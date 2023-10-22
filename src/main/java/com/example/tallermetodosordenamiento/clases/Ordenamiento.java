package com.example.tallermetodosordenamiento.clases;

import com.example.tallermetodosordenamiento.implementacion.*;
import com.example.tallermetodosordenamiento.interfaces.*;
import com.example.tallermetodosordenamiento.interfaces.BinaryInsertionSort;

public class Ordenamiento {

    public static void timSort(double[] arr)
    {
        TimSort timSort = new TimSortImpl();
        timSort.TimSort(arr);
    }

    public static void combSort(double[] arr)
    {
        CombSort combSort = new CombSortImpl();
        combSort.combSort(arr);
    }

    public static void selectionSort(double[] arr)
    {
        SelectionSort selectionSort = new SelectionSortImpl();
        selectionSort.selectionSort(arr);
    }

    public static void treeSort(double[] arr)
    {
        TreeSort treeSort = new TreeSortImpl();
        treeSort.treeSort(arr);
    }

    public static void pigeonholeSort(double[] arr)
    {
        PigeonholeSort pigeonholeSort = new PigeonholeSortImpl();
        pigeonholeSort.pigeonHoleSort(arr);
    }

    public static void bucketSort(double[] arr)
    {
        BucketSort bucketSort = new BucketSortImpl();
        bucketSort.BucketSort(arr);
    }

    public static void quickSort(double[] arr)
    {
        QuickSort quickSort = new QuickSortImpl();
        quickSort.QuickSort(arr);
    }

    public static void heapSort(double[] arr)
    {
        HeapSort heapSort = new HeapSortImpl();
        heapSort.HeapSort(arr);
    }

    public static void bitonicSort(double[] arr)
    {
       BitonicSort bitonicSort = new BitonicSortImpl();
       bitonicSort.BitonicSort(arr,arr.length,1);
    }

    public static void gnomeSort(double[] arr)
    {
        GnomeSort gnomeSort = new GnomeSortImpl();
        gnomeSort.GnomeSort(arr);
    }

    public static void binaryInsertionSort(double[] arr) {
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSortImpl();
        binaryInsertionSort.BinaryInsertionSort(arr);
    }

    public static void radixSort(double[] arr) {
        RadixSort radixSort = new RadixSortImpl();
        radixSort.RadixSort(arr);
    }
}
