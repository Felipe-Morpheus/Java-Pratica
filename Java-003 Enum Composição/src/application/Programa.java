package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Trabalhador;
import entities.enums.LevelTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Entre com o nome do departamento: ");
		String nomeDepartamento = ler.nextLine();

		System.out.println("Entre com dados do trabalhador: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = ler.nextLine();

		System.out.print("Level: ");
		String levelTrabalhador = ler.nextLine();

		System.out.print("Salário Base: ");
		double salarioBase = ler.nextDouble();

		// Instanciando a classe principal e relacionando aos objetos criados acima com
		// o construtor da principal e enum
		Trabalhador trabalhador = new Trabalhador
		(nomeTrabalhador, LevelTrabalhador.valueOf(levelTrabalhador),salarioBase, new Departamento(nomeDepartamento));

		System.out.print("Quantos contratos este trabalhador possui? ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com contrato #" + i  + " data:" );
			System.out.print("Data (DD/MM/YYYY): ");
			Date DataContrato = sdf.parse(ler.next());
			
			System.out.print("Valor por Hora: ");
			double valorPorHora = ler.nextDouble();
			
			System.out.print("Duração (horas): ");
			int horas = ler.nextInt();
			
			HoraContrato contrato = new HoraContrato(DataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		System.out.println();
		System.out.print("Entre com mês e ano para calcular a renda (MM/YYYY): ");
		String mesEAno = ler.next();
		//corta a quantidade de casas definida na condi��o 1 e le as casas definidas na condição 2 
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		//corta a quantidade de casas definida na condi��o 1 
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome: "  + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda por " + mesEAno + ": $" + String.format("%.2f", trabalhador.renda(ano, mes)));


		ler.close();

	}

}
