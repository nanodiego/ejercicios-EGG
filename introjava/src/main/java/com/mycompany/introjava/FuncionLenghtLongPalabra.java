package com.mycompany.introjava;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class FuncionLenghtLongPalabra {

    /**
     * @param args the command line arguments
     * Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una palabra o frase de 8 caracteres porfavor");
        palabra=leer.nextLine();
        System.out.println("");
        
        if (palabra.length()==8){
            System.out.println("correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
