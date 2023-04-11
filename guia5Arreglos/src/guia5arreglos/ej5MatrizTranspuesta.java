/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5arreglos;

/**
 *
 * @author Diego
 */
public class ej5MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (10-Math.random() * 20) ;
            }
        }
        int[][] trans = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //if(matriz[i][j] = -matriz[j][i]);
                
              //  trans[i][j] =  matriz[j][i];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("  ");            
        }
        System.out.println("  ");
        System.out.println("TRANSPUESTA");
        System.out.println("  ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(trans[i][j] + "  ");
            }
            System.out.println("  ");            
        }
    }
    }
    

