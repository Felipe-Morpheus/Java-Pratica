package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.LevelTrabalhador;

public class Trabalhador {
	
	//atb
	private String nome;
	private LevelTrabalhador level;
	private double salarioBase;
	
	
	//atb-Components-Associações
	private Departamento departamento;
	//atb-Quando houver composição tem muitos (  *  ) ele não pode ser inciado no construtor e sim instanciada no proprio obj
	private List<HoraContrato> contratos = new ArrayList<>();
	
	//Const
	public Trabalhador() {
		
	}

	//Const2
	public Trabalhador(String nome, LevelTrabalhador level, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	//Get Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LevelTrabalhador getLevel() {
		return level;
	}

	public void setLevel(LevelTrabalhador level) {
		this.level = level;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public void setContratos(List<HoraContrato> contratos) {
		this.contratos = contratos;
	}
	
	//Método Operac
	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}
	public void removeContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		
		//leitura for each: para cada contrato c na lista contratos fazer {...}
		for (HoraContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
	
}
	


