package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercise2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		System.out.print("Gloss Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee.toString());
		
		System.out.print("Wich percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary( percentage );
		
		System.out.println();
		System.out.println("Updated data: " + employee.toString());
		
		sc.close();
	}

}
