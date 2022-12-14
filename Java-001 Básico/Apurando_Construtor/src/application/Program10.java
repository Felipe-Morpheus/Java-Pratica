/*
 Problema:
 Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e quantidade no estoque)
 Em seguida:
 
 Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no estoque)
 Realizar uma entrada no estoque e mostrar novamente os dados do produto
 Realizar uma sa�da no estoque e mostrar novamente os dados do produto
 */

// Interface com cliente
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Product10;

public class Program10 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = ler.next();
		
		System.out.print("Price: ");
        double price = ler.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = ler.nextInt();
		
		//Declarando-instanciando vari�vel do tipo classe (executando o construtor com new)
		 Product10 product = new Product10(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = ler.nextInt();
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
