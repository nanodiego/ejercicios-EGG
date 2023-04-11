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
public class ejercicio6OpcionSantiago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion,numero1,numero2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        numero2 = leer.nextInt();
        do{        
            System.out.println("MENU");
            System.out.println("1.-Suma");        
            System.out.println("2.-Resta");
            System.out.println("3.-Multiplicar");
            System.out.println("4.-Dividir");
            System.out.println("5.-Salir");
            System.out.print("Elija una Opcion: ");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La suma es:"+(numero1+numero2));
                    continue;
                case 2:
                    System.out.println("La resta es: "+(numero1-numero2));
                    continue;
                case 3:
                    System.out.println("La multiplicación es:"+(numero1*numero2));
                    continue;
                case 4:
                    System.out.println("La division es:"+(numero1/numero2));
                    continue;
                case 5:
                    System.out.println("Salió exitosamente del menu!!!");
                    break;
                default:
                    System.out.println(" Elija una opcion correcta..");
            }
        }while(opcion!=5);
    }
    
}
