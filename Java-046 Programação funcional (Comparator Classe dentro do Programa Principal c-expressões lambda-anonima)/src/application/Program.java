package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));
		/////////////////////////////////////////////////////////////////////////////
		/* (lambda é uma função anonima
		 1. Comparator com sintaxe expressão lambda (x1, x2) -> {return ....};
		
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		*/
		//////////////////////////////////////////////////////////////////////////////
		/*
		  2. Quando a implementação de função tem apenas uma linha, pode-se dispensar a
		  verbosidade da expressão Descartando as chaves e a sintaxe return como o
		  exemplo a abaixo: 
		  
		 Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
 		*/
		/////////////////////////////////////////////////////////////////////////////////
		/*
		 3. Por último é possível realocar toda a expressão lambda e diretamente dentro do argumento sort: 
		 list.sort(expressao lambda);
		 */
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
