package Aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		File arquivo = new File("C:\\temp\\in.txt");
		Scanner ler = null;
		
		try {
			ler = new Scanner(arquivo);

			while (ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Erro ao abrir arquivo: " + e.getMessage());
		} 
		
		//Independente da exceção ter ocorrido ou não, ele vai finalizar os blocos de comando. 
		finally {
			if (ler != null) {
				ler.close();

			}
			System.out.println("Bloco finnaly executado");
		}

	}

}
