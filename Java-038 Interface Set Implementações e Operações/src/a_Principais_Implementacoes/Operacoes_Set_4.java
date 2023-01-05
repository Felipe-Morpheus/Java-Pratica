package a_Principais_Implementacoes;

import java.util.LinkedHashSet;
import java.util.Set;

public class Operacoes_Set_4 {
	
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		//Operações//
	
		//set.remove("Tablet");
		//set.removeIf(x -> x.length() >=3); //Predicado Remova todo elemento x, tal que o comprimento seja maior ou igual a 3
		//set.removeIf(x -> x.charAt(0) == 'T');//Predicado Remova todo elemento x, tal que o o caracter 0 seja igual a letra 'T'
		
		
		for (String p : set) {
			System.out.println(p);
		}

	}

}
