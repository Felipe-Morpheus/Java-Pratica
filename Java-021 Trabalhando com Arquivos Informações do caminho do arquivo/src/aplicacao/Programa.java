package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o caminho-path de um arquivo-file: ");
		String strPath = ler.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("Só o nome do arquivo: " + path.getName());
		System.out.println();
		
		System.out.println("Só o caminho do arquivo: " + path.getParent());
		System.out.println();

		System.out.println("O nome e caminho completos: " + path.getPath());
		System.out.println();
		
		ler.close();
	}

}
