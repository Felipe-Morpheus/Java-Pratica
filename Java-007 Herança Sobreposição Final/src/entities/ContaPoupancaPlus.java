package entities;

// Tanto a classe quanto o método não podem ser sobrepostos pois a classe super está usando 
//final em sua definição
public class ContaPoupancaPlus extends ContaPoupanca {
	
	
	
	// Tanto a classe quanto o método não podem ser sobrepostos pois a classe super está usando 
	//final em sua definição
	@Override
	public void saque(double quantidade) {
		saldo -= quantidade + 2.0;
	}

}
