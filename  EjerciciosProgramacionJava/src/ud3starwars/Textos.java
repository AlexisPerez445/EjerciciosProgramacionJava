/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.StarWars;

/**
 *
 * @author Alex
 */

/*CLASE CON TODOS LOS TEXTOS*/
public class Textos {
    
    /*TEXTO DE BIENVENIDA*/
    static void Bienvenida() {
        
        System.out.println("=== STARS WARS CÓDIGOS SECRETOS ===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa\n"
                            + "Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan\n"
                            + "en una nave imperial robada en una misión secreta para infiltrarse\n"
                            + "en otra estrella de la muerte que el imperio está construyendo\n"
                            + "para destruirla.\n(Presiona Intro para continuar)");
                }
    
    /*TEXTO DEL NIVEL 1*/
    static void TextoNivel1(int a, int b) {

        System.out.println("===NIVEL 1 ===");
        System.out.println("Los   problemas empiezan cuando deben realizar un salto\n"
                            + "hiperespacial hasta el sistema estelar " + a + " en el sector "+ b + " pero el\n"
                            + "control de navegación está estropeado y el computador tiene\n"
                            + "problemas para calcular parte de las coordenadas de salto.\n"
                            + "Chewbacca, piloto experto, se da cuenta que falta el cuarto\n"
                            + "número de la serie. Recuerda de sus tiempos en la academia de\n"
                            + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                            + "nº del sistema y el nº del sector (ambos inclusive)."
                            + "\n¿Qué debe introducir?");
    }
    
    /*TEXTO DEL NIVEL 2*/
    static void TextoNivel2(int a, int b) {

        System.out.println("===NIVEL 2 ===");
        System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n" +
                            "lo lejos la estrella de la muerte. Como van en una nave imperial\n" +
                            "robada se aproximan lentamente con la intención de pasar\n" +
                            "desapercibidos. De repente suena el comunicador. “Aquí agente\n" +
                            "de espaciopuerto " + a + " contactando con nave imperial " + b + ". No están\n" +
                            "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n" +
                            "comunicador e improvisa. “Eh... tenemos un fallo en el... eh...\n" +
                            "condensador de fluzo... Solicitamos permiso para atracar y\n" +
                            "reparar la nave”. El agente, que no se anda con tonterías,\n" +
                            "responde “Proporcione código de acceso o abriremos fuego”. Han\n" +
                            "Solo ojea rápidamente el manual del piloto que estaba en la\n" +
                            "guantera y da con la página correcta. El código es el productorio\n" +
                            "entre el nº del agente y el nº de la nave (ambos inclusive).\n" +
                            "¿Cuál es el código?");
    }
    
    /*TEXTO DEL NIVEL 3*/
    static void TextoNivel3(int a) {

        System.out.println("===NIVEL 3 ===");
        System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de\n" +
                            "la muerte, se equipan con trajes de soldados imperiales que\n" +
                            "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n" +
                            "deben averiguar en qué nivel de los "+ a + " existentes se encuentra el\n" +
                            "reactor principal. Se dirigen al primer panel computerizado que\n" +
                            "encuentran y la Princesa Leia intenta acceder a los  planos de  la\n" +
                            "nave pero necesita introducir una clave de acceso. Entonces\n" +
                            "recuerda la información que le proporcionó Lando Calrissian “La\n" +
                            "clave de acceso a los planos de la nave es el factorial de N/10\n" +
                            "(redondeando N hacia abajo), donde N es el nº de niveles”.\n" +
                            "¿Cual es el nivel correcto?");
    }
    
    /*TEXTO DEL NIVEL 4*/
    static void TextoNivel4(int a) {

        System.out.println("===NIVEL 4 ===");
        System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y\n" +
                            "encuentran la puerta acorazada que da al reactor principal. R2D2\n" +
                            "se conecta al panel de acceso para intentar hackear el sistema y\n" +
                            "abrir la puerta. Para desencriptar la clave necesita verificar si el\n" +
                            "número "+ a + " es primo o no. Si es primo introduce un 1, si no lo es\n" +
                            "introduce un 0.");
    }
    
    /*TEXTO DEL NIVEL 5*/
    static void TextoNivel5(int a, int b) {

        System.out.println("===NIVEL 5 ===");
        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n" +
                            "coloque la bomba, programe el temporizador y salir de allí\n" +
                            "corriendo. Necesita programarlo para que explote en exactamente\n" +
                            "" + a + " minutos y " + b + " segundos, el tiempo suficiente para escapar antes\n" +
                            "de que explote pero sin que el sistema de seguridad anti-\n" +
                            "explosivos detecte y desactive la bomba. Pero el temporizador\n" +
                            "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n" +
                            "minutos y segundos al sistema Zordgiano hay que sumar el\n" +
                            "factorial de M y el factorial de S. ¿Qué valor debe introducir?");
    }
    
    /*MOSTRAR TEXTO PERDER LA PARTIDA*/
    static void Perder() {
        
        System.out.println("=== SORRY ===");
        System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :(\n" +
                            "Todavía no eres un Maestro Jedi de las Matemáticas.\n" +
                            "¡Vuelve a intentarlo!");
    }
    
    /*MOSTRAR TEXTO AL PONER LA RESPUESTA CORRECTA*/
    static void Correcto() {
        
        System.out.println("Correcto!\n");
    }
    
    /*MOSTRAR TEXTO AL GANAR LA PARTIDA*/
    static void Ganar() {
        
        System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n" +
                            "temporizador y empiezan a sonar las alarmas. Salen de allí\n" +
                            "corriendo, no hay tiempo que perder. La nave se convierte  en un\n" +
                            "hervidero de soldados de arriba a abajo y entre el caos que les\n" +
                            "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n" +
                            "medida que se alejan observan por la ventana la imagen de la\n" +
                            "colosal estrella de la muerte explotando en el silencio del espacio,\n" +
                            "desapareciendo para siempre junto a los restos del malvado\n" +
                            "imperio.\n" +
                            "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n" +
                            "Enhorabuena ;D\n");
    }
    
    /*MOSTRAR TEXTO FINAL DEL JUEGO*/
    static void TextoFin() {
        
        System.out.println("Gracias por jugar :D");
    }
}
