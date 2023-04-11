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
public class ej6ExAlturaPersonas {

    /**
     * @param args the command line arguments Leer la altura de N personas y
     * determinar el promedio de estaturas que se encuentran por debajo de 1.60
     * mts. y el promedio de estaturas en general.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cantpersonas, persona, sumapersona = 0, x = 0, c = 0;
        float estatura, sumaestatura = 0, promedio=0;
        System.out.println("ingrese la cantidad de personas para sacar los promedios");
        cantpersonas = leer.nextInt();

        for (int i = 0; i < cantpersonas; i++) {
            System.out.println("ingrese persona");
            persona = leer.nextInt();
            sumapersona = sumapersona + persona;
            x = x + 1;
            System.out.println("ingrese la estatura");
            estatura = leer.nextFloat();
            sumaestatura = sumaestatura + estatura;
            c = c + 1;
            if (estatura < 1.6) {
                promedio = sumaestatura / sumapersona;
            }
        }
        System.out.println("el promedio de las estaturas en general es: " + sumaestatura / cantpersonas);
        System.out.println("el promedio de las estaturas por debajo de 1.60 es:");
        System.out.println("" + promedio);
    }
}
