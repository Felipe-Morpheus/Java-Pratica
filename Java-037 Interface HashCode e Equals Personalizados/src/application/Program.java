package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		
		//Gerando hashCode(imprime no console) de acordo com cada usuario
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		//Comparando  CONTEÚDO de objetos 
		System.out.println(c1.equals(c2));
		
		// O == (igual, igual) compara a POSIÇÃO DA MEMÓRIA dos objetos
		System.out.println(c1 == c2);
		
		
		// O compilador trata de uma forma especial valores literais e por isso dá true. 
		System.out.println(s1 == s2);


	}

}
