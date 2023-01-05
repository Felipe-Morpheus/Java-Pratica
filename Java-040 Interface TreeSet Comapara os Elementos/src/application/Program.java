package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		//Quando se usa o TreeSet, a classe do conjunto precisa ser uma implementação 
		//do comparable, para que o TreeSet possa ordernar os objetos.
	Set<Product> set = new TreeSet<>();
	
	
	set.add(new Product("Tv", 900.0));
	set.add(new Product("Notebook", 1200.0));
	set.add(new Product("Tablet", 400.0));
	
	for (Product p : set) {
		System.out.println(p);
	}

	}
}
