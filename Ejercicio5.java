package Tema6BoletinManuelCastro;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var sc = new Scanner(System.in);
		
		
		System.out.print("Por favor, introduzca un número entero positivo: ");
		int numero = sc.nextInt();
		
		System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
		int posicion = sc.nextInt();
		
		
		String Numero = String.valueOf(numero);
		
		Numpartido(Numero, posicion);
		
		
	}

	
	public static void  Numpartido(String num , int partir) {
		
		
		String resultado =  num.substring(0, partir-1) + " " + num.substring(partir-1); 
	
		System.out.println(resultado);
	}

}