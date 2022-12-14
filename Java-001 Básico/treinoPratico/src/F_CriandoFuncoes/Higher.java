package F_CriandoFuncoes;

import java.util.Scanner;

public class Higher {

	public static void main(String[] args) {
		/* IMPORTANTE
		 * Todo programa executável precisa ter a função main
		 */

		Scanner ler = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		/*
		 * Chamando a função para compilar os valores da variável higher
		 * A Função ->max-< será criada logo abaixo, após o fechamento de chaves {...} da função main
		 */
		int higher = max(a, b, c);

		
		/*
		 A função ->showResult<- será responsável por imprimir o return.  
		 Ou seja, retornar no console o valor do resultado correspondente aos operadores lógicos
		 da função condicional ->max<-.
		 Deverá ser feita logo abaixo da dela. 
		 */
		showResult(higher);

		ler.close();
		
	}
	
	

		/* IMPORTANTE
		        Criando a função ->max<- que encontrará maior valor entrado.
		   Sintaxe:
		   A função deverá ser do tipo ->public static<- , sendo anexada a um tipo de variável, no caso ->int<- 
		   Junto ao nome da função, ->max<- 
		   E com os parametros definido em parenteses. Igualmente com o seu tipo de variável e seus respectivos
		   nomes/apelidos. 
		   Após isso abra as chaves {...}.
		 */
	public static int max(int x, int y, int z) {
		
		/* IMPORTANTE
   	  	 Dentro da função ou seja entre as chaves {....}
		 você deverá iniciar a operação lógica para utilizar cada uma das variáveis criadas no parametro da função.
	     Aplicando uma ->regra condicional<- que permita encontrar e retornar o valor máximo que a aspirante função propõe  
		
		
		 Obs. O nome ->aux<-, poderia ser ->max<-, facilitando as conexões semanticas com o nome da função, mas foi mantido ->aux<-
		 apenas para mostrar a disponibilidade na escolha dum nome mais adequado, se for preciso. */
		
		
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z){
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	/*
	  Criando função de ->showResult<-
      Para poder utilizar a recente função ->max<- e comandos lógicos condicionais nela contidos
	  Será necessário utilizar a mesma sintaxe com um componente a mais o ->void<-.
	  -> public static void<-  e o seu nome ->showResult<- e parametros dentro dos parenteses.
	  
	  Usando o println para imprir quando for chamado
	  
	 	  
	  Obs.O nome ->value<-, poderia ser ->higher<-, facilitando as conexões semanticas 
	  com a variável ->>higher<- dentro do parâmetro da função >showResult<-, mas foi mantido ->value<-
	 apenas para mostrar a disponibilidade na escolha dum nome mais adequado, se for preciso. 
	 	   
	
	 */
	public static void showResult (int value){
		System.out.println("Higher = " + value);
	}
}
