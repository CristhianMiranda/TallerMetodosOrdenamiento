package com.example.tallermetodosordenamiento;


import com.example.tallermetodosordenamiento.clases.Ordenamiento;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class TallerMetodosOrdenamientoApplication  {

    public static void main(String[] args) {

        calculoTiempoEjecucionMetodos();

    }








    public static void calculoTiempoEjecucionMetodos(){


        int i=1;
        int tamano = 200;
        while(i<=6) {
            // Tamaño del arreglo
            int size = (200*i*10);

            double[] arregloA = llenarArregloAleatorio(size);

            long startTime, endTime;
            System.out.println(i+" / "+ size);
            startTime = System.nanoTime();
            Ordenamiento.burbuja(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (Burbuja)");


            startTime = System.nanoTime();
            Ordenamiento.burbujaBidireccional(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (Burbuja Bidireccional)");

            startTime = System.nanoTime();
            Ordenamiento.seleccion(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (Seleccion)");

            startTime = System.nanoTime();
            Ordenamiento.insercion(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (Insercion)");

            startTime = System.nanoTime();
            Ordenamiento.insercionRecursiva(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (Insercion Recursiva)");

            startTime = System.nanoTime();
            Ordenamiento.shellSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (SheelSort)");

            startTime = System.nanoTime();
            Ordenamiento.bucketSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (BucketSort)");

            startTime = System.nanoTime();
            Ordenamiento.mergeSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (MergeSort)");

            startTime = System.nanoTime();
            Ordenamiento.quickSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (QuickSort)");

            startTime = System.nanoTime();
            Ordenamiento.stoogeSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (StoogeSort)");

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
/*->*/
            startTime = System.nanoTime();
            Ordenamiento.strandSort(arregloA);
            endTime = System.nanoTime();
            System.out.println("Tiempo de respuesta en nanosegundos: " + (endTime - startTime) + " (StrandSort)");

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
        // Crea un nuevo arreglo de tamaño n.
        double[] arreglo = new double[n];

        // Crea un nuevo objeto Random para generar valores aleatorios.
        Random random = new Random();

        // Asigna un valor aleatorio entre 1000 y 9000 a cada elemento del arreglo.
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextDouble() * (9000 - 1000) + 1000;
        }

        // Devuelve el arreglo con valores aleatorios.
        return arreglo;
    }





}
