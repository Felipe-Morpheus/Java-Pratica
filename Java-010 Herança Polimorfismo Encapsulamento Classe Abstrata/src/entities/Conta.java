package entities;


//Declarando a palavra abstract voce impede a instanciação ou polimorfismo entre as subsclasses
public abstract class Conta {
	//atb

	private Integer numero;
	private String titular;
	protected Double saldo;
	
	//cons1
	public Conta () {
		
	}
	//const2
	public Conta(Integer numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	//get set
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	//Operação Função
	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}
	public void deposito (double quantidade) {
		saldo += quantidade;
	}
	
	
	

}
