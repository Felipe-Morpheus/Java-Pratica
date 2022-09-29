package application;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Programa {
	
	public static void main(String[] args) {
		
		//Exemplo claro de polimorfismo, usando duas variáveis do mesmo tipo "Conta"
		//porém cada qual com comportamentos distintos. UPCASTING
	Conta x = new Conta(1020, "Alex", 1000.0);
	Conta y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);
	
	x.saque(50.0);
	y.saque(50.0);
		
	System.out.println(x.getSaldo());
	System.out.println(y.getSaldo());
		
	}

}
