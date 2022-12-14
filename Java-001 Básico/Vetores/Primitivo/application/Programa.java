package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		// Crie uma variável inteira, ela por sua vez servirá como valor limite dentro do vetor instanciado
		System.out.print("Digite o a quantidade de alturas que irá colocar no vetor e aperte enter: ");
		System.out.println();
		int n = ler.nextInt();
		
		/*Defina o tipo da variável do vetor, declare em seguida com colchotes[] e coloque o nome do vetor
		 instancie o vetor e declare o valor limite dentro do colchetes, que no caso será o objeto da variável int 'n'
		 por fim, dentro de um laço condicional for aplica a lógica.*/
		System.out.println("Digite as alturas e aperte enter: ");
		double[] vect = new double[n];
		
		for (int i =0; i<n; i++) {
			vect[i] = ler.nextDouble();
		}
		
		// Calculando média
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		double media = soma /n;
		
		System.out.printf("ALTURA MÉDIA: %.2f%n " , media);
		
		ler.close();
	}

}
