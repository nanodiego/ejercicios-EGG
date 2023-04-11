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
public class ej10Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num,j=0,i=0;
        System.out.println("Ingresa un numero 4 veces");
        
        do {
            num = leer.nextInt();
            System.out.print(num+" ");
          for (i = 0; i<num; i++) {
              System.out.print("*");          
        }    
            System.out.println(""); 
         j++; 
        } while (j!=4);

        }
    }