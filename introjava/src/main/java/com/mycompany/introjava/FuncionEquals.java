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
public class FuncionEquals {

    /**
     * @param args the command line arguments
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase, palabra;
                
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una frase porfavor");
        frase=leer.nextLine();
        
        if (frase.equals("eureka")){
        System.out.println("la frase ingresada es correcta");
        }else{
            System.out.println("es incorrecta");
        }
        }
    }
    

