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
public class ej6Teorico {

    /**
     * Implementar un programa que le pida dos números enteros al usuario y
     * determine si ambos o alguno de ellos es mayor a 25.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero1, numero2;
        System.out.println("ingrese 2 numeros enteros porfavor");
        numero1 =leer.nextInt();
        numero2 =leer.nextInt();
        if (numero1>25 || numero2>25 ){
            System.out.println("uno o ambos de los numeros ingresados son mayores a 25");
        }else{
            System.out.println("los numeros ingresados son menores a 25");
        
    }
    }
    
}
