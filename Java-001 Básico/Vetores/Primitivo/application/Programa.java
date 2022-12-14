package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		// Crie uma vari�vel inteira, ela por sua vez servir� como valor limite dentro do vetor instanciado
		System.out.print("Digite o a quantidade de alturas que ir� colocar no vetor e aperte enter: ");
		System.out.println();
		int n = ler.nextInt();
		
		/*Defina o tipo da vari�vel do vetor, declare em seguida com colchotes[] e coloque o nome do vetor
		 instancie o vetor e declare o valor limite dentro do colchetes, que no caso ser� o objeto da vari�vel int 'n'
		 por fim, dentro de um la�o condicional for aplica a l�gica.*/
		System.out.println("Digite as alturas e aperte enter: ");
		double[] vect = new double[n];
		
		for (int i =0; i<n; i++) {
			vect[i] = ler.nextDouble();
		}
		
		// Calculando m�dia
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		double media = soma /n;
		
		System.out.printf("ALTURA M�DIA: %.2f%n " , media);
		
		ler.close();
	}

}
