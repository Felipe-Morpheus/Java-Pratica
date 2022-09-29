package B_Condicionais;

import java.util.Scanner;

public class While_Contando {
		
		/*                 Problema:
		Fazer um programa que l� n�meros inteiros at� que um 0 seja lido. 
		Ao final mostra a soma dos n�meros lidos.*/
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		int soma = 0;
		
		while(x != 0 ) {
			soma = soma + x; // ou soma += x;
			x = ler.nextInt();
		}
		
		System.out.println("O valor da soma dos n�meros digitados �: " + soma);
		ler.close();
	}

}
