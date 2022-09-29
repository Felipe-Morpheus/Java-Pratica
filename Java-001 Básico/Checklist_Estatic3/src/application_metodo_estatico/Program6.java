package application_metodo_estatico;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class Program6 {
	
	// Membros ->constantes<- e variaveis são diferenciados pela sintaxe ->final<- usado para constante
	//Nome de membros constantes são padronizados com letras maiúsculas e underline entre mais de uma palavra
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		//Não precisará ser mais instanciado, podendo chamar as funções sem utilizar um objeto.
		//Chamando diretamente com o nome da própria classe. No caso >Calculator<
		
		System.out.print("Enter radius: ");
		double radius = ler.nextDouble();
		
		//Chamando diretamente a classe para utilizar seus metodos
		double c = util_static.Calculator.circumference(radius);
		
		double v = util_static.Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n" , c);
		System.out.printf("Volume: %.2f%n" , v);
		System.out.printf("PI value: %.2f%n" , util_static.Calculator.PI);
		
		
		ler.close();
	}
	
}
