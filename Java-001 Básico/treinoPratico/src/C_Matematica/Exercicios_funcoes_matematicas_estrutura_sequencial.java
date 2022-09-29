package C_Matematica;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios_funcoes_matematicas_estrutura_sequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		//Declarando simultaneamente o valor e o scanner da variável
		System.out.println("Por favor, digite a largura = ");
		double largura = ler.nextDouble();
		
		System.out.println("Por favor, digite o comprimento = ");
		double comprimento = ler.nextDouble();
		
		System.out.println("Por favor, digite o preço do M² = ");

		double metroQuadrado = ler.nextDouble();
		
		
		//Atribuindo
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
	System.out.printf(" ÁREA = %.2f %n " , area);
	System.out.printf("PREÇO = %.2f" , preco);
		
		ler.close();
		
		//Declarando Scanner apos a variavel
		 /*
		double largura, comprimento, metroQuadrado;
		
		largura = ler.nextDouble();
		comprimento = ler.nextDouble();
		metroQuadrado = ler.nextDouble();
		*/
		
		//Com valores já inseridos
		/*
		double largura = 10.0;
		double comprimento = 30.0;
		double metro_quadrado = 200.00;
		*/
		
		
		
	}

	
	}

