package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.FuncionarioTercerizado;
import Entidades.Trabalhador;

public class Programa {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Trabalhador> list = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de funcionários: ");
		int n = ler.nextInt();
		
		for (int i = 1; i<=n ; i++) {
			System.out.println("Dados do funcionário #" + i + ": ");
			
			System.out.print("É tercerizado (s/n)? ");
			char ch = ler.next().charAt(0);
			
			System.out.print("Nome: ");
			ler.nextLine();
			String nome = ler.nextLine();
			
			System.out.print("Horas: ");
			int horas = ler.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorPorHora = ler.nextDouble();
			
			if (ch == 's') {
				System.out.print("Despesa adicional: ");
				double custoAdicional = ler.nextDouble();
				
				//Criando uma variável do tipo super e instanciando
				//Exemplo claro de polimorfismo, usando duas variáveis do mesmo tipo "Trabalhador"
				//porém cada qual com comportamentos distintos. UPCASTING
				Trabalhador trab = new FuncionarioTercerizado(nome, horas, valorPorHora, custoAdicional);
				list.add(trab);
			}
			else {
				Trabalhador trab = new Trabalhador(nome, horas, valorPorHora);
				list.add(trab);
			}
		}
		System.out.println();
		
		System.out.println("Forma de Pagamento: ");
		for (Trabalhador trab : list) {
			System.out.println(trab.getNome() + " - $ " +String.format("%2f", trab.formaPagamento()));
		}
		
		
		
		ler.close();
	}
}
