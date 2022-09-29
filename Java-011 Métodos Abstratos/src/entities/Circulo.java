package entities;

import entities.enums.Cor;

public class Circulo extends Figura {
	//atb
	private double raio;

	//const1
	public Circulo() {
		super();
	}
	//const2
	public Circulo(Cor cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	//getset	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}
