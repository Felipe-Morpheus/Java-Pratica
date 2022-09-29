package util_static;

public class Calculator {

	// Membros ->constantes<- e variaveis são diferenciados pela sintaxe
	// ->final<- usado para constante
	// Nome de membros constantes são padronizados com letras maiúsculas e
	// underline entre mais de uma palavra
	//Já que a classe calculator é estatica, para ser usada em outra classe, não precisará ser instanciada 
	//Sendo chamado diretamente pelo nome da classe, no caso ->Calculator<-
	public static final double PI = 3.14159;

	// Função. Operação . Método
	public static double circumference(double radius) {
		return 2.0 * PI * radius;

	}

	// Função. Operação . Método
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;

	}

}
