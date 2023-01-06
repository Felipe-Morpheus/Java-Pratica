package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// Lógica de comparação:
		/*
		 * Pega o nome do produto, converte todas as letras para maiúsculo Depois
		 * compara com o nome do outro produto convertido para maiúsculo também
		 */
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
