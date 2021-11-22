package com.mycompany.StarWars;

/*
 * Proyecto mavenproject1 - Archivo Nivel1.java - Compañía DAW 
 * Licencia creative commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
import java.lang.Math;

/**
 *
 * @author Alex Pérez <perezalexisdaw@gmail.es>
 * @company DAW 
 * @version 1.0
 * @date 28 oct. 2021 20:14:58
 */

/*CLASE CON TODOS LOS NIVELES*/
public class Niveles {
    
    ///////////////////////
    ///*FUNCIÓN NIVEL 1*///
    static int Nivel1() {     

        int S1 =(int) (1 + Math.random() * (10- 1 +1));
        int S2 =(int) (20 + Math.random() * (30-20+1));
        int resultado =0;
        
        /*mostrar texto del nivel 1*/
        Textos.TextoNivel1(S1,S2);
        
        /*realizar la operacion*/
        for(int i=S1;i <=S2;i++ ){
            resultado+=i;
        }
        /*devolver el resultado*/
        return resultado;
    }
     ///////////////////////
     ///*FUNCIÓN NIVEL 2*///
    static int Nivel2() {    
 
        int P1 =(int) (1 + Math.random() * (7- 1 +1));
        int P2 =(int) (8 + Math.random() * (12-8+1));
        int resultado =1;
        
        /*mostrar texto del nivel 2*/
        Textos.TextoNivel2(P1,P2);
        
         /*realizar la operacion*/
        for(int i=P1;i <=P2;i++ ){
            resultado*=i;
        }
        
        /*devolver el resultado*/
        return resultado;
    }
    ///////////////////////
    ///*FUNCIÓN NIVEL 3*///
    static int Nivel3() {  
  
        int num =(int) (50 + Math.random() * (100- 50 +1));
        int factorial = num/10;
        int resultado =1;
        
        /*mostrar texto del nivel 3*/
        Textos.TextoNivel3(num);
        
        /*realizar la operacion*/
        for(int i=1;i <=factorial;i++ ){
            resultado*=i;
        }
       
        /*devolver el resultado*/
        return resultado;
    }
    
    ///////////////////////
    ///*FUNCIÓN NIVEL 4*///
    static int Nivel4() {  
   
        int num =(int) (10 + Math.random() * (100- 10 +1));
        int resultado =1;
        
        /*mostrar texto del nivel 4*/
        Textos.TextoNivel4(num);
        
        /*realizar la operacion*/
        for(int i=2;i <=num;i++ ){
            if(num%i==0){
            resultado=0;
            }
            else { resultado=resultado; }
        } 
        
        /*devolver el resultado*/
        return resultado;
    }
    
    ///////////////////////
    ///*FUNCIÓN NIVEL 5*///
    static int Nivel5() {    
    
        int P1 =(int) (5 + Math.random() * (10 - 5 +1));
        int P2 =(int) (5 + Math.random() * (10 - 5 +1));
        int res1 =1;
        int res2 =1;
        int resultado;
        
        /*mostrar texto del nivel 5*/
        Textos.TextoNivel5(P1,P2);
        
         /*realizar la operacion*/
        for(int i=1;i <=P1;i++ ){
            res1*=i;
        }
        for(int i=1;i <=P2;i++ ){
            res2*=i;
        }
        resultado=res1+res2;
        
        /*devolver el resultado*/
        return resultado;
    }
    
}
