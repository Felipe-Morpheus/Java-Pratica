package entities;

public class Funcionarios {
	//Atributos
	private Integer id;
	private String nome;
	private Double salario;
	
	//Construtor Simples
	public Funcionarios() {
		
	}
	//Construtor com seus objetos atribuídos aos atributos da classe
	public Funcionarios(Integer id, String nome, Double salary) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salary;
	}
	//Get Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salario;
	}

	public void setSalary(Double salary) {
		this.salario = salary;
	}
	
	//Metodo-Operação-Função com argumento double percentual
	public void aumentoSalario(double percentual) {
		salario = salario + salario * percentual / 100.0;
		
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
}
