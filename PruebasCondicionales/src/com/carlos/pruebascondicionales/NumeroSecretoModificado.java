package com.carlos.pruebascondicionales;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecretoModificado {
	// constantes
	public static final int NUMERO_SECRETO = new Random().nextInt(0, 11); // Numero secreto
	public static final int NUMERO_SECRETO2 = new Random().nextInt(0, 11); // Numero secreto

	// programa principal
	public static void main(String[] args) {
		// declarar y iniciar variables
		Scanner entrada = new Scanner(System.in);
		int numeroUsuario = 0;
		System.out.println("Dime un numero entre el 0 y el 10: ");
		// System.out.println(NUMERO_SECRETO);
		// System.out.println(NUMERO_SECRETO2);
		// comprobamos si el usuario nos a dado un valor correcto en este caso INT
		if (entrada.hasNextInt()) {
			// obtenemos el valor introducido por el teclado
			numeroUsuario = entrada.nextInt();
			// mostramos el numero introducido
			System.out.println("Tu numero es: " + numeroUsuario);
			// comprobamos si el numero introducido es igual al numero secreto
			if ((numeroUsuario == NUMERO_SECRETO) || (numeroUsuario == NUMERO_SECRETO2)) {
				System.out.println(
						"Felicidades! has acertado los numeros eran el " + NUMERO_SECRETO + " y el " + NUMERO_SECRETO2);

			} else {
				System.out.println("Es incorrecto intentalo de nuevo, los numeros eran el " + NUMERO_SECRETO + " y el "
						+ NUMERO_SECRETO2);
			}
		}
		// si no cumple las condiciones anteriores muestra el mensaje
		else {
			System.out.println("Entrada no valida");
		}
	}
}
