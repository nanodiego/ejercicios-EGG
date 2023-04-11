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
public class gradosFahrenheit {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int grados;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese lo grados centigrados que desea se muestren en fahrenheit");
        grados=leer.nextInt();
        System.out.println("los grados "+grados+" centigrados equivalen a "+(32+(9*grados/5))+ " fahrenheit");
    }
    
}
