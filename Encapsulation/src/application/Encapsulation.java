package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Encapsulation {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product( name, price);
		
		/**
		 * System.out.print("Quantity in stock: ");
			int quantity = sc.nextInt();
		
			Product product = new Product( name, price, quantity );
		 * */
		
		//Alterar/Obter o valor dos atributos:
		product.setName( "Computer" );
		System.out.println("Updated name: "+ product.getName());
		product.setPrice(1200.0);
		System.out.println("Updated price: " + product.getPrice());
		//product.setQuantity(12);
		//System.out.println("Updated quantity: "+ product.getQuantity());
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}