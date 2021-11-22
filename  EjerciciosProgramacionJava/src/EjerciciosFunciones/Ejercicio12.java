package Funciones;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime los kilómetros");
		double km = teclado.nextDouble();
		
		double res = cambioKm(km);
		System.out.println("El resultado es " + res);

	}
	
	public static double cambioKm(double a) {
		return a* 0.621371;
	}

}
