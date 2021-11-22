package com.mycompany.StarWars;

/*
 * Proyecto mavenproject1 - Archivo Inicio.java - Compañía DAW 
 * Licencia creative commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */;

import java.util.Scanner;


/**
 *
 * @author Alex Pérez <perezalexisdaw@gmail.es>
 * @company DAW
 * @version 1.0
 * @date 28 oct. 2021 19:11:37
 */
public class Inicio {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        /*MOSTRAR TEXTO DE INICIO*/
        Textos.Bienvenida();

        /*EMPEZAR EL JUEGO*/
        String inicio = teclado.nextLine();
        
        while(!inicio.equals("")){
            System.out.println("(Presiona Intro para continuar)");
            inicio = teclado.nextLine();
        }
        
        /*LLAMAR AL NIVEL 1*/
        /*almacenar el resultado de nivel 1*/
        int resultadoNivel1 = Niveles.Nivel1();
        
        /*VARIABLES DE LOS SIGUIENTES NIVELES*/
        int resultadoNivel2=0; 
        int resultadoNivel3=0;
        int resultadoNivel4=0;
        int resultadoNivel5=0;
        
        
        /*recibir la respuesta del usuario NIVEL 1*/
        int respuesta= teclado.nextInt();
        
        /*evaluando la respuesta del usuario y mostrar nivel 2 si es correcto*/   
        if(respuesta==resultadoNivel1){
              Textos.Correcto();
             resultadoNivel2 = Niveles.Nivel2(); 
        } else {
           Textos.Perder();
        }
               
        /*EVALUAR RESPUESTA DE NIVEL 2*/    
        respuesta= teclado.nextInt();
        if( respuesta == resultadoNivel2){
            Textos.Correcto();
            resultadoNivel3 = Niveles.Nivel3();
        } else {
             Textos.Perder();          
        }
       
        /*EVALUAR RESPUESTA DE NIVEL 3*/    
        respuesta= teclado.nextInt();
        if( respuesta == resultadoNivel3){
            Textos.Correcto();
            resultadoNivel4=Niveles.Nivel4();
        } else {
             Textos.Perder();
        }
        
        /*EVALUAR RESPUESTA DE NIVEL 4*/    
        respuesta= teclado.nextInt();
        if( respuesta == resultadoNivel4){
            Textos.Correcto();
            resultadoNivel5=Niveles.Nivel5();
        } else {
             Textos.Perder();
        }
        
        /*EVALUAR RESPUESTA DE NIVEL 5*/    
        respuesta= teclado.nextInt();
        if( respuesta == resultadoNivel5){
            Textos.Correcto();
            Textos.Ganar();
            Textos.TextoFin();
        } else {
             Textos.Perder();
        }
    }
}
