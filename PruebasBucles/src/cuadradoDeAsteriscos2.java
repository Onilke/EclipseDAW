import java.util.Scanner;

public class cuadradoDeAsteriscos2 {

	public static void main(String[] args) {

		boolean entradaValida = false;
		boolean entradaValida2 = false;
		int valorUsuario1 = 0;
		int valorUsuario2 = 0;
		Scanner lector = new Scanner(System.in);

		do {
			System.out.println("Dime cuantas lineas quieres:");

			if (lector.hasNextInt()) {
				valorUsuario1 = lector.nextInt();

				if (valorUsuario1 >= 0) {
					entradaValida = true;
				} else {
					System.out.println("El valor no puede ser negativo. Inténtalo de nuevo.");
				}
			} else {
				System.out.println("Entrada no válida. Debes ingresar un número entero.");
				lector.next();
			}

		} while (!entradaValida);
		do {
			System.out.println("Dime cuantas columnas quieres:");

			if (lector.hasNextInt()) {
				valorUsuario2 = lector.nextInt();

				if (valorUsuario2 >= 0) {
					entradaValida2 = true;
				} else {
					System.out.println("El valor no puede ser negativo. Inténtalo de nuevo.");
				}
			} else {
				System.out.println("Entrada no válida. Debes ingresar un número entero.");
				lector.next();
			}

		} while (!entradaValida2);

		System.out.println("Valor máximo de: " + valorUsuario1);

		for (int i = 0; i < valorUsuario1; i++) {
			for (int j = 0; j < valorUsuario2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
