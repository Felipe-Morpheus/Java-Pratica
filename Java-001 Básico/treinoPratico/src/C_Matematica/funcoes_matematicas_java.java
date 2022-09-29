package C_Matematica;

public class funcoes_matematicas_java {

	public static void main(String[] args) {
	 
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		double A, B, C;
		
		
		
		// Vari�vel A recebe raiz quadrada de X		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C + "\n");

		// Vari�vel A recebe resultado de X elevado a Y		
		A = Math.pow(x,  y);
		B = Math.pow(x,   2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C + "\n");
		
		// Vari�vel A recebe o valor absoluto de X	(Sem negativo caso exista)	
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B + "\n");
		
		// Variavel A recebe o valor de x e y e encontra o maior valor
		A = Math.max(x, y);
		System.out.println("Maior valor entre  "+ x + " e "+  y + " é = " + A + "\n");
		// Variavel A recebe o valor de x e y e encontra o menor valor
		A = Math.min(x, y);
		System.out.println("Menor valor entre  "+ x + " e "+  y + " é = " + A);
		
		// Variavel A receve um valor aleatório. 
		A = Math.random();
		System.out.println(A);
		

		




		/*
		 // Bascara
		 double delta, x1, x2;
		 double b, a, c;
		 
		 delta = Math.pow(b,  2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		*/
		
		
	}

}
