package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Cria-se um objeto do tipo file/arquivo, e instancie ele colocando dentro do parametro
		// o caminho do arquivo desejado.
		// Ele irá encapsular o processo de acesso ao arquivo
		File file = new File("c:\\temp\\in.txt");
		Scanner ler = null;
		try {
			ler = new Scanner(file);
			while (ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if (ler != null) {
				ler.close();
			}

		}

	}
}
