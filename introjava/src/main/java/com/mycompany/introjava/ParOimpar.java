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
public class ParOimpar {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero porfavor");
        numero=leer.nextInt();
        
        if (numero % 2 ==0) {
        System.out.println("el numero ingresado es par");
        } else {
        System.out.println("el numero es impar");
            }
        }
    
}
