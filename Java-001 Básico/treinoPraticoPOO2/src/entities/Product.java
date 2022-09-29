package entities;

public class Product {
	//Atributos
	public String name;
	public double price;
	public int quantity;
	
	//M�todo-Fun��o-Opera��o
	public double totalValueInStock() {
		return price * quantity;
		}
	
	//M�todo-Fun��o-Opera��o
		/*this � usado para acessar diretamente o atributo da classe. Assim evitando 
	ambiguidade de referencia do parametro da fun��o addProducts*/
	public void addProducts(int quantity) {
		
		this.quantity += quantity;
	}
	
	//M�todo-Fun��o-Opera��o
		/*this � usado para acessar diretamente o atributo da classe. Assim evitando 
	ambiguidade de referencia do parametro da fun��o addProducts*/
	public void removeProducts(int quantity) {
		this.quantity -=quantity;
	}
	
	//Sobrepondo o m�todo de Object: toString E implementar a propria vers�o do toString
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
