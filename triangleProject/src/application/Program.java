package application;

import java.util.Locale; 
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; //Declarando x e y apontando à objetos do tipo Triangle
		//Instâncias: 
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.2f%n", areaX);
		System.out.printf("Triangle Y area: %.2f%n", areaY);
		
		if ( areaX > areaY ) {
			System.out.println("Large Area: X");
		}
		
		else if ( areaX == areaY ) {
			System.out.println("Same Area!");
		}
		
		else {
			System.out.println("Large Area: Y");
		}
		
		sc.close();
	}

}
