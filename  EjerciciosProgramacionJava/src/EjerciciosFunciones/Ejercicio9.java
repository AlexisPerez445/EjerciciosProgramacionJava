package Funciones;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		int num1 = teclado.nextInt();
		System.out.println("Dime otro numero");
		int num2 = teclado.nextInt();
		int mayor = ElMayor(num1,num2);
		System.out.println("El mayor es: " + mayor);

	}
	
	public static int ElMayor(int a, int b) {
		int mayor;
		if (a>b) {
			mayor =a;
		} else {
			mayor = b;
		}
		return mayor;
	}

}
