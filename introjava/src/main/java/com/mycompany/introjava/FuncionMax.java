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
public class FuncionMax {

    /**
     * @param args the command line arguments
     * Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros porfavor");
        numero1=leer.nextInt();
        numero2=leer.nextInt();
        System.out.println("");
        /*
        con Math.max(int a,int b) nos muestra por pantalla SOLO el mayor numero ingresado.
        */
        System.out.println("el mayor de los numero ingresados es "+Math.max(numero1,numero2));
    }
    
}
