package D_Funcoes_String;

public class Split {
	
	public static void main(String[] args) {
		
		/*
		 * Fun��o que serve para recortar uma vari�vel String,  que podem ser separadas por espa�o em branco " "
		 * ou qualquer separador que voc� informar na condi��o do m�todo. 
		 * Jogando/guardando essas partes em outras vari�veis agora separadas em vetores que devem ser definidos
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
