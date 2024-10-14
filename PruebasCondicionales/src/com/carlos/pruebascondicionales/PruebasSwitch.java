package com.carlos.pruebascondicionales;

public class PruebasSwitch {

	public static void main(String[] args) {

		/*int numero = 2;

		switch (numero) {
		case 1:
			System.out.println("El valor es 1");
			break;
		case 3:
			System.out.println("El valor es 3");
			break;
		case 5:
			System.out.println("El valor es 5");
			break;
		default:
			System.out.println("No hay valor");
			break;
		}*/

		/*String cadena = "adios";
		switch (cadena) {
		case "adios":
			System.out.println("manzana");
			break;
		case "como va":
			System.out.println("melocoton");
			break;
		case "hola":
			System.out.println("pera");
			break;
		default:
			System.out.println("Nada");
			break;
		}*/

		char caracter = 'b';
		switch (caracter) {
		case 'a':
		case 'b':
			System.out.println("manzana");
			break;
		case 'c':
		case 'd':
			System.out.println("melocoton");
			break;
		case 'e':
			System.out.println("pera");
			break;
		default:
			System.out.println("Nada");
			break;
		}
	}

}
