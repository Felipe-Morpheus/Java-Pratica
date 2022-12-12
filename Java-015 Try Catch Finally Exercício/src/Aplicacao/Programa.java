package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Reserva;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int numero = ler.nextInt();

		// conversão de um dado String para Date
		System.out.print("Data Check-In (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(ler.next());

		System.out.print("Data Check-Out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(ler.next());

		// After testa se uma data é depois da outra
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: A data de Check-Out deve ser depois da data do Check-In");
		} else {
			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("Reserva " + reserva);

			System.out.println();

			System.out.println("Entre com os dados para atualizar a reserva: ");

			System.out.print("Data Check-In (dd/MM/yyyy): ");
			checkIn = sdf.parse(ler.next());

			System.out.print("Data Check-Out (dd/MM/yyyy): ");
			checkOut = sdf.parse(ler.next());

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Erro na reserva. As datas de atualização de reserva devem ser datas futuras ");
			} 
			else if (!checkOut.after(checkIn)) {
				System.out.println("Erro na reserva: A data de Check-Out deve ser depois da data do Check-In");
			} 
			else {
				// Atualizar Data
				reserva.atualizaData(checkIn, checkOut);
				System.out.println("Reserva: " + reserva);
			}

		}

		ler.close();

	}

}
