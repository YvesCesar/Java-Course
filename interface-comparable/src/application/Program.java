package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "/home/yvescesar/Documents/Curso_JAVA/files-test/People.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			
			while(employeeCsv != null) {
				
				String[] vector = employeeCsv.split(",");
				list.add(new Employee(vector[0], Double.parseDouble(vector[1])));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee employee : list) {
				System.out.println(employee.getName() + ", " + employee.getSalary());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
// /home/yvescesar/Documents/Curso_JAVA/files-test/people.txt
