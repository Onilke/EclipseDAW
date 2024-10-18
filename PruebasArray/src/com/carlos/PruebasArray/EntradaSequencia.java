package com.carlos.PruebasArray;

import java.util.Scanner;

//Programa que llegeix una seqüència de valors reals, de longitud coneguda.
public class EntradaSequencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int index = 0;
		float nota = 0.0f;
		float[] arrayNotes;
		int nombreValors = 0;
		boolean entradaValida = false;
		
		// Llegeix la longitud de la seqüència. Comprova tots els errors.		
		while (!entradaValida) {
			System.out.println("Quantes notes vols introduir? ");
			if (entrada.hasNextInt()) {
				//obtenim el valor
				nombreValors = entrada.nextInt();
				// Si s'han entrat més valors, s'ignoren. Només se'n necessita un.
				entrada.nextLine();
				if(nombreValors>0) {
					entradaValida = true;
				} else {					
					System.out.println("El valor introduït no és positiu");
				}
			} else {
				while(entrada.nextLine().equals("")) {}
				// Si no és enter, es llegeix i s'ignora.
				System.out.println("Valor introduït incorrecte. ");
			}
		}		
		//entrada.nextLine();
		System.out.println("Es llegiran " + nombreValors + " valors reals.");
		System.out.println("En pots escriure diversos en una sola línia, separats per espais.");
		// Els guardarem en un array. Ja en coneixem la mida.
		arrayNotes = new float[nombreValors];
		// Cal llegir tants reals com la mida de l'array.
		// Estructura de repetició amb comptador.
		while (index < arrayNotes.length) {
			if (entrada.hasNextFloat()) {
				// S'ha llegit una nota, però és vàlida (entre 0 i 10)?
				nota = entrada.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {
					arrayNotes[index] = nota; //assignem la nota a una posició de l'array
					index++;
				} else {
					System.out.println("Valor de nota incorrecte. Ha d'estar entre 0 i 10. ");
				}
				// Si no és vàlida, la ignorem. No s'assigna a cap posició.
			} else {
				// Si no era un real, simplement llegim el valor com una cadena de text
				// però no en fem res. Es perd.
				System.out.println("Valor introduït incorrecte. ");
				entrada.next();
			}
		}
		// Ignorem els valors sobrants de l'última línia.
		entrada.nextLine();
		System.out.println("La seqüència llegida és:");
		for (int i = 0; i < arrayNotes.length; i++) {
			System.out.println(arrayNotes[i]);
		}
		//tanquem l'Scanner
		entrada.close();
	}
}