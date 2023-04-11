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
public class ej8ExMultde5 {

    /**
     * @param args the command line arguments
     * Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero, i = 0, par = 0, impares = 0;

        do {
            System.out.println("ingrese el valor numero:" + (i + 1));
            numero = leer.nextInt();
            i++;//uso este contador para saber la cantidad de numeros leidos
            if (numero > 0) { //con este if doy la orden para que ingresen por teclado 
                //numeros negativos, pero que no se sumen y no se tengan en cuenta
                //para el conteo de numeros pares e impares.
                if (numero % 2 == 0) {
                    par++;//de esta forma se van sumando la cantidad de numeros pares
                    //que el usuario va ingresando. Idem para impares.
                } else {
                    impares++;
                }
            }
        } while (numero % 5 != 0);//en esta linea hacemos que el bucle se corte cuando se ingrese
        //un numero multiplo de 5 y lo tenga en cuenta para el conteo y las pariedades, caso
        //contrario, si se desea que el numero no se tenga en cuenta y no se genere el corrimiento
        //del codigo se utiliza un while.
       System.out.println("la cantidad de numeros leidos es: " + i);
        System.out.println("la cantidad de numeros pares es: " + par);
        System.out.println("la cantidad de numeros impares es: " + impares);
    }

}
