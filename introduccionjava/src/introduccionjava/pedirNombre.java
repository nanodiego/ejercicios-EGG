/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class pedirNombre {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        String nombre;
        System.out.println("ingrese su nombre porfavor");
        nombre=leer.nextLine();
        System.out.println("el nombre ingresado es "+nombre);
        
    }
    
}
