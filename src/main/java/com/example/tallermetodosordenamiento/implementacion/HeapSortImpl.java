package com.example.tallermetodosordenamiento.implementacion;

import com.example.tallermetodosordenamiento.interfaces.HeapSort;

public class HeapSortImpl implements HeapSort {
    @Override
    public void HeapSort(double[] arreglo) {
        int n = arreglo.length;

        // Construir el heap (montón) de manera iterativa
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arreglo, n, i);
        }

        // Extraer elementos del heap (montón) uno por uno
        for (int i = n - 1; i >= 0; i--) {
            // Mover la raíz actual al final
            double temp = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = temp;

            // Llamar al método heapify() en el subárbol reducido
            heapify(arreglo, i, 0);
        }
    }

    /**
     * Método auxiliar que construye un heap (montón) en un subárbol con raíz en el índice i
     *
     * @param arreglo el arreglo en el que se está construyendo el heap (montón)
     * @param n el tamaño del heap (montón)
     * @param i la raíz del subárbol
     */
    public static void heapify(double[] arreglo, int n, int i) {
        int raiz = i;
        int izquierda = 2 * i + 1;
        int derecha = 2 * i + 2;

        // Si el hijo izquierdo es más grande que la raíz
        if (izquierda < n && arreglo[izquierda] > arreglo[raiz]) {
            raiz = izquierda;
        }

        // Si el hijo derecho es más grande que la raíz
        if (derecha < n && arreglo[derecha] > arreglo[raiz]) {
            raiz = derecha;
        }

        // Si la raíz no es el nodo más grande
        if (raiz != i) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[raiz];
            arreglo[raiz] = temp;

            // Llamada recursiva al método heapify() en el subárbol afectado
            heapify(arreglo, n, raiz);
        }
    }
}
