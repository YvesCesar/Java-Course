package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for ( int i = 0; i < n; i++ ) {
			
			System.out.println("Tax payer #" + (i + 1) + " data:");
			
			System.out.print("Individual or Company (i/c) ? ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			if ( response == 'i' ) {
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();
				
				list.add( new PhysicalPerson(name, annualIncome, healthSpending) );
			}
			else {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add( new LegalPerson(name, annualIncome, numberOfEmployees) );
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0.00;
		for ( Person person : list ) {
			System.out.println(
					
				person.getName() + ": $ " +
				String.format("%.2f", person.calculateTax())
					
			);
			
			sum += person.calculateTax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		
		sc.close();
	}

}
