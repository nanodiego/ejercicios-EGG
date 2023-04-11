/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Introjava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("ingresa tu nombre");
       nombre=leer.next();
       System.out.println("hola mundo, soy " +nombre+ " y estoy programando en java!");
    }
}
