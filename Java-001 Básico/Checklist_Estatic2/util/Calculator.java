package util;

public class Calculator {

	// Membros ->constantes<- e variaveis são diferenciados pela sintaxe
	// ->final<- usado para constante
	// Nome de membros constantes são padronizados com letras maiúsculas e
	// underline entre mais de uma palavra
	//Já que a classe calculator não é estatica, para ser usada em outra classe, deverá ser instanciada >new<
	//Membros que nao sao estaticos >static< devem ser instanciados como objeto.
	public final double PI = 3.14159;

	// Função. Operação . Método
	public  double circumference(double radius) {
		return 2.0 * PI * radius;

	}

	// Função. Operação . Método
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;

	}

}
