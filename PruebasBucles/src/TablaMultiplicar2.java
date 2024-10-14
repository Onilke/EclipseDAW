import java.util.Scanner;

public class TablaMultiplicar2 {

    public static void main(String[] args) {

        boolean entradaValida = false;
        int valorUsuario = 0;
        Scanner lector = new Scanner(System.in);

        do {
            System.out.println("Dame un valor máximo (número entero no negativo):");

            if (lector.hasNextInt()) {
                valorUsuario = lector.nextInt();

                if (valorUsuario >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("El valor no puede ser negativo. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Debes ingresar un número entero.");
                lector.next();
            }

        } while (!entradaValida);

        System.out.println("Valor máximo de: " + valorUsuario);

        System.out.print("Potencias de 2 hasta el valor máximo: ");
        for (int i = 2; i <= valorUsuario; i *= 2) {
            System.out.print(i + " ");
        }
    }
}

