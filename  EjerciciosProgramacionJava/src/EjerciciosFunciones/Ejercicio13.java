package Funciones;

import java.util.Scanner;

public class Ejercicio13 {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el precio sin descuento");
		int precio1 = teclado.nextInt();
		System.out.println("Dime el precio con descuento");
		int precio2 = teclado.nextInt();
		int res = saberDescuento(precio1,precio2);
		System.out.println(res);
	}
	
	public static int saberDescuento(int a, int b) {
		return (b*100)/a;
	}

}
