/*
 * Proyecto mavenproject1 - Archivo Ejercicio2.java - Compañía DAW 
 * Licencia creative commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Matrices;

/**
 *
 * @author Alex Pérez <perezalexisdaw@gmail.es>
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tablas = new int[10][10];
        
          /*LLENAR LA MATRIZ CON LA MULTIPLICACION*/
        for(int i=0; i<tablas.length;i++){
            for(int j=0; j<tablas.length;j++){
                tablas[i][j]= (i+1)*(j+1);
            }
        }
        
        /*MOSTRAR LA MATRIZ*/
        for(int i=0; i<tablas.length;i++){
            System.out.print("Tabla del " + (i+1)+ ": ");
            for(int j=0; j<tablas.length;j++){
                System.out.print(" "+tablas[i][j]);
            }
            System.out.println("");
        }
    }
    
}
