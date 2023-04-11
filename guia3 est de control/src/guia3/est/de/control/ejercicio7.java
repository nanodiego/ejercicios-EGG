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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int cont=0,er=0;
    String sal="&&&&&";
    String cadena;
        boolean ver= true;
    do  {
    System.out.println("ingrese la frase");
    cadena= leer.next();
    
    if(cadena.length()== 5 ){
        if (cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
        cont++;
       }else{
        er++;
        }
    }
    if (cadena.equals(sal)){
    ver=false;
            }
    }while(ver);
    System.out.println("Las veces corrrectas fueron " + cont);
    System.out.println("Las veces incorrrectas fueron " + er);
    }
}
    
    

