package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		//É possivel fazer um uppercasting com o list<?> (super tipo de qlqr lista. curinga) mas com list<object> não
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
	}
}
