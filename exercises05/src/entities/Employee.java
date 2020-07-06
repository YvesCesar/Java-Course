package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double netSalary = grossSalary - tax;
		return netSalary;
	}
	
	public void increaseSalary( double percentage ) {
		 this.grossSalary += (percentage * grossSalary) / 100;
	}
	
	public String toString() {
		return this.name + ", " +
				"$ " + this.netSalary();
	}
}
