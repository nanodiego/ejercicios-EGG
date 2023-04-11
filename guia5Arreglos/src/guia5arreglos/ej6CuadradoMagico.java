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
public class ej6CuadradoMagico {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3], numero;

        //llenado de la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese los valores de los sub-indices entre numeros del 1 al 9");
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("numero fuera de rango. intentelo de nuevo");
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 10; i++) {
            
            
        }
    }
    
}
