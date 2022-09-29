package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = ler.nextInt();
		
		String[]nomes = new String[n];
		int[]idades = new int [n];
		double[]alturas = new double[n];
		
		for (int i=0; i<n; i++){
			System.out.println("Dados da "+ (i+1) +" a pessoa: ");
			
			System.out.print("Nome: ");
			ler.nextLine();
			nomes[i] = ler.nextLine();
			
			System.out.print("Idade: ");
			
			idades[i] = ler.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = ler.nextDouble();
			
		}
		double soma = 0.0;
		for (int i=0; i<n; i++){
			soma = soma + alturas[i];
		}
		double mediaAltura = soma / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		int cont = 0;
		for (int i=0; i<n; i++){
			 if (idades[i]< 16) {
				 cont = cont + 1;
			 }
		}
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoa com menos de 16 anos : %.1f%% %n", percent);
		
		for (int i =0; i<n; i++) {
			if (idades[i]<16) {
				System.out.println(nomes[i]);
			}
		}
		
		
		ler.close();
	}

}
