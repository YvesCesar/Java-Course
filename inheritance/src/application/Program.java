package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
	 	   	
		Account acc = new Account(1001, "Yves", 0.0);
		BusinessAccount bacc = new BusinessAccount( 1002, "Yamille", 0.0, 500.0 );
		
		//Upcasting: pegar um objeto do tipo BusinessAccount e atribuí-lo a uma variável do tipo Account
		Account acc1 = bacc;//Não dá erro, pois uma subclasse é uma superclasse(Herança).
		Account acc2 = new BusinessAccount( 1003, "Bob", 0.0, 200.0 );
		Account acc3 = new SavingsAccount( 1004, "Anna", 0.0, 0.01 );
		
		acc1.deposit(200.0);
		acc.deposit(200.0);
		
		//Downcasting:
		BusinessAccount acc4 = (BusinessAccount) acc2; //Conversão manual
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount) acc3; Operação não permitida. Um SavingsAccount é uma Account, mas não um BusinessAccount
		
		if ( acc3 instanceof BusinessAccount ) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if ( acc3 instanceof SavingsAccount ) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
