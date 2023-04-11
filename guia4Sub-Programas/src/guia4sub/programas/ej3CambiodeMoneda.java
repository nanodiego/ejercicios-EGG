/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4sub.programas;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ej3CambiodeMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        double num = leer.nextDouble();
        String moneda;
        do {
            System.out.println("Ingrese la moneda a convertir (L = libras / D = dolares / Y = yenes)");
            moneda = leer.next();
        } while (!(moneda.equalsIgnoreCase("L")) && !(moneda.equalsIgnoreCase("D")) && !(moneda.equalsIgnoreCase("Y")));
        convertir(num, moneda);
    }

    public static void convertir(double num, String moneda) {
        switch (moneda.toUpperCase()) {
            case "L":
                System.out.println("La cantidad de libras es " + num * 0.86);
                break;
            case "D":
                System.out.println("La cantidad de dolares es " + num * 1.28611);
                break;
            case "Y":
                System.out.println("La cantidad de yenes es " + num * 129.852);
                break;
        }

    }
    }
    

