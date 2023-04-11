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
public class ej9ExDivconResta {

    /**
     * @param args the command line arguments
     * Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, i = 0;
        System.out.println("ingrese 2 numeros enteros mayores que uno");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 1 && num2 > 1) {
            do {
                num1 = num1 - num2;
                i++;
            } while (num1 > num2);
            System.out.println("el residuo es= " + num1);
            System.out.println("el cociente es= " + i);
        } else {
            System.out.println("Ha ingresado numeros nenor o igual a uno");
            System.out.println("vuelvalo a intentar");
        }
    }
 }
