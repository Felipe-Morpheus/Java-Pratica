package A_Entrada_de_dados_Leitura;

import java.util.Locale;

public class Println_Prinf {

	public static void main(String[] args) {

		
		int y = 32;
		double x = 10.35784;
		
		//Imprimindo uma string dentro de áspas duplas
		System.out.println("Bom dia!");
		
		//imprimindo variável inteira
		System.out.println(y);
		
		//imprimindo variável decimal
		System.out.println(x);
		
	
		
		//Concatenar usando o println 
		System.out.println("RESULTADO = " + x + " METROS");
		
		//Trocar a localização de configuração do computador.
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		
		
		//imprimindo variável decimal delimitando o número de casas após a vírgula e pulando linha.
		//OBS. a letra "f" significa formatado e a letra "n" significa quebra de linha.
		//Coloque a formatação dentro de aspas duplas e separe-a da variável com vírgula.
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		
		
		//Concatenar usando printf
		// O valor da variável entra dentro do %.2f que define a "formatação" da variável "f"
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		/*
		 * Marcadores de variáveis com "formatação printf"
		 *  %f = variável de ponto flutuante/decimal
		 *  %d = variável tipo inteiro
		 *  %s = variável String/texto
		 *  %n = quebra de linha
		 */
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		

	}
}
