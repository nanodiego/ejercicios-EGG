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
public class nombreEnvariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* en este caso para definir una variable de tipo caracter se usa la palabra reservada String
        
        */
        String nombre;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese su nombre porfavor");
        /*en la siguiente linea tenemos que definir el ingreso por pantalla con nextLine
        para que se pueda ingresar caracteres. 
        nextInt se usa para el ingreso por pantalla de numeros
        */
        nombre=leer.nextLine();
        System.out.println("bienvenido "+nombre+" al ejercicio numero 3 de java");
    }
    
}
