package application;

import java.util.Locale;
import java.util.Scanner;

public class Programa0003 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com tamanho da matriz: ");
		int n = ler.nextInt();
		int[][] mat = new int[n][n];

		
		// Pode ser trocado a quantidade de linhas "n" da variável "int n" por "mat.lenght" 
		for (int i = 0; i < n; i++) {
			//O mesmo vale pra quantidade de colunas na matriz trocando colunas "n" da variável "int n" por "mat[i].lenght"
			for (int j = 0; j < n; j++) {
				System.out.println();
				mat[i][j] = ler.nextInt();
			}
		}
		
		System.out.print("Diagonal Principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
			}
		
			System.out.println();
		int contador = 0;
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<n; j++) {
				if(mat[i][j] <0) {
					contador ++;
				}
			}
		}
		
		System.out.println("Números Negativos = " + contador);
		ler.close();
	}
}