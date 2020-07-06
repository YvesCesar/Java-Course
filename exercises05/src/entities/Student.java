package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public boolean verifyGrades() {
		boolean error = false;
		
		if (this.grade1 > 30) {
			System.out.println("Invalid Value in 1th grade.");
			error = true;
		} 
		
		if (this.grade2 > 35) {
			System.out.println("Invalid Value in 2th grade.");
			error = true;
		}
		
		if (this.grade3 > 35) {
			System.out.println("Invalid Value in 3th grade.");
			error = true;
		}
		return error;
		
	}
	
	public double finalGrade() {
		if ( !( verifyGrades() ) ) {
			return grade1 + grade2 + grade3;
		} else {
			System.out.println("Please, enter again the grades");
			return 0;
		}
	}
	
	public boolean pass() {
		boolean pass;
		
		if ( finalGrade() >= 60 ) {
			pass = true;
		} else {
			pass = false;
		}
		
		return pass;
	}
	
	public String toString() {
		if ( pass() ) {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade()) +
					"\nPASS";
		} else {
			double diference = 60.0 - finalGrade();
			
			return "FINAL GRADE = " + String.format("%.2f",finalGrade()) +
					"\nFAILED\n" 
					+ "MISSING " + String.format("%.2f",diference) + " POINTS";
		}
	}
	
	
}
