package util_exercicio;

public class CurrencyConverter {
	
	//Membro Constante
	public static final double IOF = 1.06; //6%
	

	// Fun��o. Opera��o . M�todo
	public static double convert(double dolar, double real) {
		return IOF * dolar * real;
	}
	
	
	
	

}
