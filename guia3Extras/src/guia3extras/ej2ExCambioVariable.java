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
public class ej2ExCambioVariable {

    /**
     * @param args the command line arguments
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
diferente a cada una. A continuación, realizar las instrucciones
necesarias para que: B tome el valor de C, C tome el valor de A, A tome
el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
valores finales de cada variable. Utilizar sólo una variable auxiliar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int a=1, b=2, c=3, d=4, x;
        
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        x=b; 
        x=c; 
        x=a; 
        x=d;
        
        b=c;
        c=a;
        a=d;
        d=b;
                
        System.out.println("el valor de b ahora es="+b+" porque toma el valor de c");
        System.out.println("el valor de c ahora es="+c+" porque toma el valor de a");
        System.out.println("el valor de a ahora es="+a+" porque toma el valor de d");
        System.out.println("el valor de d ahora es="+d+" porque toma el valor de b");
    }
    
}
