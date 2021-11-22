package Funciones;

public class Ejercicio15 {

	public static void main(String[] args) {
		int[] array = new int[100];
		
		for(int i=0; i<array.length;i++) {
			array[i]+=i+1;
		}
		System.out.println("Suma total " + sumaArray(array) + " Media " + mediaArray(array));
		
	}
	
	public static int sumaArray(int[] a) {
		int suma=0;
		for(int i=0; i<a.length;i++) {
			suma+=a[i];
		}
	return suma;
	}
	public static int mediaArray(int[] a) {
		int suma=0;
		for(int i=0; i<a.length;i++) {
			suma+=a[i];
		}
		int res = suma/a.length;
	return res;
	}

}
