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
public class ej10ExAdivMultiplica {

    /**
     * @param args the command line arguments
     * Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, numx, respuesta = 0;
        System.out.println("ingrese el resultado posible de una multiplicacion entre dos numeros enteros");
        numx = leer.nextInt();

        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        System.out.println(num1);
        System.out.println(num2);
        respuesta = num1 * num2;
        System.out.println(respuesta);
        
        while (numx != respuesta) {
            System.out.println("has fallado, vuelve a intentarlo");
            numx = leer.nextInt();
        }
        System.out.println("HAS ACERTADO!!!!!");
    }
    }
