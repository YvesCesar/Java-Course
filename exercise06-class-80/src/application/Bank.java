package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Register;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Register register = null;
		
		System.out.print("Enter the account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter the account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0); //Lendo um caractere
		
		if ( response == 'y' ) {
			System.out.print("Enter initial deposit value: ");
			double bankDeposit = sc.nextDouble();
			register = new Register( number, name, bankDeposit );
		} else if ( response == 'n') {
			register = new Register( number, name );
		} else {
			System.out.println("Invalid Value");
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(register.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double money = sc.nextDouble();
		register.depositMoney(money);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(register.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		money = sc.nextDouble();
		register.withdrawMoney(money);
		
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(register.toString());
		
		
		sc.close();
	}

}
