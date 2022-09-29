package entities;

//Final é usado para evitar que a classe seja sobreposta
//public final class ...... extends {..}
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
	//Informar ao compilador que esse método é uma sobreposição da super
	//Final é usado para evitar que a classe seja sobreposta
	//public final void saque (double quantidade){...}
	@Override
	public final void saque(double quantidade) {
		saldo -= quantidade;
	}
	

}
