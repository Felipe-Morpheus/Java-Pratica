package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	//ATB
	private LocalDateTime start;
	private LocalDateTime finish;
	//COMPOSIÇÃO/ASSOCIAÇÕES
	private Vehicle vehicle;
	private Invoice invoice;
	
	//CONST S/A
	public CarRental() {
		
	}
	//CONST C/A
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
	//GET-SET
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getFinish() {
		return finish;
	}
	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	


}
