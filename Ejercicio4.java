package Tema6BoletinManuelCastro;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sc = new Scanner(System.in);
	
		System.out.print("Escribe una frase : ");
		String cadena = sc.nextLine();
		
		Cadena1(cadena);
		
		sc.close();
		
	}

	public static void Cadena1(String cadena) {
		
		
		int media = cadena.length() / 2;
			
		String resultado =  cadena.substring(0, media) + "<>" + cadena.substring(media); 
		
		System.out.print(resultado);
	}
}
