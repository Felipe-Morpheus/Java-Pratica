package model.entities;

public class Invoice {
	
	//ATB
	private Double basicaPayment;
	private Double tax;
	
	//CONST S/A
	public Invoice () {
		
	}
	
	//CONST C/A
	public Invoice(Double basicaPayment, Double tax) {
		this.basicaPayment = basicaPayment;
		this.tax = tax;
	}

	//GET-SET
	public Double getBasicaPayment() {
		return basicaPayment;
	}

	public void setBasicaPayment(Double basicaPayment) {
		this.basicaPayment = basicaPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	//METODO-FUNÇÃO-OPERAÇÃO
	public Double getTotalPayment() {
		return getBasicaPayment() + getTax();
	}
	
	

}
