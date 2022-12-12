package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com uma pasta: ");
		String strPath = ler.nextLine();

		File path = new File(strPath);

		//PASTA-FOLDER
		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS-PASTAS: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		//ARQUIVO-FILE
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES-ARQUIVOS: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean sucesso = new File(strPath + "\\sub-pasta").mkdir();
		System.out.println("Diretório criado com sucesso: " + sucesso);
		
		ler.close();
	}

}
