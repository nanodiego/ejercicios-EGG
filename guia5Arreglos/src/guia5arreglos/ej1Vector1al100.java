/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5arreglos;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ej1Vector1al100 {

    /**
     * @param args the command line arguments
     * 
Realizar un algoritmo que llene un vector con los 100
* primeros números enteros y los muestre por pantalla
* en orden descendente

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //aqui creamos, definimos y damos dimension al vector en la misma linea.
        int vector[]=new int[100];
        // con el metodo Arrays.sort(vector); los numeros ingresados
        // de manera aleatoria o desordenada, quedan ordenados.
        
        //aqui le asignamos los elementos o valores a los indices.
        for (int i = 0; i < vector.length; i++) {
            vector[i]= i+1;
        }
        
        //aqui mostramos por pantalla de forma decreciente los valores de los
        // indices
        //tener en cuenta que para que muestre el primer sub-indice
        //el cero(0) debe estar igualado.
       for (int i = vector.length-1; i >= 0; i--) {
           System.out.println(vector[i]);
       }
    }
    }
