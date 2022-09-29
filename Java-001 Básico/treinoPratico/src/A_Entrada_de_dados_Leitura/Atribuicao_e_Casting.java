package A_Entrada_de_dados_Leitura;

public class Atribuicao_e_Casting {
	
	public static void main(String[] args) {
		
		/*O valor da variável pode ser definido separadamente ou 
		  na mesma linha de descrição do tipo de variável*/
		int x, y;
		
		x = 5;
		y = 2 * x; // Somando a variável y com a x
		
		System.out.println(x);
		System.out.println(y);
		///////////////////////////////////////////
		
		/*O valor da variável pode ser definido 
		  na mesma linha de descrição do tipo de variável
		  ou separadamente*/
		int o = 5;
		double u = 2 * x;
		
		System.out.println(o);
		System.out.println(u);
		///////////////////////////////////////////
		
		/*
		// Valores de variável definidos separademente 
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
		
		
		// Valores de variável definidos separademente
		
		/*
		 Para truncar a soma de variáveis diferentes como int e double
		 existe o casting que consiste em aplicar o tipo de variável 
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
		 Usamos o casting/trunc também para obrigar cálculos ainda que o compilador
		 entenda que será perdido algum dado como o exemplo abaixo (int)
		 */
		double f = 5.0;
		int g  = (int) f;
	}

}
