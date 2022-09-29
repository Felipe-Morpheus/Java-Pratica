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



package G_PO_Entities;

import java.util.Locale;
import java.util.Scanner;

public class Resolvendo_problema_sem_orientacao_a_objeto {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;

		System.out.println("Enter the measures of triangle X: ");
		xA = ler.nextDouble();
		xB = ler.nextDouble();
		xC = ler.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		yA = ler.nextDouble();
		yB = ler.nextDouble();
		yC = ler.nextDouble();

		// Formula x
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

		// Formula y (obs. usando a mesma variável p )
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
