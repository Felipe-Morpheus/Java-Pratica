/*
			 * Problema Fazer um programa para ler as medidas dos lados de dois
			 * triângulos X e Y (suponha medidas válidas). Em seguida, mostrar o
			 * valor das áreas dos dois triângulos e dizer qual dos dois triângulos
			 * possui a maior área.
			 * 
			 * A fórmula para calcular a área de um triângulo a partir das medidas
			 * de seus lados (a) (b) e (c) é a seguinte (fórmula de Heron):
			 * 
			 * a+b+c área = √p(p-a)(p-b)(p-x) onde p = --- 2
			 */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;


public class Program {
	

		public static void main(String[] args) {

			
			Locale.setDefault(Locale.US);
			Scanner ler = new Scanner(System.in);
			
			//Chamando a variável do tipo classe
			Triangle x, y;
			x = new Triangle();
			y = new Triangle();
			
			//Depois declare a(s) variável(s) com instancial(s) e digite ponto (.) para autocomplementar
			//E selecione o atributo da variavel do tipo classe, desejado no caso (a, b, c)
			
			System.out.println("Enter the measures of triangle X: ");
			x.a = ler.nextDouble();
			x.b = ler.nextDouble();
			x.c = ler.nextDouble();

			System.out.println("Enter the measures of triangle Y: ");
			y.a = ler.nextDouble();
			y.b = ler.nextDouble();
			y.c = ler.nextDouble();

			// Formula x Feita na classe triangle
			
			double areaX = x.area();

			// Formula y Feita na classe triangle
			
			double areaY = y.area();
			
			System.out.printf("Triangle X area: %.4f%n", areaX);
			System.out.printf("Triangle Y area: %.4f%n", areaY);

			if (areaX > areaY) {
				System.out.println("Larger area: X");
			} else {
				System.out.println("Larger area: Y");
			}

			ler.close();
		}

	}

	
	


