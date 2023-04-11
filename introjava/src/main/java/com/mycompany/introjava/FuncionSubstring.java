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
public class FuncionSubstring {

    /**
     * @param args the command line arguments
     Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una palabra o frase porfavor");
        palabra=leer.nextLine();
        System.out.println("");
        
       if (palabra.substring(0,1).equals("a")){
            System.out.println("correcto");
        }else if(palabra.substring(0,1).equals("A")) {
         System.out.println("correcto");
        }else{
            System.out.println("INcorrecto");
        }
    }
    
}
