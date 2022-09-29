package B_Condicionais;

import java.util.Scanner;

public class diasSemana_if_else {


	/*
	 * Problema: Fazer um programa para ler um valo inteiro de 1 a 7
	 * representando um dia da semana (sendo1= domingp, 2=segunda, e assim por
	 * diante). Escrever na tela o dia da semana correspondente.
	 */
	public static void main(String[] args) {

			System.out.println("Digite um número de 1 à 7");
			Scanner ler = new Scanner(System.in);
			
			int x = ler.nextInt();
			String dia;

			if (x == 1) {
				dia = "domingo";
			} else if (x == 2) {
				dia = "segunda";
			} else if (x == 3) {
				dia = "terça";
			} else if (x == 4) {
				dia = "quarta";
			} else if (x == 5) {
				dia = "quinta";
			} else if (x == 6) {
				dia = "sexta";
			} else if (x == 7) {
				dia = "sábado";
			} else {
				dia = "valor inválido";
			}

			System.out.println("Dia da semana: " + dia);
			ler.close();
		}

}


