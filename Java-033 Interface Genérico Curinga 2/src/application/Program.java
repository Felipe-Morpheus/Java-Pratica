package application;

import java.util.Arrays;
import java.util.List;

public class Program {
	
	//É possivel fazer um uppercasting com o list<?> (é um super tipo de qlqr lista. curinga) mas com list<object> não
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}


//Contras: Não da pra usar list.add( ) 