package application_metodo_na_classe;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
	
	// Membros ->constantes<- e variaveis s�o diferenciados pela sintaxe ->final<- usado para constante
	//Nome de membros constantes s�o padronizados com letras mai�sculas e underline entre mais de uma palavra
	//A constante e os m�todos-fun��es-opera��es precisam ser estaticos se forem criandas todas dentro do >main< que � estatico
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = ler.nextDouble();
		
		double c = circumference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n" , c);
		System.out.printf("Volume: %.2f%n" , v);
		System.out.printf("PI value: %.2f%n" , PI);
		
		
		ler.close();
	}
	// Fun��o. Opera��o . M�todo
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
			
	}
	// Fun��o. Opera��o . M�todo
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
			
	}
}
