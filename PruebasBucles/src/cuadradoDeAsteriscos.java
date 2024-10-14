import java.util.Scanner;

public class cuadradoDeAsteriscos {

	public static void main(String[] args) {

		boolean entradaValida = false;
		int valorUsuario1 = 0;
		Scanner lector = new Scanner(System.in);

		do {
			System.out.println("Dime cuantos cuadrados quieres:");

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

		System.out.println("cuadrados: " + valorUsuario1);
		for (int k = 2; k <= valorUsuario1; k++) {
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
