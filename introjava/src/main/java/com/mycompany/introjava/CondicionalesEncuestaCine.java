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
public class CondicionalesEncuestaCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        int opinion;
        Scanner leer=new Scanner(System.in);
        System.out.println("clasifique la peli del 1 al 5");
        opinion= leer.nextInt();
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion) {
            case 1:
            case 2: System.out.println("nos sentimos apenados que no hayas disfrutado la peli...");
            break;
            case 3: System.out.println("has calificado la peli como buena");
            break;
            case 4: System.out.println("has calificado la peli como muy buena");
            break;
            case 5: System.out.println("has calificado la peli como excelnte, nos alegra que te haya gustado");
            break;
        }
        }else if (opinion <0) {
            System.out.println("una opinion negativa?, ¿tan mala fue la pelicula?");
        }else if (opinion==0) {
            System.out.println("el valor "+opinion+ " no es valido y no se tomara en cuenta");
        }else {
            System.out.println("wow, se te fue la mano con la calificacion");
        }
        System.out.println("hasta la proxima");
        
            
        }
        }
    
    

