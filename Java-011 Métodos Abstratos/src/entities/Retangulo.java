package entities;

import entities.enums.Cor;

public class Retangulo extends Figura {
	//atb
	private Double largura;
	private Double altura;
	//const1
	public Retangulo() {
		super();
	}
	//const2
	public Retangulo(Cor cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

		//getset
	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
//operador sobreposto com override pois é abstrato
	@Override
	public double area() {
		return largura * altura;
	}

}
