package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Programa000 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[10];

		System.out.print("Quantos serão alugados? ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");

			System.out.print("Nome: ");
			ler.nextLine();
			String nome = ler.nextLine();

			System.out.print("Email: ");
			String email = ler.next();

			System.out.print("Quarto: ");
			int numeroQuarto = ler.nextInt();

			Aluguel aluguel = new Aluguel(nome, email);

			vect[numeroQuarto] = aluguel;
		}
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);

			}

		}

		/*
		 * Aluguel a = new Aluguel("Maria", "maria@gmail.com");
		 * 
		 * System.out.println(a);
		 */

		ler.close();
	}

}
