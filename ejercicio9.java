package boletin6_solis_maria;

import java.util.Scanner;

public class ejercicio9 {
	
	public static String eliminarVocales(String nombre) {
		String NuevaFrase = " ";
		String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
		int longitud = nombre.length() - 1;
		for (int j =0 ; j <= longitud; j++) {
			char caracter = nombre.charAt(j);
			if(vocales.indexOf(caracter) == -1) {
				NuevaFrase += (nombre.charAt(j));
			}
		}
		return NuevaFrase;
	}

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre y primer apellido: ");
		String nombre=sc.nextLine();
		System.out.println("El nombre y apellido sin vocales son " + eliminarVocales(nombre));
		sc.close();

	}

}
