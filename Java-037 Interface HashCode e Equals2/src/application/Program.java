package application;

public class Program {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";
		
		// Método "equals" que compara se o ojeto é igual a outro, retornando true ou false
		System.out.println(a.equals(b));
		
		//Método "hashCode" que retorna um número inteiro representando um código
		//gerado a partir das informações do objeto
		System.out.println("String a: " + a.hashCode());
		System.out.println("String b: " + b.hashCode());

	}

}
