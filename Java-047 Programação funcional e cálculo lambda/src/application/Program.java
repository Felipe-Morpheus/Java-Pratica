package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	//Em programação funcional, as funções são de primeira ordem
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
	List<Product> list = new ArrayList<>();
	
	list.add(new Product ("Tv", 900.00));
	list.add(new Product ("Notebook", 1200.00));
	list.add(new Product ("Tablet", 450.00));

	//Pode ser passado com argumento e ser retornado.
	list.sort(Program::compareProducts);
	
	list.forEach(System.out::println);

	}	
}
