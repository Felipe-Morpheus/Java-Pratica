package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {
	
	public static void main(String[] args) {
		
		String []linhas = new String [] {"Bom dia", "Boa tarde", "Boa noite"};
		
		String path = "c:\\temp\\out.txt";
		
		//Pra não sobreescrever o arquivo coloque a palavra true, apos a variavel path (path, true)
		try (BufferedWriter bw = new BufferedWriter( new FileWriter(path, true))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
