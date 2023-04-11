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
public class ejercicio4Substring {

    /**
     * @param args the command line arguments
     * Escriba un programa que pida una frase o palabra y valide si la primera 
     * letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá
     * de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
     * se deberá imprimir “INCORRECTO”.
     * Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase= leer.nextLine();         
        if (frase.substring(0,1).equals("a") ) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        /*System.out.println(frase.substring(2));
        System.out.println(frase.substring(0,3)); */
    
        }
    }
    

