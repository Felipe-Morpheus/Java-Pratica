package Entidades;

public class FuncionarioTercerizado extends Trabalhador {
	
	private Double custoAdicional;

	
	
	public FuncionarioTercerizado() {
		super();
	}
	
	public FuncionarioTercerizado(String nome, Integer hora, Double valorPorHora, Double custoAdicional) {
		super(nome, hora, valorPorHora);
		this.custoAdicional = custoAdicional;
	}

	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}
	
	
	//Sobreposição utilizando modificando calculo da super
	@Override
	public double formaPagamento() {
		return super.formaPagamento() + custoAdicional * 1.1;
	}
}
