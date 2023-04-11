/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5arreglos;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ej13y14TeoricoVector {

    /**
     * @param args the command line arguments
     * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de 
     * compañeros de equipo y define su tipo de dato de tal manera que
     * te permita alojar sus nombres más adelante.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //creacion del vector indicando su dimension,en una misma linea.
        String [] equipo=new String[5];
        
        //asignacion de elementos a un vector
        String nombre;
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese nombre");
            nombre=leer.nextLine();
            equipo[i]= nombre;
        }
        //imprimimos por pantalla el vector con el for "mejorado"
        String aux="";
        for (String elemento: equipo) {
            aux += elemento+ " , ";
             //System.out.println(aux);
       }
        System.out.println(aux);
        
        //otra forma de impirmir por sin usar el for "mejorado".
        for (int i = 0; i < 5; i++) {
            System.out.print(equipo[i]+" - ");
   }
    }
    } 

