package application;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Programa {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(1001, "Alex", 1000.0);
		c1.saque(200.0);
		System.out.println(c1.getSaldo());
		
		
		//Testando o valor sobreposto da Conta pela ContaPoupança e isentando da taxa de 5.0
		Conta c2 = new ContaPoupanca(1002, "Maria", 1000.0, 0.01);
		c2.saque(200.0);
		System.out.println(c2.getSaldo());
		
		//Testando o valor sobreposto da Conta pela ContaComercial utilizando o metodo
		// original da super mais uma nova atualização da taxa de 2.0
		Conta c3 = new ContaComercial(1003, "Bob", 1000.0, 500.0);
		c3.saque(200.0);
		System.out.println(c3.getSaldo());
		
		
		
	}

}
