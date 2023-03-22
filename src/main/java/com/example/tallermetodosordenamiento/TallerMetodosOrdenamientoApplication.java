package com.example.tallermetodosordenamiento;


import com.example.tallermetodosordenamiento.clases.Ordenamiento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class TallerMetodosOrdenamientoApplication  {

    public static void main(String[] args) {

        calculoTiempoEjecucionMetodos();
    }








    public static void calculoTiempoEjecucionMetodos(){
        // Tamaño del arreglo
        int size = 500;

        double[] arregloA = llenarArregloAleatorio(size);

        long startTime, endTime;

        startTime = System.nanoTime();
        Ordenamiento.Burbuja(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");


        startTime = System.nanoTime();
        Ordenamiento.BurbujaBidireccional(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");

        startTime = System.nanoTime();
        Ordenamiento.Seleccion(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");

        startTime = System.nanoTime();
        Ordenamiento.Insercion(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");

        startTime = System.nanoTime();
        Ordenamiento.InsercionRecursiva(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");

        startTime = System.nanoTime();
        Ordenamiento.ShellSort(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");

        startTime = System.nanoTime();
        Ordenamiento.BucketSort(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");

        startTime = System.nanoTime();
        Ordenamiento.MergeSort(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");

        startTime = System.nanoTime();
        Ordenamiento.QuickSort(arregloA);
        endTime = System.nanoTime();
        System.out.println("Tiempo de respuesta en nanosegundos: "+(endTime - startTime)+"");



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
