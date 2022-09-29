package entities;

public class ContaPoupanca extends Conta {
	
	//atb
	private Double taxaJuros;
	
	//Super usar a lógica do construtor da classe base/superclasse
	//const1
	public ContaPoupanca() {
		super();
	}

	//Super usar a lógica do construtor da classe base/superclasse
	//const2 args
	public ContaPoupanca(Integer numero, String titular, double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	//get set
	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	//Opera met fun
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	
	

}
