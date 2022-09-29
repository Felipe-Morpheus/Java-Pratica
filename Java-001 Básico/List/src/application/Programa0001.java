package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa0001 {

	public static void main(String[] args) {

		/*
		 * A lista não aceita tipos de variáveis primitivas ou seja, int. Usa-se somente
		 * wrappers class ou seja, classe empacotadora. que significa usar Interger ou
		 * invés de int. Obs. Usa-se os simbolos " < > " Representa o Generics que é
		 * quando você pode parametrizar a definição de um tipo, informando um outro
		 * tipo escopifico que desejar
		 * 
		 * Em seguida é necessário instanciar a lista, e já que ela é do tipo intarface,
		 * é preciso colocar uma classe que implemente a interface. No caso, a ArrayList
		 * que é uma implementação otimizada
		 */
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// Escolher a posição onde colocar um novo elemento
		list.add(2, "Marco");

		// Descobrir tamanho da lista
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");

		// Remover elemento, tanto pela descrição do elemento entre aspas duplas quanto
		// pela coordernada
		// onde ele está salvo usando numero de posição.

		// list.remove("Anna");
		list.remove(0);

		// Remover com predicado com uma função lambda
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------------------");

		// Encontrar posição do elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("------------------------------------");

		// Encontrar elementos com preficado usando a função lambda
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------------");
		
		//Encontrar um primeiro elemento que comece com a letra do pedricado ou devolva nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);

	}
}
