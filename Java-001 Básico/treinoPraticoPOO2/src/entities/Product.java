package entities;

public class Product {
	//Atributos
	public String name;
	public double price;
	public int quantity;
	
	//Método-Função-Operação
	public double totalValueInStock() {
		return price * quantity;
		}
	
	//Método-Função-Operação
		/*this é usado para acessar diretamente o atributo da classe. Assim evitando 
	ambiguidade de referencia do parametro da função addProducts*/
	public void addProducts(int quantity) {
		
		this.quantity += quantity;
	}
	
	//Método-Função-Operação
		/*this é usado para acessar diretamente o atributo da classe. Assim evitando 
	ambiguidade de referencia do parametro da função addProducts*/
	public void removeProducts(int quantity) {
		this.quantity -=quantity;
	}
	
	//Sobrepondo o método de Object: toString E implementar a propria versão do toString
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}

}
