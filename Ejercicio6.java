package Tema6BoletinManuelCastro;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);
		
		//Pedir por consola los datos
		System.out.print("Por favor, introduzca un número entero positivo: ");
		long numero = sc.nextInt();
		
		System.out.print("Introduzca la posición donde quiere insertar el número: ");
		int posicion = sc.nextInt();
		
		System.out.print("Introduzca el número que quiere insertar en esa posicion: ");
		int insertar = sc.nextInt();

		String Numero = String.valueOf(numero);
		//ir a la funcion
		InsertarNum(Numero, posicion, insertar);
		
		sc.close();
		
	}

	public static void  InsertarNum(String num , int posicion, long insertar) {
		
		//funcion para insertar numero
		String resultado =  num.substring(0, posicion-1) + insertar + num.substring(posicion-1); 
	
		System.out.println(resultado);
	}

}
