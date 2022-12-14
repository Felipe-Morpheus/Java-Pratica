package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel:");
		System.out.print("Modelo do carro: ");
		String carModel = ler.nextLine();
		System.out.println("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(ler.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(ler.nextLine(), fmt);

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com preço por hora: ");
		double pricePerHour = ler.nextDouble();
		System.out.print("Entre com preço por dia: ");
		double pricePerDay = ler.nextDouble();
		
		RentalService  rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento básico: " + cr.getInvoice().getBasicaPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.err.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		
		ler.close();

	}

}
