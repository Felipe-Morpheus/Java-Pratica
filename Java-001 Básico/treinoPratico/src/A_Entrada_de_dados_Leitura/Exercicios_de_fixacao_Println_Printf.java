package A_Entrada_de_dados_Leitura;

import java.util.Locale;

/*     Exercício:
 
       Products:
       Computer, which price is $ 2100,00 
       Office desk, which price is 650,50 
       Record: 30 years old, code = 5290 and gender: F 
       Measure with eight decimal places : 53,234867 
       Round (three decimal places) : 53,235 
       US decimal point 53.235 
*/
/*
 * Marcadores de variáveis com "formatação printf"
 *  %f = variável de ponto flutuante/decimal
 *  %d = variável tipo inteiro
 *  %s = variável String/texto
 *  %n = quebra de linha
 */


public class Exercicios_de_fixacao_Println_Printf {

	public static void main(String[] args) {

		String product1 = "Computer";    // %s
		String product2 = "Office desk"; //%s

		int age = 30;      // %d
		int code = 5290;   // %d
		char gender = 'F'; // %s

		double price1 = 2100.0;     // %f ou %.2f ou %.3f ou mais
		double price2 = 650.50;     // %f ou %.2f ou %.3f ou mais 
		double measure = 53.234867; // %f ou %.2f ou %.3f ou mais
		
		
		System.out.printf(" Products:%n %s, which price is $ %.2f %n %s, which price is %.2f %n Record: %d years old, code = %d and gender: %s %n Measure with eight decimal places : %f %n Round (three decimal places) : %.3f %n", product1, price1, product2, price2, age, code, gender, measure, measure);
		
		
		Locale.setDefault(Locale.US);
		System.out.printf(" US decimal point %.3f ", measure);
	}

}

