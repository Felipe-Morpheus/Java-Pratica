package D_Funcoes_String;

public class Formatacoes {
	
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG  ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-" + " Formata p/ min�sculo");
		System.out.println("toUpperCase: -" + s02 + "-" +  " Formata p/ mai�sculo");
		System.out.println("trim: -" + s03 + "-" + " tira espa�os vazios dos cantos inicio/fim");
		System.out.println("substring(2); -" + s04 + "-" +  " corta a quantidade de casas definida na condi��o do inicio") ;
		System.out.println("substring(2, 9): -" + s05 + "-" +  " corta a quantidade de casas definida na condi��o 1 e le as casas definidas na condição 2 ");
		System.out.println("replace ('a', 'x'): -" + s06 + "-" + " troca a condi��o 1 pe�a condi��o 2 (char, char) ");
		System.out.println("replace ('abc', 'xy'): -" + s07 + "-" + " troca a condi��o 1 pe�a condi��o 2 (string, string)");
		System.out.println("Index of 'bc': " + i + " - Mostra a ..PRIMEIRA.. coordenada n�merica colocada na condi��o da fun��o, no caso primeira coordenada de bc");
		System.out.println("Last Index of 'bc': " + j + " - Mostra a ..�LTIMA.. coordenada n�merica colocada na condi��o da fun��o, no caso �ltima coordernada de bc");

	}

}
