package entities;

public class Product11 {
	//Atributos
	public String name;
	public double price;
	public int quantity;
	
	
	//Construtor padr�o para deixar funcional caso necess�rio //opcional
	public Product11() {
		
	}
	
	//Construtor personalizado
	/*Em sua sintaxe ele recebe apenas o nome da classe mais os atributos dela dentro de seu parametro.
	  Dentro do construtor ou seja nas chaves {..} Voc� ter� que atribuir os parametros do construtor
	  Ao nome dos objetos que constuituem os atibutos da classe para o nome do objeto. 
	  Usando a sintaxe >this<*/
	
	public Product11 (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Construtor personalizado Sobrecarregado : Disponibilizar mais de uma vers�o da mesma opera��o
	public Product11 (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
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
