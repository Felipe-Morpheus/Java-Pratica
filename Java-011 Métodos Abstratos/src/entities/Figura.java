package entities;

import entities.enums.Cor;

//Classe abstrata
public abstract class Figura {

	// Classe instanciada
	private Cor cor;

	// Const1
	public Figura() {

	}

	// Const2
	public Figura(Cor cor) {
		this.cor = cor;
	}

	//getset
	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	// Método abstrata
	public abstract double area();
}
