package application_membro_com_instancia;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class Program5 {
	
	// Membros ->constantes<- e variaveis são diferenciados pela sintaxe ->final<- usado para constante
	//Nome de membros constantes são padronizados com letras maiúsculas e underline entre mais de uma palavra
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		////É precisará instanciar o objeto-construtor da classe Calculator, para só assim, poder chamar as funções objeto.
		Calculator calc = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = ler.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n" , c);
		System.out.printf("Volume: %.2f%n" , v);
		System.out.printf("PI value: %.2f%n" , calc.PI);
		
		
		ler.close();
	}
	
}
