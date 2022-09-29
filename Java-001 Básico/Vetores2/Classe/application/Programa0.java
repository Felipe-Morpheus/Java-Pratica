package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa0 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int n = ler.nextInt();
		Produto[] vect = new Produto[n];

		// Ao invés de usar a variável que define o valor do vetor 'n' pode-se
		// usar a operação
		// vect.lenght. que por si só reconhece o valor do vetor
		for (int i = 0; i < vect.length; i++) {
			ler.nextLine();
			String nome = ler.nextLine();
			double preco = ler.nextDouble();
			vect[i] = new Produto(nome, preco); // Instanciando elementos da classe
		}

		double soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;

		System.out.printf("PREÇO MÉDIO: %.2f%n ", media);

		ler.close();
	}

}
