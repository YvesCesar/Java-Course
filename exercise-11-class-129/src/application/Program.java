package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		
		List<Product> listProducts = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for ( int i = 0; i < n; i++ ) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char response = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if ( response == 'c' ) {
				listProducts.add( new Product(name, price) );
			} 
			else if ( response == 'u' ) {
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String md = sc.nextLine(); 
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date manufactureDate = sdf.parse(md);
				
				listProducts.add( new UsedProduct(name, price, manufactureDate) );
				
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				listProducts.add( new ImportedProduct(name, price, customsFee) );
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for( Product product : listProducts ) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}

}
