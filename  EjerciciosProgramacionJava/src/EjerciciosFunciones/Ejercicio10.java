package Funciones;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		
		System.out.println("Dime el dia");
		int dia= teclado.nextInt();
		System.out.println("Dime el mes");
		int mes = teclado.nextInt();
		System.out.println("Dime el año");
		int año = teclado.nextInt();
		String resultado = comprobarFecha(dia,mes,año);
		System.out.println(resultado);

	}
	
	public static String comprobarFecha(int dia, int mes, int año) {
		String resultado;
		if(dia>30 || mes>12) {
			resultado ="Fecha incorrecta";
		} else {
			resultado = "Fecha correcta";
		}
		return resultado;
	}

}
