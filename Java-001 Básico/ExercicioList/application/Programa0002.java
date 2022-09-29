package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionarios;

public class Programa0002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		//Lista com Generic baseado na entidade Funcionarios e instanciando a ArrayList
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários vão ser registrados? ");
		int N = ler.nextInt();
		
		for(int i = 0; i<N; i++ ) {
			System.out.println();
			
			System.out.println("Funcionário #" + (i + 1) + ":");
			
			System.out.print("Id: ");
			Integer id = ler.nextInt();
			while(aumentoId(list, id)) {
				System.out.println("Este Id já existe. Tente novamente:");
				id = ler.nextInt();
			}
			
			System.out.print("Nome: ");
			ler.nextLine();
			String nome = ler.nextLine();
			
			System.out.print("Salário: ");
			Double salario = ler.nextDouble();
			
			
			//Instanciando a entidade e seu construtor
			Funcionarios funci = new Funcionarios(id, nome, salario);
			
			list.add(funci);
		}
		System.out.println();
		System.out.print("Entre com id do funcionário que terá aumento de salário: ");
		int aumentoid = ler.nextInt();
		
		//lambda. filtrar a lista que atender o predicado leitura:
		// eu vou querer somente os funcionarios x tal que x.getId seja igual a aumentoid e pega o primeiro se não existir, me envie/retorne nulo
		Funcionarios funci = list.stream().filter(x -> x.getId() == aumentoid).findFirst().orElse(null);
		
		if(funci == null) {
			System.out.println("Este id não existe!");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double percentual = ler.nextDouble();
			funci.aumentoSalario(percentual);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		
		for (Funcionarios fun: list) {
			System.out.println(fun);
		}
		
		
		ler.close();
				
	}
	//Função-Método-Operação Obs.: o >public< é opcional pois ela está sendo criada na mesma classe
	//Lembrando que o list abaixo não tem nada a ver com o list acima pois ambos foram declarados em escopos diferentes
	public static Integer posicao (List<Funcionarios> list, int id) {
		for (int i = 0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	//Função-Método-Operação
	public static boolean aumentoId (List<Funcionarios> list , int id) {
		Funcionarios funci = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funci !=null;
	}

}
