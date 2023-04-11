/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class FuncionMathsquart {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero entero porfavor");
        numero=leer.nextInt();
        System.out.println("el doble del numero que ingreso es "+(numero*2)+" el triple es "+(numero*3)+" y la raiz cuadrada es "+Math.sqrt(numero));
      
                }
    
}
