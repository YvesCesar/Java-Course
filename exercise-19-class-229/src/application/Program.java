package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String fullFilePath = sc.nextLine();
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fullFilePath)) ) {
			System.out.print("Enter salary: ");
			double salaryRecieved = sc.nextDouble();
			
			List<Employee> employeesList = new ArrayList<>();
			
			String lineOfEmployeeDataFile = bufferedReader.readLine(); 
			while (lineOfEmployeeDataFile != null) {
				
				String[] employeeDataByLine = lineOfEmployeeDataFile.split(",");
				String employeeNameByIndexData = employeeDataByLine[0];
				String employeeEmailByIndexData = employeeDataByLine[1];
				Double employeeSalaryByIndexData = Double.parseDouble(employeeDataByLine[2]);
				
				employeesList.add(
						new Employee(
								employeeNameByIndexData,
								employeeEmailByIndexData,
								employeeSalaryByIndexData
						)
				);
				lineOfEmployeeDataFile = bufferedReader.readLine();
			}
			
			Comparator<String> sortEmailListByAlphabetic = ( employeeEmail1, employeeEmail2 ) -> employeeEmail1.toUpperCase().compareTo(employeeEmail2.toUpperCase());
					
			System.out.println("Email of people whose salary is more than $" + String.format("%.2f", salaryRecieved));
			List<String> employeeEmails = employeesList.stream()
					.filter(employee -> employee.getSalary() > salaryRecieved)
					.map(employee -> employee.getEmail())
					.sorted(sortEmailListByAlphabetic)
					.collect(Collectors.toList());
			
			employeeEmails.forEach(System.out::println);
			
			Double employeeNameStartsWithMSalarySum = employeesList
					.stream()
					.filter(employee -> employee.getName().charAt(0) == 'M')
					.map(employee -> employee.getSalary())
					.reduce(0.0, ( salary1, salary2 ) -> salary1 + salary2);
			
			System.out.print("Sum of people salary whose name starts with 'M': " + String.format("%.2f", employeeNameStartsWithMSalarySum));
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
