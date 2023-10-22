package com.example.tallermetodosordenamiento;


import com.example.tallermetodosordenamiento.clases.Ordenamiento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

/**
 * Esta aplicación realiza pruebas de rendimiento para varios algoritmos de ordenamiento
 * utilizando arreglos de diferentes tamaños.
 * Autor: Cristhian Andres Miranda Ramirez
 */
@SpringBootApplication
public class TallerMetodosOrdenamientoApplication  {

    /**
     * Método principal que inicia la aplicación y realiza las pruebas de rendimiento.
     */
    public static void main(String[] args) {

        calculoTiempoEjecucionMetodos();

    }

    /**
     * Realiza pruebas de rendimiento para diferentes algoritmos de ordenamiento
     * con diferentes tamaños de arreglos.
     */
    public static void calculoTiempoEjecucionMetodos(){

        int i=1;
        int tamano = 200000;

        while(i<=6) {

            // Tamaño del arreglo
            int size = (tamano*i);

            double[] arregloA = llenarArregloAleatorio(size);

            long startTime, endTime;

            System.out.println(i+" / "+ size);

            startTime = System.nanoTime();
            Ordenamiento.timSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (TimSort)");

            startTime = System.nanoTime();
            Ordenamiento.combSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (CombSort)");

            startTime = System.nanoTime();
            Ordenamiento.selectionSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (SelectionSort)");

            startTime = System.nanoTime();
            Ordenamiento.treeSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (TreeSort)");

            startTime = System.nanoTime();
            Ordenamiento.pigeonholeSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (PigeonholeSortSort)");

            startTime = System.nanoTime();
            Ordenamiento.bucketSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (BucketSort)");

            startTime = System.nanoTime();
            Ordenamiento.quickSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (QuickSort)");

            startTime = System.nanoTime();
            Ordenamiento.heapSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (HeapSort)");

            startTime = System.nanoTime();
            Ordenamiento.bitonicSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (BitonicSort)");

            startTime = System.nanoTime();
            Ordenamiento.gnomeSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (GnomeSort)");

            startTime = System.nanoTime();
            Ordenamiento.binaryInsertionSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (BinaryInsertionSort)");

            startTime = System.nanoTime();
            Ordenamiento.radixSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (RadixSort)");
            i++;
        }
    }

    /**
     * Crea un arreglo unidimensional de tamaño n con valores aleatorios entre 1000 y 9000.
     *
     * @param n el tamaño del arreglo
     * @return el arreglo con valores aleatorios
     */
    public static double[] llenarArregloAleatorio(int n) {
        double[] arreglo = new double[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextDouble() * (9000 - 1000) + 1000;
        }

        return arreglo;
    }
}