package com.carlos.PruebasTipos;
/*Cntrl+alt+o*/
import java.util.Scanner;

public class PruevaScanner {

	public static void main(String[] args) {
		/*System.out.println("Escriu el teu nom: ");
		Scanner entradanom = new Scanner(System.in);
		String nomAlumnat = entradanom.nextLine();
		System.out.println("El teu nom és: " + nomAlumnat);
		Scanner entradaape = new Scanner(System.in);
		String apeAlumnat = entradaape.nextLine();
		System.out.println("El teu apellit és: " + apeAlumnat);
		System.out.println("El teu nom complet és: " + nomAlumnat +" "+ apeAlumnat);*/
		Scanner lector = new Scanner(System.in);
		System.out.println("Anem a sumar dos nombres enters");
		System.out.print("Escriu un nombre i prem la tecla retorn: ");
		int primerEnter = lector.nextInt();
		lector.nextLine();
		System.out.print("Torna a fer-ho: ");
		int segonEnter = lector.nextInt();
		lector.nextLine();
		int resultat = primerEnter + segonEnter;
		System.out.println("La suma dels dos valors és " + resultat + ".");
	}

}
