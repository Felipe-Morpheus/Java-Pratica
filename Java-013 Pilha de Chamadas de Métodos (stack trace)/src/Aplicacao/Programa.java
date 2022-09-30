package Aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		//Chamando o método1
		  metodo1();
		
		System.out.println("Fim do programa");

	}
	//metodo1
	public static void metodo1() {
		
	System.out.println("***MÉTODO1 INÍCIO***");
	
	//Chamando o metodo2
	  metodo2();
	
	System.out.println("***MÉTODO1 FIM***");

	}

	
	
	//método2
	public static void metodo2() {
		System.out.println("***MÉTODO2 INÍCIO***");
		Scanner ler = new Scanner(System.in);
		
		// Try usado para blocos de códigos que podem gerar exceção
		try {
			System.out.print("Entre com primeiros nomes diferentes: ");
			
			// Vetor de Strings com split espaçado
			String[] vect = ler.nextLine().split(" ");

			System.out.print("Digite o número referente a posição que deseja ver: ");
			
			// Lendo Posição
			int posicao = ler.nextInt();

			System.out.println(vect[posicao]);
		}
		// Catch declara a exceção em seu parametros, apelidando-a.
		// Para o caso dessa exceção ser capturada ele irá executar o bloco dentro do
		// catch ao invés de dar exceção
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida");
			//printtackTrace Rastreia e mostra toda a chamada de métodos que acarretou a exceção
			e.printStackTrace();
			ler.next();
			
		} 
		catch (InputMismatchException e) {
			System.out.println("Erro de entrada");
			
		}
		ler.close();
		System.out.println("***MÉTODO2 FIM***");

	}
}
