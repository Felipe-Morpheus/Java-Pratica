package D_Funcoes_String;

public class Split {
	
	public static void main(String[] args) {
		
		/*
		 * Função que serve para recortar uma variável String,  que podem ser separadas por espaço em branco " "
		 * ou qualquer separador que você informar na condição do método. 
		 * Jogando/guardando essas partes em outras variáveis agora separadas em vetores que devem ser definidos
		 * em seguida.
		 */
		
		String s = "potato apple lemon orange";
		
		String [] vect = s.split(" ");
		
		System.out.println(vect [0]);
		System.out.println(vect [1]);
		System.out.println(vect [2]);
		System.out.println(vect [3]);
		
		
		
	}

}
