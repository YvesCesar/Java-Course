/*
 * 
	Fazer um programa para ler os dados de N figuras (N fornecido
	pelo usuário), e depois mostrar as áreas destas figuras na
	mesma ordem em que foram digitadas.
 *
*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner( System.in );
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for ( int i = 0; i < n; i++ ) {
			
			System.out.println("Shape #" + (i + 1) + " data:");
			
			System.out.print("Resctangle or Circle (r/c)? ");
			char response = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if ( response == 'r' )
			{
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add( new Rectangle(color, width, height));
			}
			else 
			{
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add( new Circle(color, radius) );
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for ( Shape shape : list ) {
			System.out.println(
					String.format("%.2f", shape.area())
			);
		}
		
		sc.close();
	}

}
