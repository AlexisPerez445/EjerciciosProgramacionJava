package Funciones;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Dime el valor de X");
		int x = teclado.nextInt();
		System.out.println("Dime el carácter");
		teclado.nextLine();
		String letra = teclado.nextLine();
		mostrarTriangulo(x,letra);
	}

	
	public static void mostrarTriangulo(int x, String b) {
        int impar=1;

		for (int i = 1; i <= x; i++) {
			for (int k = x; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < impar; j++) {
				System.out.print(b);
			}
			System.out.println("");
			impar += 2;
		}
	}
}
