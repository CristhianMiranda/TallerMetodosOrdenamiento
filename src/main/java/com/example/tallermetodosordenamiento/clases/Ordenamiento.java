package com.example.tallermetodosordenamiento.clases;

import com.example.tallermetodosordenamiento.implementacion.*;
import com.example.tallermetodosordenamiento.interfaces.*;
import com.example.tallermetodosordenamiento.interfaces.BinaryInsertionSort;

public class Ordenamiento {
    public static void burbuja(double[] arr) {
        Burbuja burbuja = new BurbujaImpl();
        burbuja.Burbuja(arr);
    }

    public static void burbujaBidireccional(double[] arr){
        BurbujaBidireccional burbujaBidireccional = new BurbujaBidireccionalImpl();
        burbujaBidireccional.BurbujaBidireccional(arr);
    }

    public static void seleccion(double[] arr)
    {
        Seleccion seleccion = new SeleccionImpl();
        seleccion.Seleccion(arr);
    }

    public static void insercion(double[] arr)
    {
        Insercion insercion = new InsercionImpl();
        insercion.Insercion(arr);
    }

    public static void insercionRecursiva(double[] arr)
    {
        InsercionRecursivaSort insercionRecursivaSort = new InsercionRecursivaSortImpl();
        insercionRecursivaSort.InsercionRecursiva(arr);
    }

    public static void shellSort(double[] arr){
        ShellSort shellSort = new ShellSortImpl();
        shellSort.ShellSort(arr);
    }

    public static void bucketSort(double[] arr)
    {
        BucketSort bucketSort = new BucketSortImpl();
        bucketSort.BucketSort(arr);
    }

    public static void mergeSort(double[] arr)
    {
        MergeSort mergeSort = new MergeSortImpl();
        mergeSort.MergeSort(arr);
    }

    public static void quickSort(double[] arr)
    {
        QuickSort quickSort = new QuickSortImpl();
        quickSort.QuickSort(arr);
    }

    public static void stoogeSort(double[] arr)
    {
        StoogeSort stoogeSort = new StoogeSortImpl();
        stoogeSort.StoogeSort(arr);
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

    public static void strandSort(double[] arr) {
        StrandSort strandSort = new StrandSortImpl();
        strandSort.strandSort(arr);
    }

    public static void radixSort(double[] arr) {
        RadixSort radixSort = new RadixSortImpl();
        radixSort.RadixSort(arr);
    }
}
