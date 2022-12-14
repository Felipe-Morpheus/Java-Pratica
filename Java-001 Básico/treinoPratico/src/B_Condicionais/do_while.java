package B_Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {

		/*
		 * Problema: Fazer um programa para ler uma temperatura em Celsius e
		 * mostrar o equivalente em Fahrenheit. Perguntar se o usuário deseja
		 * repetir (s/n). Caso o usuário digita "s", repetir o programa. 9C
		 * Formula: F = –– + 32 5
		 */

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = ler.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

			System.out.print("Deseja repetir (s/n)? ");
			resp = ler.next().charAt(0);
		} while (resp != 'n');
		ler.close();
	}

}
