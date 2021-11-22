/*
 * Proyecto mavenproject1 - Archivo Ejercicio3.java - Compañía DAW 
 * Licencia creative commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author Alex Pérez <perezalexisdaw@gmail.es>
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n,m,contador = 0,contador2=0;
        
        System.out.println("Dime el tamaño de N");
        n=teclado.nextInt();
        
        System.out.println("Dime el tamaño de M");
        m=teclado.nextInt();
        
        int[][] matriz= new int [n][m];
        
        
         for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.println("Dime el valor de " + i + ":" + j );
                matriz[i][j]= teclado.nextInt();
            }
        }
         
         
         for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                if(matriz[i][j]< 0){
                contador++;
                }  else if(matriz[i][j]==0){
                   contador2++;
                   }
            }
        }
         System.out.println("Son menores que [0] " + contador + " Son iguales a [0] " + contador2);
    }
    
}
