package entities;

public class Conta {
	//Atributos
	private int numero;
	private String titular;
	private double saldo;
	
	//Construtor com 2 argumentos
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	//Construtor com 3 argumentos
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}
	// Get e Set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
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

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Método -Função -Operação 
	// Note que o primeiro método foi criado primeiro e depois usado logo acima no construtor
	public void deposito(double quantidade) {
		saldo += quantidade;
	}
	public void saque(double quantidade) {
		saldo -= quantidade + 5.0;
	}
	
	public String toString() {
		return "Conta " 
				+ numero
				+ ", "
				+ ", Titular: "
				+ titular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
	
	
}
