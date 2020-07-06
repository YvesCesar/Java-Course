package entities;

public class Employee {
	Integer id;
	String name;
	Double salary;
	
	public Employee( int id, String name, double salary )
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	public void increaseSalary( double percentage )
	{
		salary += salary * ( percentage / 100 );
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setId( int id ) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	
	public Double getSalary() {
		return this.salary;
	}
	public void setSalary( double salary ) {
		this.salary = salary;
	}
	
	public String toString() {
		return id + ", " + name + 
				", " + String.format("%.2f", salary);
	}
}
