package application;

import java.util.Locale;
import java.util.Scanner;

import util_exercicio.CurrencyConverter;

public class Program8 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quanto está valendo o dólar? ");
				double real = ler.nextDouble();
		System.out.print("Quanto dólar você vai converter? ");
				double dolar = ler.nextDouble();
				
				
				//Chamando classe para aplicar seus métodos-operacções-funções
				double convert = CurrencyConverter.convert(dolar, real);
		System.out.printf("A quantia para ser paga em reais, * IOF são = %.2f%n ", convert);
			
		 
		 
		 
		 ler.close();
		
		
		
		
	}

}
