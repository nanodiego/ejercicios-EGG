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
public class EjercitandoAndo4 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
2
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][]matriz=new int[4][4];
        int [][]matriz2=new int[4][4];
        //llenado de una matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]= (int) (Math.random()*10);
             }
           }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[j][i]=matriz[i][j];
            }
         }
        //mostrar una matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("  ");
           }
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz2[i][j]+"]");
            }
            System.out.println("  ");
           }
    }
    }
