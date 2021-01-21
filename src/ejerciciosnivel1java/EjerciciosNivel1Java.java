/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1java;

import java.util.Arrays;

/**
 *
 * @author jpb20
 */
public class EjerciciosNivel1Java {

    // declaro el array de ints para hacer pruebas 
    int[] listaNumeros = {3000, 600, 70000, 200, 2000000, 955519};

    public int[] maximo(int[] lista) {

        int[] sol = {0, 0};  // Creo un vector vacio para almacenar la solucion
        int aux = lista[0];  // El máximo va a ser el primer elemento del array
        int aux2 = lista[0]; // Creo el segundo auxiliar para empezar a rastrear
        int j;

        for (j = 1; j < lista.length; j++) {
            if (aux < lista[j]) {
                aux = lista[j];
            }
            sol[0] = aux;
        }

        for (int i = 1; i < lista.length; i++) {
            if (aux2 < lista[i] && lista[i] != aux) {
                aux2 = lista[i];
            }

            sol[1] = aux2;
        }

        return sol;
    }

    public static void main(String[] args) {
        EjerciciosNivel1Java ejercicio = new EjerciciosNivel1Java();

        System.out.println("Los valores maximos son: " + Arrays.toString(ejercicio.maximo(ejercicio.listaNumeros)));
    }

}
