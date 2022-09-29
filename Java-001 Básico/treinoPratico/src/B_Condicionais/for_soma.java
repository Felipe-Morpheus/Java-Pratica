package B_Condicionais;

import java.util.Scanner;

public class for_soma {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);
		
		int N = ler.nextInt();
		int soma = 0;
		
		for (int i=0; i<N; i++){
			int x = ler.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		ler.close();
	}
	
	

}
