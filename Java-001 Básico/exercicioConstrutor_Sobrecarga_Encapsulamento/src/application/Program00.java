package application;
//nextLine = ler a linha inteira
// Quando usar NextLine e outro next é preciso usar um next a mais
//para consumir a pendencia (bug)
import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program00 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Entre com o número da conta: ");
		int numero = ler.nextInt();
		
		System.out.print("Entre com o titular da conta: ");
		ler.nextLine();
		String titular = ler.nextLine();
		
		System.out.print("Tem depósito inicial (s/n) ");
		char resp = ler.next().charAt(0);
		if (resp == 's'){
			System.out.print("Entre com valor de depósito inicial: ");
			double depositoInicial = ler.nextDouble();
			//Usando Construtor de 3 argumentos
			conta = new Conta(numero, titular, depositoInicial);
		}
		else{
			//Usando Construtor de 2 argumentos Sobrecarga
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);
		
		
		// Depósito
		System.out.println();
		System.out.print("Entre com um valor de depósito: ");
		double valorDeposito = ler.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		//Saque
		System.out.println();
		System.out.print("Entre com um valor de saque: ");
		double valorSaque = ler.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		
		ler.close();
	}

}
