package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double area() {
		return this.width * this.height;
	}  
	
	public double perimeter() {
		return (this.width + this.height) * 2;
	}
	
	public double diagonal() {
		double x;
		x = Math.sqrt( Math.pow(this.width, 2) + Math.pow(this.height, 2) );
		
		return x;
	}
	
	public String toString() {
		
		return "AREA = " + String.format("%.2f", area()) + "\n" +
				"PERIMETER = " + String.format("%.2f", perimeter()) + "\n" +
				"DIAGONAL = " + String.format("%.2f", diagonal());
	}
}
