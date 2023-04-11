/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.est.de.control;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio8Asteriscos {

    /**
     * @param args the command line arguments Dibujar un cuadrado de N elementos
     * por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4
     * elementos por lado se deberá dibujar lo siguiente: * * * * * * * *
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);
        //int num, i, j;
        //num = 4;
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > 0 && i < 3 && j >0 && j < 3) {
                    System.out.print(" ");
                } else 
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

