package Tema6BoletinManuelCastro;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sc = new Scanner(System.in);
		
		System.out.println("Introduce la  frase : ");
		String frase = sc.nextLine();

		
		System.out.println("Introduce la  palabra : ");
		String palabra = sc.nextLine();
		
		
		BuscaPalabras(frase,palabra);
		
		System.out.println(BuscaPalabras(frase,palabra));
		
		sc.close();
	}

	//Funcion para saber cuantas veces se repite una palabra en una frase
	public static int BuscaPalabras(String frase, String palabra) {
		
		frase = frase.toLowerCase();
		
		palabra = palabra.toLowerCase();
		
		
		int contador = 0, finalpalabra /*//Esta variable es para saber donde acaba la palabra*/, posicion = 0;
		
		int cadenafrase = frase.length();
		
		
		do{
			
			//Aqui usamos el .indexOf para que nos busque la palabra
			finalpalabra = frase.indexOf(palabra,posicion);
			
			//Si el final de la palabra que buscamos es mayor que la posicion 0 nos sumara 1 ya que ha encontrado la palabra.
			if (finalpalabra >= 0) {
				
				contador++;
				
				posicion = finalpalabra + 1;
			  }
				
			
			}while (finalpalabra >= 0);
		//Este bucle se repetira mientras el final de la palabra que busco sea mayor que 0
		
		
		//Devolvemos el total de veces que encuentra la palabra que buscamos en la frase
		return contador;
		
	}

}
