package B_Condicionais;

import java.util.Scanner;

public class Higher_If_Else {
	/*
	 * Higher significa maior
	 */
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Enter three numbers: ");
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		
		if (a > b && a > c)
		{
			System.out.println("Higher = " + a + " The letter that contains the higher number is the: A");
		}
		else if( b > c){
			System.out.println("Higher = " + b + " The letter that contains the higher number is the: B");
			
		}
		else {
			System.out.println("Higher = " + c + " The letter that contains the higher number is the: C");
		}
		
		
		ler.close();
	}

}
