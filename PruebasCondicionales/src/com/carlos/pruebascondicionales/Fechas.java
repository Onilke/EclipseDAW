package com.carlos.pruebascondicionales;

import java.util.Scanner;

public class Fechas {

	public static final int DIA_SEMANA_MINIMO = 1;
	public static final int DIA_SEMANA_MAXIMO = 7;
	public static final int DIA_MES_MINIMO = 1;
	public static final int DIA_MES_MAXIMO = 31;
	public static final int MES_MINIMO = 1;
	public static final int MES_MAXIMO = 12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaDia = new Scanner(System.in);
		Scanner entradaDiaMes = new Scanner(System.in);
		Scanner entradaDiaAno = new Scanner(System.in);
		int diaSemana = 0;
		int diaMes = 0;
		int diaMesAno = 0;
		boolean diaSemanaConprovar = false;
		boolean diaMesConprovar = false;
		boolean MesAnoConprovar = false;
		String cadena = "";
		System.out.println("Dime el dia de la semana en numero (1-7): ");
		if (entradaDia.hasNextFloat()) {
			// obtenemos el valor introducido por el teclado
			diaSemana = entradaDia.nextInt();
			entradaDia.nextLine();
			// mostramos el numero introducido
			if (diaSemana >= DIA_SEMANA_MINIMO && diaSemana <= DIA_SEMANA_MAXIMO) {
				System.out.println("dia de la semana introducido " + diaSemana);

				if (diaSemana == 1) {
					System.out.println("Lunes");
					diaSemanaConprovar = true;
					cadena = "Lunes, ";
				} else if (diaSemana == 2) {
					System.out.println("Martes");
					diaSemanaConprovar = true;
					cadena = "Martes, ";
				} else if (diaSemana == 3) {
					System.out.println("Miercoles");
					diaSemanaConprovar = true;
					cadena = "Miercoles, ";
				} else if (diaSemana == 4) {
					System.out.println("Jueves");
					diaSemanaConprovar = true;
					cadena = "Jueves, ";
				} else if (diaSemana == 5) {
					System.out.println("Viernes");
					diaSemanaConprovar = true;
					cadena = "Viernes, ";
				} else if (diaSemana == 6) {
					System.out.println("Sabado");
					diaSemanaConprovar = true;
					cadena = "Sabado, ";
				} else if (diaSemana == 7) {
					System.out.println("Domingo");
					diaSemanaConprovar = true;
					cadena = "Domingo, ";
				}

			} else {
				System.out.println("Valor invalido");
			}
		}
		System.out.println("Dime el dia del mes en numero (1-31): ");
		if (entradaDiaMes.hasNextFloat()) {
			// obtenemos el valor introducido por el teclado
			diaMes = entradaDiaMes.nextInt();
			entradaDiaMes.nextLine();
			// mostramos el numero introducido
			if (diaMes >= DIA_MES_MINIMO && diaMes <= DIA_MES_MAXIMO) {
				System.out.println("dia del mes introducido " + diaMes);
				diaMesConprovar = true;
				cadena += diaMes;
			} else {
				System.out.println("Valor invalido");
			}
		}
		System.out.println("Dime el numero del mes (1-12): ");
		if (entradaDiaAno.hasNextFloat()) {
			// obtenemos el valor introducido por el teclado
			diaMesAno = entradaDiaAno.nextInt();
			entradaDiaAno.nextLine();
			// mostramos el numero introducido
			if (diaMesAno >= MES_MINIMO && diaMesAno <= MES_MAXIMO) {
				System.out.println("mes introducido " + diaMesAno);
				MesAnoConprovar = true;
				if (diaMesAno == 1) {
					System.out.println("Enero");
					MesAnoConprovar = true;
					cadena += " de Enero";
				}
				if (diaMesAno == 2) {
					System.out.println("Febrero");
					MesAnoConprovar = true;
					cadena += " de Febrero";
					if (diaMes >= 30) {
						System.out.println("Febrero no puede tener mas de 29 dias");
						MesAnoConprovar = false;
					}
				}
				if (diaMesAno == 3) {
					System.out.println("Marzo");
					MesAnoConprovar = true;
					cadena += " de Marzo";
				}
				if (diaMesAno == 4) {
					System.out.println("Abril");
					MesAnoConprovar = true;
					cadena += " de Abril";
				}
				if (diaMesAno == 5) {
					System.out.println("Mayo");
					MesAnoConprovar = true;
					cadena += " de Mayo";
				}
				if (diaMesAno == 6) {
					System.out.println("Junio");
					MesAnoConprovar = true;
					cadena += " de Junio";
				}
				if (diaMesAno == 7) {
					System.out.println("Julio");
					MesAnoConprovar = true;
					cadena += " de Julio";
				}
				if (diaMesAno == 8) {
					System.out.println("Agosto");
					MesAnoConprovar = true;
					cadena += " de Agosto";
				}
				if (diaMesAno == 9) {
					System.out.println("Septiembre");
					MesAnoConprovar = true;
					cadena += " de Septiembre";
				}
				if (diaMesAno == 10) {
					System.out.println("Octubre");
					MesAnoConprovar = true;
					cadena += " de Octubre";
				}
				if (diaMesAno == 11) {
					System.out.println("Noviembre");
					MesAnoConprovar = true;
					cadena += " de Noviembre";
				}
				if (diaMesAno == 12) {
					System.out.println("Diciembre");
					MesAnoConprovar = true;
					cadena += " de Diciembre";
				}

			} else {
				System.out.println("Valor invalido");
			}
			System.out.println(cadena);

		}
	}
}
