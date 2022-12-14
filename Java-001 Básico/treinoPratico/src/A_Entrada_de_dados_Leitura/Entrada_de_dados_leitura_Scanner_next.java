package A_Entrada_de_dados_Leitura;

import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_leitura_Scanner_next {
	
	public static void main(String[] args) {
	
		
		// Para ler vari�veis, usa-se o Scanner.
		// O tipo de vari�vel a ser lida precisa ser definido em next
		
		/*
		 x = ler.next(); = String
		 x = ler.nextInt(); = int
		 x = ler.nextDouble(); = flutuantes, decimais
		 x = ler.nextBoolean();	= verdadeiras ou falsas
		 x = ler.next().charAt(0); = char para ler apenas um caractere 
		 */
		
		//Caso queira trocar vírgula por pontos em separações de valores decimais
		//Locale.setDefault(Locale.US);
		Scanner ler = new Scanner (System.in);
		
		String x ; 
		int y ;
	    double  z;
	    char w;
	    
		x = ler.next();
		y = ler.nextInt();
		z = ler.nextDouble();
		w = ler.next().charAt(0);
		
		System.out.println("Dados digitados: " );
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);


		ler.close();
		
		


	}

}
