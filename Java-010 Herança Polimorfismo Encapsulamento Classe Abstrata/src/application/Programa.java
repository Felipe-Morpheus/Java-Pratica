package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Programa {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		List<Conta> list = new ArrayList<>();
		
		list.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
		list.add(new ContaComercial(1002, "Maria", 1000.0, 400.0));
		list.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
		list.add(new ContaComercial(1005, "Anna", 500.0, 500.0));
		
		//Totalizar saldo das contas
		double soma = 0.0;
		//Para cada objeto Conta c do tipo list executar condição abaixo
		for(Conta c : list) {
			soma += c.getSaldo();
		}
		System.out.printf("Saldo total: %.2f%n", soma);
	
		
		for (Conta c : list) {
			c.deposito(10.0);
		}
		
		for (Conta c : list) {
			System.out.printf("Atualização de saldo para a conta %d:  %.2f%n",c.getNumero(), c.getSaldo());
		}
	
	}
		
		
}
