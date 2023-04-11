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
public class ejercicio5 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        double grados;
        System.out.println("ingrese los grados centigraods para que sean cambiados a fahrenheit");
        grados=leer.nextInt();
        System.out.println("los grados centigrados: "+grados+" equivalen a: "+(32+(9*grados/5))+" fahrenheit");
    }
}
