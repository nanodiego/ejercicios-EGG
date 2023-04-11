/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ej7ExValorMaxMin {

    /**
     * @param args the command line arguments Realice un programa que calcule y
     * visualice el valor máximo, el valor mínimo y el promedio de n números
     * (n>0). El valor de n se solicitará al principio del programa y los
     * números serán introducidos por el usuario. Realice dos versiones del
     * programa, una usando el bucle “while” y otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float n, max = 0, min = 0, suman = 0, x = 0;
        int cantn = 5;

        for (int i = 0; i < cantn; i++) {
            System.out.println("ingrese numero entero");
            n = leer.nextFloat();
            suman = suman + n;
            x = x + 1;
            if (i == 0) {
                max = n;
            } else if (n > max) {
                max = n;
            }
            if (i == 0) {
                min = n;
            } else if (n < min) {
                min = n;
            }
        }
        System.out.println("el promedio es= " + suman / 5);
        System.out.println("el valor max es= " + max);
        System.out.println("el valor minimo es= " + min);
    }
}
