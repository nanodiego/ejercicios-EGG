/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjava;

import java.util.Scanner;

/**
 *  * 
Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 *
 * @author Diego
 */
public class funcionMatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero entero porfavor");
        numero= leer.nextInt();
        System.out.println("el doble es "+(numero*2)+" el triple es "+(numero*3)+" y la raiz cuadarada es "+Math.sqrt(numero));
    }
    
}
