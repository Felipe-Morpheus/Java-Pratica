package B_Condicionais;

public class condicional_for_each_vetor {
	
	public static void main(String[] args) {

		String[] vect = new String[] { "Dengo", "Margot", "Frida" };

		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------");
		//Para cada objeto obj contido no vetor vect, fa�a
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
