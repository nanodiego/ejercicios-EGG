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
public class FuncionUppercaseMayuMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una frase porfavor");
        frase=leer.nextLine();
        System.out.println("");
        /*
        retorna la cadena en mayusculas
        */
        System.out.println(frase.toUpperCase());
        System.out.println("");
        /*
        retorna la cadena en minuscula
        */
        System.out.println(frase.toLowerCase());
        
    }

   
    }
    

