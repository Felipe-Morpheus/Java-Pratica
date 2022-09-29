package entities;

import java.util.Date;

public class HoraContrato {
	//atb
	private Date data;
	private double valorPorHora ;
	private Integer horas;
	
	
	//const1
	public HoraContrato() {
		
	}
	
	//const2
	public HoraContrato(Date data, double valorPorHora, Integer horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	//Get Set
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	//Operaç
	
	
	
}
