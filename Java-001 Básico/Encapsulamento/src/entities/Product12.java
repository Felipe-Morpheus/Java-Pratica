package entities;

public class Product12 {
	
	//Atributos Encapsulados
	private String name;
	private double price;
	private int quantity;
	
	//Construtor padr�o
	public Product12(){
		
	}
	
	//Construtor personalizado
	public Product12 (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//Construtor personalizado Sobrecarga
	public Product12 (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Get e Set
	public String getName(){
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	//M�todo-fun��o-opera��o
	public double totalValueInStock(){
		return price * quantity;
	}
	
	//M�todo-fun��o-opera��o
	//Usa-se THIS para se referenciar diretamente ao atributo do objeto da classe.
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//Sobrepondo o m�todo de Objet: toString e implementando a propria ver�o do toString modificada
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


