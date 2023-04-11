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
public class ej12ExXXX {

    /**
     * @param args the command line arguments
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3;
        
        num1 = (int) (Math.random() * 9);
        num2 = (int) (Math.random() * 9);
        num3=(int) (Math.random()*9);
        System.out.println(num1+"-"+num2+"-"+num3);
        if (num1==3 || num2==3 || num3==3){
            
            System.out.println(num1+"-"+num2+"-"+num3);
        
        }        
    }
    
}
