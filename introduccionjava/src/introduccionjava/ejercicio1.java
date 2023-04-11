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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero1, numero2;
        System.out.println("ingrese dos numeros para que sean sumados");
        numero1= leer.nextInt();
        numero2= leer.nextInt();
        System.out.println("la suma de los numeros ingresados es "+(numero1+numero2));
    }
    
}
