package application_metodo_na_classe;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
	
	// Membros ->constantes<- e variaveis são diferenciados pela sintaxe ->final<- usado para constante
	//Nome de membros constantes são padronizados com letras maiúsculas e underline entre mais de uma palavra
	//A constante e os métodos-funções-operações precisam ser estaticos se forem criandas todas dentro do >main< que é estatico
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
	// Função. Operação . Método
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
			
	}
	// Função. Operação . Método
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
			
	}
}
