package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	//COMPOSIÇÃO ASSOCIAÇÃO DEPENDENCIA
	private OnlinePaymentService onlinePaymentService;
	
	//CONST C/A
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	//METODO-FUNÇÃO-OPERAÇÃO
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months; 
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i); //função plusMonths adiciona a partir da data original
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
	}
}