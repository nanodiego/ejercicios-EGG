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
public class EjercitandoAndo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = {{0,-2,4},{2,0,2},{-4,-2,0}}; //new int[3][3];
        
        //llenado de una matriz
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matriz[i][j] = (int) (3 - Math.random() * 7);
//            }
//        }
        //mostrar una matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("  ");
        }
        System.out.println(" ");
        System.out.println("matriz transpuesta");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("  ");
        }
        //comprobacion de la matriz
        boolean log = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    log = true;
                }
            }
        }
        if (log) {
            System.out.println("la matriz NO es ANTISIMETRICA");

        } else {
            System.out.println("la matriz es antisimetrica");

        }
    }
}
    
    
    

