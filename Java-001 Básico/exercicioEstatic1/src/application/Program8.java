package application;

import java.util.Locale;
import java.util.Scanner;

import util_exercicio.CurrencyConverter;

public class Program8 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Quanto est� valendo o d�lar? ");
				double real = ler.nextDouble();
		System.out.print("Quanto d�lar voc� vai converter? ");
				double dolar = ler.nextDouble();
				
				
				//Chamando classe para aplicar seus m�todos-operac��es-fun��es
				double convert = CurrencyConverter.convert(dolar, real);
		System.out.printf("A quantia para ser paga em reais, * IOF s�o = %.2f%n ", convert);
			
		 
		 
		 
		 ler.close();
		
		
		
		
	}

}
