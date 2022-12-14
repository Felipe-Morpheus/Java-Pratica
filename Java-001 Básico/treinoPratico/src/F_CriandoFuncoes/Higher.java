package F_CriandoFuncoes;

import java.util.Scanner;

public class Higher {

	public static void main(String[] args) {
		/* IMPORTANTE
		 * Todo programa execut�vel precisa ter a fun��o main
		 */

		Scanner ler = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		/*
		 * Chamando a fun��o para compilar os valores da vari�vel higher
		 * A Fun��o ->max-< ser� criada logo abaixo, ap�s o fechamento de chaves {...} da fun��o main
		 */
		int higher = max(a, b, c);

		
		/*
		 A fun��o ->showResult<- ser� respons�vel por imprimir o return.  
		 Ou seja, retornar no console o valor do resultado correspondente aos operadores l�gicos
		 da fun��o condicional ->max<-.
		 Dever� ser feita logo abaixo da dela. 
		 */
		showResult(higher);

		ler.close();
		
	}
	
	

		/* IMPORTANTE
		        Criando a fun��o ->max<- que encontrar� maior valor entrado.
		   Sintaxe:
		   A fun��o dever� ser do tipo ->public static<- , sendo anexada a um tipo de vari�vel, no caso ->int<- 
		   Junto ao nome da fun��o, ->max<- 
		   E com os parametros definido em parenteses. Igualmente com o seu tipo de vari�vel e seus respectivos
		   nomes/apelidos. 
		   Ap�s isso abra as chaves {...}.
		 */
	public static int max(int x, int y, int z) {
		
		/* IMPORTANTE
   	  	 Dentro da fun��o ou seja entre as chaves {....}
		 voc� dever� iniciar a opera��o l�gica para utilizar cada uma das vari�veis criadas no parametro da fun��o.
	     Aplicando uma ->regra condicional<- que permita encontrar e retornar o valor m�ximo que a aspirante fun��o prop�e  
		
		
		 Obs. O nome ->aux<-, poderia ser ->max<-, facilitando as conex�es semanticas com o nome da fun��o, mas foi mantido ->aux<-
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
	  Criando fun��o de ->showResult<-
      Para poder utilizar a recente fun��o ->max<- e comandos l�gicos condicionais nela contidos
	  Ser� necess�rio utilizar a mesma sintaxe com um componente a mais o ->void<-.
	  -> public static void<-  e o seu nome ->showResult<- e parametros dentro dos parenteses.
	  
	  Usando o println para imprir quando for chamado
	  
	 	  
	  Obs.O nome ->value<-, poderia ser ->higher<-, facilitando as conex�es semanticas 
	  com a vari�vel ->>higher<- dentro do par�metro da fun��o >showResult<-, mas foi mantido ->value<-
	 apenas para mostrar a disponibilidade na escolha dum nome mais adequado, se for preciso. 
	 	   
	
	 */
	public static void showResult (int value){
		System.out.println("Higher = " + value);
	}
}
