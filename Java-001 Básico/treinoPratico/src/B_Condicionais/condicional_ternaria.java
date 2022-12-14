package B_Condicionais;

import java.util.Scanner;

public class condicional_ternaria {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Leitura da condicional ternária: ((Caso preco seja menor que vinte, preco * 0.1 senao, preco * 0.05))
		 double preco = 34.5;
		 double desconto = (preco < 20.0) ? preco *0.1 : preco * 0.05;
		
		 
		 
		 //Leitura condicional if else
		/*
		double preco = 34.5;
		double desconto;

		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}
		*/
		System.out.println(desconto);
		
		ler.close();

	}

}
