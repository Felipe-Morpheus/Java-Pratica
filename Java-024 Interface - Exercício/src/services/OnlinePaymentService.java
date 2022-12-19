package services;

public interface OnlinePaymentService {

	//METODO
	double paymentFee(double amount);
	double interest(double amount, int months);
}