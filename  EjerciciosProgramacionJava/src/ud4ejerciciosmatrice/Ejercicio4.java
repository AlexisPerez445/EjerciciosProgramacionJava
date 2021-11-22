/*
 * Proyecto mavenproject1 - Archivo Ejercicio4.java - Compañía DAW 
 * Licencia creative commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Matrices;

import java.util.Scanner;

/**
 *
 * @author Alex Pérez <perezalexisdaw@gmail.es>
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int[][] notas = new int[4][5];
        int alumnos =1;
        double[] media = new double[4];
        int[] max = new int[4];
        int[] min = new int[4];
        int posicion = 0;
        int posicion1 = 0;
        int posicion2= 0;

        
        /*PEDIR AL USUARIO LAS NOTAS*/
        for(int i=0; i<notas.length;i++){
            for(int j =0; j<notas[i].length;j++){
                System.out.println("Dime el valor de " + i + ":" + j );
                notas[i][j]= teclado.nextInt();
            }
        }
        
     
        /*SACAR LA MEDIA DE NOTAS*/
        for(int i=0; i<notas.length;i++){
            for(int j=0;j<notas[i].length;j++){
                media[posicion]+=notas[i][j];
            }
            media[posicion]/=notas[i].length;
            posicion++;
        }
        
         /*SACAR LA NOTA MAXIMA*/
         for(int i=0; i<notas.length;i++){
            for(int j=0;j<notas[i].length;j++){
                if(notas[i][j]>max[posicion1]){
                    max[posicion1]=notas[i][j];
                }
            }
            posicion1++;
        }

         /*SACAR LA NOTA MINIMA*/
         for(int i=0;i<notas.length;i++){
             for(int j=0;j<notas[i].length;j++){
                 min[i]=notas[i][0];
             }
         }
         
         for(int i=0; i<notas.length;i++){
            for(int j=0;j<notas[i].length;j++){
                if(notas[i][j]<min[posicion2]){
                    min[posicion2]=notas[i][j];
                }
            }
            posicion2++;
        }
                
        /*MOSTRAR MATRIZ*/
        for(int i=0; i<notas.length;i++){
            System.out.print("Alumno " + ": ");
            for(int j =0; j<notas[i].length;j++){
                System.out.print(notas[i][j]+" ");
            }
            System.out.println("");
        }       
        
        /*MOSTRAR EL RESULTADO*/
        for(int i=0; i<media.length;i++){
            System.out.println("Alumno " + alumnos + " Media " + media[i] + " Max " + max[i] + " Min " + min[i]);
            alumnos++;
        } 
    }
    
}
