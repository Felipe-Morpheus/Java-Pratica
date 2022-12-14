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

import entities.Product12;

public class Program12 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
						
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = ler.next();
		System.out.print("Price: ");
        double price = ler.nextDouble();
		
		
		
		//Declarando-instanciando variável do tipo classe (executando o construtor com new)
        //Chamando o construtor sobrecarregado
        Product12 product = new Product12(name, price);
		
        //Atualizando o valor do atributo encapsulado/private pelo nome do objeto >product< e >setName<
		 product.setName("Computer");
		 
		 //Acessando/pegando o valor do atributo encapsulados/private pelo nome do objeto >product< e >getName<
		 System.out.println("Updated name: " + product.getName() );
		 
	     //Atualizando o valor do atributo encapsulado/private pelo nome do objeto >product< e >setPrice<
		 product.setPrice(1200.00);
		 
		//Acessando/pegando o valor do atributo encapsulados/private pelo nome do objeto >product< e >getPrice<
		 System.out.println("Updated price: " + product.getPrice() );
        
        
		System.out.println();
		System.out.println("Product data: " + product.toString() );
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
