package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Figura;
import entities.Retangulo;
import entities.enums.Cor;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		List<Figura> list = new ArrayList<>();

		System.out.print("Entre com números de figuras: ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Figura #" + i + " dados:");

			System.out.print("Retangulo ou circulo? (r/c)");
			char ch = ler.next().charAt(0);

			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(ler.next());

			if (ch == 'r') {
				System.out.print("Largura: ");
				double largura = ler.nextDouble();

				System.out.print("Altura: ");
				double altura = ler.nextDouble();
				list.add(new Retangulo(cor, largura, altura));
			} else {
				System.out.print("Raio: ");
				double raio = ler.nextDouble();
				list.add(new Circulo(cor, raio));
			}
		}

		System.out.println();
		System.out.println("ÁREAS DAS FIGURAS: ");

		for (Figura figura : list) {
			System.out.println(String.format("%.2f", figura.area()));
		}

		ler.close();
	}

}
