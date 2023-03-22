package com.example.tallermetodosordenamiento.clases;

import com.example.tallermetodosordenamiento.implementacion.*;
import com.example.tallermetodosordenamiento.interfaces.*;

public class Ordenamiento {
    public static void Burbuja(double[] arr) {
        Burbuja burbuja = new BurbujaImpl();
        burbuja.Burbuja(arr);
    }

    public static void BurbujaBidireccional(double[] arr){
        BurbujaBidireccional burbujaBidireccional = new BurbujaBidireccionalImpl();
        burbujaBidireccional.BurbujaBidireccional(arr);
    }

    public static void Seleccion(double[] arr)
    {
        Seleccion seleccion = new SeleccionImpl();
        seleccion.Seleccion(arr);
    }

    public static void Insercion(double[] arr)
    {
        Insercion insercion = new InsercionImpl();
        insercion.Insercion(arr);
    }

    public static void InsercionRecursiva(double[] arr)
    {
        InsercionRecursivaSort insercionRecursivaSort = new InsercionRecursivaSortImpl();
        insercionRecursivaSort.InsercionRecursiva(arr);
    }

    public static void ShellSort(double[] arr){
        ShellSort shellSort = new ShellSortImpl();
        shellSort.ShellSort(arr);
    }

    public static void BucketSort(double[] arr)
    {
        BucketSort bucketSort = new BucketSortImpl();
        bucketSort.BucketSort(arr);
    }

    public static void MergeSort(double[] arr)
    {
        MergeSort mergeSort = new MergeSortImpl();
        mergeSort.MergeSort(arr);
    }

    public static void QuickSort(double[] arr)
    {
        QuickSort quickSort = new QuickSortImpl();
        quickSort.QuickSort(arr);
    }

}
