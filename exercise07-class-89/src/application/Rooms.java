package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Rooms {
	public static final int TOTAL_ROOMS = 10;
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int quantity = sc.nextInt();
		
		Rent[] rent = new Rent[TOTAL_ROOMS];
		
		if ( quantity >= 1 && quantity <= TOTAL_ROOMS ) {
			
			for(int i=0; i < quantity; i++) {
				System.out.println();
				System.out.printf("Rent #%d\n", i + 1 );
				
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				
				rent[room] = new Rent( name, email );
				
			}
			
			System.out.println();
			System.out.println("Busy rooms: ");
			for ( int i=0; i < TOTAL_ROOMS; i++ ) {
				
				if ( rent[i] != null ) {
					System.out.println( i + ": " + rent[i].toString());
				}
			}
			
		} else {
			System.out.println("ERROR! check the value and try again.");
		}
			
		
		sc.close();
	}

}
