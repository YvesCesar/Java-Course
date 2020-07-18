package entities;

public class LegalPerson extends Person{
	
	private Integer numberOfEmployees;
	
	public LegalPerson() { super(); }
	
	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double calculateTax() {
		
		double tax = 0.00;
				
		if ( numberOfEmployees > 10 ) {
			tax = 0.14;
		}
		else {
			tax = 0.16;
		}
		
		return super.getAnnualIncome() * tax;
		
	}

}
