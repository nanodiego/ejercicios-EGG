/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.est.de.control;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ejercicio2Equals {

    /**
     * @param args the command line arguments
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
     * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
     * Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String frase;
        System.out.println("ingrese un  numero porfavor");
        frase =leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("correcto");
        }else
            System.out.println("incorrecto");
        }
    
}
    
    

