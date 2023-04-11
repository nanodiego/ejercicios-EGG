package guia3extras;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diego
 */
public class ej3ExVocal {

    /**
     * @param args the command line arguments Elaborar un algoritmo en el cuál
     * se ingrese una letra y se detecte si se trata de una vocal. Caso
     * contrario mostrar un mensaje. Nota: investigar la función equals() de la
     * clase String.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String vocal;
        System.out.println("ingrese una vocal porfavor");
        vocal = leer.nextLine();
        if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {
            System.out.println("ud ingreso una vocal");
        } else {
            System.out.println("ud ingreso una consonante");
        }
    }

}
