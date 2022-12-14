package A_Entrada_de_dados_Leitura;

import java.util.Scanner;

public class Entrada_de_dados_leitura_Scanner_next2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		// nextLine = ler a linha inteira
		x = ler.nextInt();
		ler.nextLine(); // Quando usar NextLine e outro next é preciso usar um next a mais para consumir a pendencia (bug)
		s1 = ler.nextLine();
		s2 = ler.nextLine();
		s3 = ler.nextLine();
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		ler.close();
	}
}
