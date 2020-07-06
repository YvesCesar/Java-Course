package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	
	public static void main( String[] args ) {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		
		List< Employee > list = new ArrayList<>();
		
		System.out.print( "How many employees will be registered ? " );
		int quantity = sc.nextInt();
		
		
		//Register of Employees:
		for ( int i = 0; i < quantity; i++ ) {
			System.out.println();
			
			System.out.printf( "Employee #%d%n" , i + 1 );
			
			boolean passed = false; 
			int id = 0;
			
			do {
				System.out.print("Id: ");
				int register = sc.nextInt(); 
				
				List<Employee> result = list.stream().filter( x -> x.getId() == register ).collect(Collectors.toList()); 
				
				if ( result.size() > 0 ) {
					System.out.println("This ID is already been registered. Try again with a different value.");
					passed = true;
					id = 0;
				}
				else {
					id = register;
					passed = false;
				}
			} while ( passed != false );
			
			System.out.print( "Name: " );
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print( "Salary: " );
			double salary = sc.nextDouble();
			
			list.add( new Employee( id, name, salary ) );
			
		}
		
		//Salary increase: 
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id_increase = sc.nextInt();
		
		List<Employee> id_searching = list.stream().filter( x -> x.getId() == id_increase ).collect(Collectors.toList());
		
		if ( id_searching.size() < 1 ) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			for ( Employee employee : list ) {
				if (employee.getId() == id_increase) {
					employee.increaseSalary(percentage);
				} 
			}
		}
		
		System.out.println();
		for ( Employee employee : list ) {
			System.out.println(employee.toString());
		}
		
		sc.close();
	}
}
