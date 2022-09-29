package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa001 {
	
	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner ler =  new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		int n = ler.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++){
			System.out.print("Digite um n�mero: ");
			vect[i] = ler.nextInt();
		}
		
		System.out.print("N�MEROS NEGATIVOS:");
		System.out.println();
		for (int i=0; i<n; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		ler.close();
		
	}

}
