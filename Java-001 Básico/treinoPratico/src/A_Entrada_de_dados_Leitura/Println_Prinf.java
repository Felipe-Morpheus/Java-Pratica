package A_Entrada_de_dados_Leitura;

import java.util.Locale;

public class Println_Prinf {

	public static void main(String[] args) {

		
		int y = 32;
		double x = 10.35784;
		
		//Imprimindo uma string dentro de �spas duplas
		System.out.println("Bom dia!");
		
		//imprimindo vari�vel inteira
		System.out.println(y);
		
		//imprimindo vari�vel decimal
		System.out.println(x);
		
	
		
		//Concatenar usando o println 
		System.out.println("RESULTADO = " + x + " METROS");
		
		//Trocar a localiza��o de configura��o do computador.
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		
		
		//imprimindo vari�vel decimal delimitando o n�mero de casas ap�s a v�rgula e pulando linha.
		//OBS. a letra "f" significa formatado e a letra "n" significa quebra de linha.
		//Coloque a formata��o dentro de aspas duplas e separe-a da vari�vel com v�rgula.
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		
		
		//Concatenar usando printf
		// O valor da vari�vel entra dentro do %.2f que define a "formata��o" da vari�vel "f"
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		/*
		 * Marcadores de vari�veis com "formata��o printf"
		 *  %f = vari�vel de ponto flutuante/decimal
		 *  %d = vari�vel tipo inteiro
		 *  %s = vari�vel String/texto
		 *  %n = quebra de linha
		 */
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		

	}
}
