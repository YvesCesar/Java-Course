package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	private Double amount;
	private Date dueDate;
	
	private Contract contract;

	public Installment() {}
	
	public Installment(Double amount, Date dueDate, Contract contract) {
		this.amount = amount;
		this.dueDate = dueDate;
		this.contract = contract;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setQuantity(Double amount) {
		this.amount = amount;
	}
	
	public Date getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
	}
}
