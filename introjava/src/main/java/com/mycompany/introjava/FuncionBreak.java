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
public class FuncionBreak {

    /**
     * @param args the command line arguments
     * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner leer=new Scanner(System.in);
        
        do{
        System.out.println("ingrese una nota del 0 al 10 porfavor");
        nota=leer.nextInt();
       }while(nota<=0&& nota>=10);
        System.out.println("la nota es correcta");
    }
}
            

    
                
    
    

        