package entities;


//Para ler e imprimir nome e salario no formato csv  dados em ordem desejada
public class Employee implements Comparable<Employee> {
	
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		return salary.compareTo(other.getSalary()); // se quiser mudar a ordem ou o obj a se comparar, mude-o exemplo, nome ou salario
	}
	

	
	
}
