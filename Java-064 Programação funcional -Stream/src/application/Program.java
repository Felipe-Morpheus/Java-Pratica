///Função "map" (não confunda com a estrutura de dados Map) é uma função
// que aplica uma função instanciada a todos elementos de um lista stream.(Sequencia de dados)
package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//Multiplica os valores da lista por 10 
		//map é uma função que aplica uma função instanciada no argumento a todos elementos de um lista stream.(Sequencia de dados)
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//Stream.of permite colocar elementos diretamente dentro do argumento.
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		//Stream.iterat permite que você construa uma expressão lógica que independente. [?]
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // Potencialmente infinita
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1],p[0]+p[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
	}

}
