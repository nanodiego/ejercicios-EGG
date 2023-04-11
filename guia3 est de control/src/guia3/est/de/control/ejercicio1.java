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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int numero;
        System.out.println("ingrese un  numero porfavor");
        numero =leer.nextInt();
        if (numero % 2 ==0){
            System.out.println("el numero ingresado es PAR");
        }else
            System.out.println("elnuemro ingresado es impar");
        }
    
}
