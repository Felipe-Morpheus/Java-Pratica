/*
 "Principais implementações de Set<T>:
 • TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
    compareTo do objeto (ou Comparator) na impressão
    
 • HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado na impressão
 • LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
 */

package a_Principais_Implementacoes;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_2 {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		//set.contains confere se existe o elemento Notebook
		System.out.println("Existe este elemento? " + set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}
}