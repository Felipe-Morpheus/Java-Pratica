/*
 Problema:
 Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque)
 Em seguida:
 
 Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
 Realizar uma entrada no estoque e mostrar novamente os dados do produto
 Realizar uma saída no estoque e mostrar novamente os dados do produto
 */

// Interface com cliente
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		
		//Declarando-instanciando variável do tipo classe (executando o construtor com new)
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = ler.next();
		
		System.out.print("Price: ");
		product.price = ler.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = ler.nextInt();
		
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = ler.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = ler.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product.toString());
		
		
		ler.close();
	}
	
	

}
