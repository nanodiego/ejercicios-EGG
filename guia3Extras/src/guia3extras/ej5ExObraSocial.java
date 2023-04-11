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
public class ej5ExObraSocial {

    /**
     * @param args the command line arguments
     *
     * Una obra social tiene tres clases de socios: ○ Los socios tipo ‘A’ abonan
     * una cuota mayor, pero tienen un 50% de descuento en todos los tipos de
     * tratamientos. ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un
     * 35% de descuento para los mismos tratamientos que los socios del tipo A.
     * ○ Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
     * sobre dichos tratamientos. ○ Solicite una letra (carácter) que representa
     * la clase de un socio, y luego un valor real que represente el costo del
     * tratamiento (previo al descuento) y determine el importe en efectivo a
     * pagar por dicho socio.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String socio;
        int costo;
        System.out.println("ingrese el tipo de socio segun la opcion:");
        System.out.println("1-socio A");
        System.out.println("2-socio B");
        System.out.println("3-socio C");
        socio = leer.nextLine();

        switch (socio) {
            case "A":
                System.out.println("ingrese el costo real del tratamiento porfavor");
                costo = leer.nextInt();
                System.out.println("ud abonara el tratamiento con un 50% de descuento");
                System.out.println("el importe a abonar es = " + (costo-(costo*0.50)));
                break;
            case "B":
                System.out.println("ingrese el costo real del tratamiento porfavor");
                costo = leer.nextInt();
                System.out.println("ud abonara el tratamiento con un 35% de descuento");
                System.out.println("el importe a abonar es = " + (costo-(costo*0.35)));
                break;
            case "C":
                System.out.println("ingrese el costo real del tratamiento porfavor");
                costo = leer.nextInt();
                System.out.println("ud abonara el tratamiento con un valor de= " + costo);
                break;
            default:
                System.out.println("ud ingreso una opcion incorrecta");
        }
    }
}
