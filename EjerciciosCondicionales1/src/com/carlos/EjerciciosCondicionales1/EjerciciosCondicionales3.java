package com.carlos.EjerciciosCondicionales1;

import java.util.Scanner;

public class EjerciciosCondicionales3 {

	public static void main(String[] args) {
		int entradaUsuario1 = 0;
		int entradaUsuario2 = 0;
		int entradaUsuario3 = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame el primer numero:");
		if (entrada.hasNextInt()) {
			// obtenemos el valor introducido por el teclado
			entradaUsuario1 = entrada.nextInt();
			entrada.nextLine();
			
			}

		else {
			System.out.println("El valor no es valido.");

		}
		System.out.println("Dame el segundo numero:");
		if (entrada.hasNextInt()) {
			// obtenemos el valor introducido por el teclado
			entradaUsuario2 = entrada.nextInt();
			entrada.nextLine();
			
			}

		else {
			System.out.println("El valor no es valido.");}
		System.out.println("Dame el tercer numero:");
		if (entrada.hasNextInt()) {
			// obtenemos el valor introducido por el teclado
			entradaUsuario3 = entrada.nextInt();
			entrada.nextLine();
			
			}

		else {
			System.out.println("El valor no es valido.");}
	}
	
}
