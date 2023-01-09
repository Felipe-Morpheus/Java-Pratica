package entities;

public class Product  {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	//Metodo Estático Trabalha com o objeto que você passa como argumento (Product p)
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}
	
	@Override
	public String toString() {
		return    name +", " + String.format("%.2f", price) ;
	}



}
