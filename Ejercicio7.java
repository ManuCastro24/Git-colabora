package Tema6BoletinManuelCastro;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase : ");
		String frase = sc.nextLine();
		
		InvertirFrase(frase);
		
		sc.close();
		
	}

	public static void InvertirFrase(String f) {
		
		int longitud = f.length() - 1;
		
		for(int i = 0; i <= longitud; i++){
			
			char resultado = f.charAt(longitud -i);
			
			System.out.print(resultado);
		}
			
	 }

}
