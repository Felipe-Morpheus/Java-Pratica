package entities;

public class Departamento {
	//atb
	private String nome;
	
	
	//const simp
	public Departamento () {
		
	}

	//const sobrecarga
	public Departamento(String nome) {
		this.nome = nome;
	}

	//Get Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
		

}
