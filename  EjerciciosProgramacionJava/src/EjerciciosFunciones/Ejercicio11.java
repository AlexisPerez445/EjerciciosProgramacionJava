package Funciones;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la tabla de multiplicar");
		int tabla = teclado.nextInt();
		
		mostrarTabla(tabla);
	
	}
	
	public static void mostrarTabla(int a) {
		int resultado =1;
		System.out.println("Tabla del " + a);
		for (int i=1; i<=10; i++) {
			resultado= (a*i); 
			System.out.println(a + " x " + i +  " = " + resultado);
		}
	}

}
