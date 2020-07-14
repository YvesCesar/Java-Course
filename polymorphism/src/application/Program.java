package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//Muitas formas:
		Account x = new Account(1020, "Yves", 1000.0);
		Account y = new SavingsAccount(1023, "Yamille", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
