package B_Condicionais;

import java.util.Scanner;

public class estrutura_condicional_if_else {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas? ");
		hora = ler.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			if (hora < 18) {
				System.out.println("Boa tarde");
			} else {
				System.out.println("Boa noite");

			}

		}

		ler.close();
	}

}
