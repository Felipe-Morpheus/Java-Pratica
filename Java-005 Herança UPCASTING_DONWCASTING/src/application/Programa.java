package application;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Programa {
	
	public static void main(String[] args) {
		
		Conta c = new Conta(1001, "Alex", 0.0);
		ContaComercial cc = new ContaComercial(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING pagar objeto do tipo subclasse(filho) e atribuir a superclasse(pai)
		Conta c1 = cc;
		Conta c2 = new ContaComercial(1003, "Bob", 0.0, 200.0);
		Conta c3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING pagar objeto do tipo superclasse(pai) e atribuir a subclasse(filho)
		ContaComercial c4 = (ContaComercial) c2;
		c4.emprestimo(100.0);
		
		
		if(c3 instanceof ContaComercial) {
			ContaComercial c5 = (ContaComercial)c3;
			c5.emprestimo(200.0);
			System.out.println("Empréstimo! " );
		}
		if(c3 instanceof ContaPoupanca) {
			ContaPoupanca c5 = (ContaPoupanca) c3;
			c5.atualizarSaldo();
			System.err.println("Atualização! " );
		}
	}

}
