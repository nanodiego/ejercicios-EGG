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
public class CondicionalesIfAndSwitch {

    /**
     * @param args the command line arguments
     * Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tipomotor;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tipo de motor entre 1 y 4");
        tipomotor=leer.nextInt();
        System.out.println("");
        
        if (tipomotor >= 1 && tipomotor <= 4){
        switch (tipomotor){
            case 1:
            System.out.println("La bomba es una bomba de agua");
            break;
            case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3:
            System.out.println("La bomba es una bomba de hormigon");
            break;
            case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
         }
    }else{
            System.out.println("no existe un valor valido para tipo de bomba");
        
        
    }
    }
    
}
