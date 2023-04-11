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
public class ej8Teorico {

    /**
     * Escriba un programa que valide si una nota está entre 0 y 10,
     * sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int nota;
        System.out.println("ingrese un numero entre 0 y 10 porfavor");
        nota=leer.nextInt();
        while(nota<0 || nota>10){
            System.out.println("ingrese la nota nuevamente");
            nota=leer.nextInt();
        }
        
        
        
    }
    
}
