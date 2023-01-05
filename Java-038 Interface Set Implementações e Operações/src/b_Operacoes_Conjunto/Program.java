package b_Operacoes_Conjunto;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	
	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		//union 
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		
		System.out.println("Adiciona valores diferentes e sobrepõe os iguais entres os conjuntos:\n " + c);
		System.out.println();
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		
		d.retainAll(b);
		System.out.println("Busca elementos que existem nos dois conjuntos:\n " + d);
		System.out.println();

		//difference 
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		
		System.out.println("Trás elementos do primeiro conjunto que não estão no segundo:\n " + e);
	}
}