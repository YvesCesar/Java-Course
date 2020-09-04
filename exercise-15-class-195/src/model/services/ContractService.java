package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	PaymentService pS;
	GregorianCalendar cal;
	
	public ContractService() {}
	
	public ContractService(PaymentService pS) {
		this.pS = pS;
	}
	
	public void processContract(Contract contract, Integer months) throws ParseException {
		Double plots = contract.getValue() / months;
		Double tax = pS.paymentFee(plots);
		
		for(int i = 1; i <= months; i++) {
			Double amount = pS.interest(plots, i);
			amount += tax;
			
			cal = new GregorianCalendar();
			cal.setTime(contract.getDate());
			int newMonth = 1 + cal.get(Calendar.MONTH) + i;
			
			Date dueDate = sdf.parse(cal.get(Calendar.DAY_OF_MONTH) + "/" + newMonth + "/" + cal.get(Calendar.YEAR));
			
			Installment installment = new Installment(amount, dueDate, contract);
			
			contract.setInstallments(installment);
		}
	}
}
