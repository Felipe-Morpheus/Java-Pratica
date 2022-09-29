package B_Condicionais;

import java.util.Scanner;

public class diasSemana_switch_case {
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

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + dia);
		ler.close();
	}

}
