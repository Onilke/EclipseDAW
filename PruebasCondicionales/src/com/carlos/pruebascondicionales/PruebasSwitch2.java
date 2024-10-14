package com.carlos.pruebascondicionales;

import java.util.Scanner;

public class PruebasSwitch2 {

	public static void main(String[] args) {

		/*
		 * int numero = 2;
		 * 
		 * switch (numero) { case 1: System.out.println("El valor es 1"); break; case 3:
		 * System.out.println("El valor es 3"); break; case 5:
		 * System.out.println("El valor es 5"); break; default:
		 * System.out.println("No hay valor"); break; }
		 */

		/*
		 * String cadena = "adios"; switch (cadena) { case "adios":
		 * System.out.println("manzana"); break; case "como va":
		 * System.out.println("melocoton"); break; case "hola":
		 * System.out.println("pera"); break; default: System.out.println("Nada");
		 * break; }
		 */
		// Variables
		int n1 = 0;
		int n2 = 0;
		int opcion = 0;
		boolean valor1Correcto = false;
		boolean valor2Correcto = false;
		Scanner entrada = new Scanner(System.in);
		String menu = "               MENU \n";
		menu += "          ---------------\n";
		menu += "          opcion 1:Suma\n";
		menu += "          opcion 2:Resta\n";
		menu += "          opcion 3:Multiplicacion\n";
		menu += "          opcion 4:Division";

		// pedimos el primer numero
		System.out.println("Dame un numero entero:");
		if (entrada.hasNextInt()) {
			n1 = entrada.nextInt();
			valor1Correcto = true;
		} else {
			System.out.println("El primer numero no es un numero valido.");
		}
		// limpiamos el buffer de entrada
		entrada.nextLine();
		if (valor1Correcto) {
			// pedimos el segundo numero
			System.out.println("Dame otro numero entero:");
			if (entrada.hasNextInt()) {
				n2 = entrada.nextInt();
				valor2Correcto = true;
			} else {
				System.out.println("El segundo numero no es un numero valido.");
			}
			// limpiamos el buffer de entrada
			entrada.nextLine();
		}
		// Mostramos el menu
		if (valor1Correcto && valor2Correcto) {
			System.out.println(menu);
			// pedimos la opcion del menu
			System.out.println("Que opercion deseas realizar?");
		}
		if (entrada.hasNextInt()) {
			opcion = entrada.nextInt();
		}
		switch (opcion) {
		case 1:
			System.out.println("Primer numero: " + n1);
			System.out.println("Segundo numero: " + n2);
			System.out.println("La suma de: " + n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case 2:
			System.out.println("Primer numero:" + n1);
			System.out.println("Segundo numero:" + n2);
			System.out.println("La resta de: " + n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case 3:
			System.out.println("Primer numero:" + n1);
			System.out.println("Segundo numero:" + n2);
			System.out.println("La multiplicacion de: " + n1 + " x " + n2 + " = " + (n1 * n2));
			break;
		case 4:
			if (n2 == 0) {
				System.out.println("No puedes dividir entre 0.");
			} else {
				System.out.println("Primer numero:" + n1);
				System.out.println("Segundo numero:" + n2);
				System.out.println("La division de: " + n1 + " / " + n2 + " = " + (n1 / n2));
				System.out.println("El resto de: " + n1 + " / " + n2 + " = " + (n1 % n2));
			}
			break;
		default:
			System.out.println("No has introducido una opcion valida.");
		}
	}
}
