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
public class suma2enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1,numero2;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros porfavor para que sean sumados");
        numero1=leer.nextInt();
        numero2=leer.nextInt();
        System.out.println("la suma de ambos numeros ingresados es igual a "+(numero1+numero2));
    }
    
}
