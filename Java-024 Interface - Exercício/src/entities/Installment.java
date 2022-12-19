package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//PARCELA
public class Installment {

	//ATB
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dueDate;
	private Double amount;
	
	//CONST C/A
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	//GET-SET
	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	//TOSTRING
	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
 	}
}