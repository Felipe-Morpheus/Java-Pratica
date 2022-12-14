package A_Entrada_de_dados_Leitura;

public class Atribuicao_e_Casting {
	
	public static void main(String[] args) {
		
		/*O valor da vari�vel pode ser definido separadamente ou 
		  na mesma linha de descri��o do tipo de vari�vel*/
		int x, y;
		
		x = 5;
		y = 2 * x; // Somando a vari�vel y com a x
		
		System.out.println(x);
		System.out.println(y);
		///////////////////////////////////////////
		
		/*O valor da vari�vel pode ser definido 
		  na mesma linha de descri��o do tipo de vari�vel
		  ou separadamente*/
		int o = 5;
		double u = 2 * x;
		
		System.out.println(o);
		System.out.println(u);
		///////////////////////////////////////////
		
		/*
		// Valores de vari�vel definidos separademente 
		double b, B, h, area;
		
		b    = 6.0;
		B    = 8.0;
		h    = 5.0;
		area = (b + B) / 2.0 *h;
		*/
		
		// Valores definidos juntos
		double b    = 6.0;
		double B    = 8.0;
		double h    = 5.0;
		double area = (b + B) / 2.0 *h;

		System.out.println(area);
		/////////////////////////////////////////
		
		
		// Valores de vari�vel definidos separademente
		
		/*
		 Para truncar a soma de vari�veis diferentes como int e double
		 existe o casting que consiste em aplicar o tipo de vari�vel 
		 antes da formula. Assim o 2.0 trunca para 2.5
		 */
		int s, t;
		double resultado;
		s = 5;
		t = 2;
		
		resultado = (double) s / t;
		
		System.out.println(resultado);
		/////////		//////////////
		
		/*
		 Usamos o casting/trunc tamb�m para obrigar c�lculos ainda que o compilador
		 entenda que ser� perdido algum dado como o exemplo abaixo (int)
		 */
		double f = 5.0;
		int g  = (int) f;
	}

}
