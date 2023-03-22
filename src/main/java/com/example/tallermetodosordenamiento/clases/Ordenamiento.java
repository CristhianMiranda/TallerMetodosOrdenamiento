package com.example.tallermetodosordenamiento.clases;

import com.example.tallermetodosordenamiento.implementacion.BurbujaBidireccionalImpl;
import com.example.tallermetodosordenamiento.implementacion.BurbujaImpl;
import com.example.tallermetodosordenamiento.interfaces.Burbuja;
import com.example.tallermetodosordenamiento.interfaces.BurbujaBidireccional;

public class Ordenamiento {
    public static void Burbuja(double[] arr) {
        Burbuja burbuja = new BurbujaImpl();
        burbuja.Burbuja(arr);
    }

    public static void BurbujaBidireccional(double[] arr){
        BurbujaBidireccional burbujaBidireccional = new BurbujaBidireccionalImpl();
        burbujaBidireccional.BurbujaBidireccional(arr);
    }



}
