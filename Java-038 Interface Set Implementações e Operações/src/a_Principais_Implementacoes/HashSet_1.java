/*
 "Principais implementações de Set<T>:
 • HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado na impressão
 
 • TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
    compareTo do objeto (ou Comparator) na impressão
 • LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
 */

package a_Principais_Implementacoes;
import java.util.HashSet;
import java.util.Set;

public class HashSet_1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		//set.contains confere se existe o elemento Notebook
		System.out.println("Existe este elemento? " + set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}
}