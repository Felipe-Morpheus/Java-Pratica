package util_static;

public class Calculator {

	// Membros ->constantes<- e variaveis s�o diferenciados pela sintaxe
	// ->final<- usado para constante
	// Nome de membros constantes s�o padronizados com letras mai�sculas e
	// underline entre mais de uma palavra
	//J� que a classe calculator � estatica, para ser usada em outra classe, n�o precisar� ser instanciada 
	//Sendo chamado diretamente pelo nome da classe, no caso ->Calculator<-
	public static final double PI = 3.14159;

	// Fun��o. Opera��o . M�todo
	public static double circumference(double radius) {
		return 2.0 * PI * radius;

	}

	// Fun��o. Opera��o . M�todo
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;

	}

}
