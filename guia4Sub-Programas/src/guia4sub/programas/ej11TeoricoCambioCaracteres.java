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
public class ej11TeoricoCambioCaracteres {

    /**
     * @param args the command line arguments
     * Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("ingrese una frase y concluyala con punto");
        frase = leer.nextLine();
        if (!frase.endsWith(".")) {
            System.out.println("la frase no termina en punto, intentelo de nuevo");
            frase = leer.nextLine();
        }
        String respuesta = nuevafrase(frase);
        System.out.println(respuesta);
    }

    public static String nuevafrase(String frase) {
        String cambio = "";

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);// es para leer  cada caracter 
            switch (letra) {

                case 'a':
                    cambio = cambio + "@";
                    break;
                case 'e':
                    cambio += "#";
                    break;
                case 'i':
                    cambio += "$";
                    break;
                case 'o':
                    cambio += "%";
                    break;
                case 'u':
                    cambio += "*";
                    break;
                default:
                    cambio += letra;
                    break;
            }
        }
        return cambio;
    }
    
        }
        
        
    
