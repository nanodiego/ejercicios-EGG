/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extras;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ej1Exminhsdia {

    /**
     * @param args the command line arguments
     *      * 
Dado un tiempo en minutos, calcular su equivalente en días y horas.
* Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente:
* 1 día, 2 horas.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double minutos;
        System.out.println("ingrese los minutos porfavor");
        minutos=leer.nextInt();
        System.out.println("el equivalente en dias es "+minutos/1440+" y el equivaleknte en horas es "+minutos/60);
    }
    
}
