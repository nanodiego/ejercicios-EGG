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
public class ej7ExMAxMinWhile {

    /**
     * @param args the command line arguments
     * Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, numeros, max = 0, min =999999999, sumanumeros = 0, i = 0;
        float promedio;

        System.out.println("ingrese la cantidad de numeros que va a ingresar");
        n = leer.nextInt();

        while (i < n) {
            System.out.println("ingrese el valor numro:" + (i + 1));
            numeros = leer.nextInt();
            sumanumeros = sumanumeros + numeros;
            if (numeros > max) {
                max = numeros;
            }
            if (numeros < min) {
                min = numeros;
            }
            i++;
        }
        promedio = sumanumeros / n;
        System.out.println("el promedio de los numeros ingresados es: " + promedio);
        System.out.println("el valor maximo es : " + max);
        System.out.println("el valor minimo es:" + min);
    }
}
