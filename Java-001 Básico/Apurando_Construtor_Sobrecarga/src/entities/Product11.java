package entities;

public class Product11 {
	//Atributos
	public String name;
	public double price;
	public int quantity;
	
	
	//Construtor padrão para deixar funcional caso necessário //opcional
	public Product11() {
		
	}
	
	//Construtor personalizado
	/*Em sua sintaxe ele recebe apenas o nome da classe mais os atributos dela dentro de seu parametro.
	  Dentro do construtor ou seja nas chaves {..} Você terá que atribuir os parametros do construtor
	  Ao nome dos objetos que constuituem os atibutos da classe para o nome do objeto. 
	  Usando a sintaxe >this<*/
	
	public Product11 (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Construtor personalizado Sobrecarregado : Disponibilizar mais de uma versão da mesma operação
	public Product11 (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
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
