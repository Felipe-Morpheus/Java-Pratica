package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	// ATB
	private Double pricePerHour;
	private Double pricePerDay;
	// COMPOSIÇÃO ASSOCIAÇÃO
	private BrazilTaxService taxService;

	// CONST C/A
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	// METODO
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours); // Arredonda pra cima Math.ceil
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0); // Converter Horas em dias converta horas por 24.0
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
