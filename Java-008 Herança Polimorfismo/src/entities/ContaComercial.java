package entities;

public class ContaComercial extends Conta {
	//atn
	private Double limiteEmprestimo;
	
	//Super usar a lógica do construtor da classe base/superclasse
	//const1
	public ContaComercial() {
		super();
	}
	//const2
	public ContaComercial(Integer numero, String titular, double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}
	//getset
	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	//Operaçao
	public void emprestimo (double quantidade) {
		if(quantidade <= limiteEmprestimo)
		saldo += quantidade -10.00;
	}

	//Informar ao compilador que esse método é uma sobreposição da super
	@Override
	public void saque(double quantidade) {
		super.saque(quantidade);
		saldo -= 2.0;
	}
}
