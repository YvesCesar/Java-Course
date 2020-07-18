package entities;

public class PhysicalPerson extends Person {
	private Double healthSpending;
	
	public PhysicalPerson() { super(); }
	
	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double calculateTax() {
		
		double tax = 0.00;
		double discount = 0.00;
		
		if ( super.getAnnualIncome() < 20000.00 ) {
			tax = 0.15;
		}
		else {
			tax = 0.25;
		}
		
		if ( healthSpending > 0.00 ) {
			discount = healthSpending * 0.50;
		}
		 
		return super.getAnnualIncome() * tax - discount;
	}

}
