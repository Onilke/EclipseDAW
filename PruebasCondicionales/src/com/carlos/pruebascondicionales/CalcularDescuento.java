package com.carlos.pruebascondicionales;

import java.util.Scanner;

public class CalcularDescuento {
	// constantes
	public static final float PRECIO_LIMITE = 200f; // precio limite del descuento
	public static final float DESCUENTO = 0.08f; // porcentaje de descuento

	// programa principal
	public static void main(String[] args) {
		// declarar y iniciar variables
		Scanner entrada = new Scanner(System.in);
		float precioUsuario = 0.0f;
		float descuentoPrecio = 0.0f;
		float precioFinal = 0.0f;
		System.out.println("Dame el precio del producto (descuento a partir de 200€):");
		// comprobamos si el usuario nos a dado un valor correcto en este caso FLOAT
		if (entrada.hasNextFloat()) {
			// obtenemos el valor introducido por el teclado
			precioUsuario = entrada.nextFloat();
			// mostramos el precio inicial
			System.out.println("Tu precio es de: " + precioUsuario + "€");
			// comprobamos si el precio es mayor que el limite
			if (precioUsuario >= 0) {
				if (precioUsuario > PRECIO_LIMITE) {
					descuentoPrecio = DESCUENTO * precioUsuario;
					// muestro el descuento
					System.out.println(
							"Se aplicara un descuento de: " + descuentoPrecio + "€ (" + (DESCUENTO * 100) + ")%");
					// calculo el precio final
					precioFinal = precioUsuario - descuentoPrecio;
					System.out.println("Precio final: " + precioFinal + "€");

				}
				if (precioUsuario < PRECIO_LIMITE) {
					System.out.println("No se te aplicara el descuento.");
					System.out.println("Te faltan " + (PRECIO_LIMITE - precioUsuario) + "€ para aplicar el descuento.");

				}
			} else {
				System.out.println("el precio no puede ser negativo");
			}
		} else {
			System.out.println("el valor introducido no es un numero");
		}
	}

}
