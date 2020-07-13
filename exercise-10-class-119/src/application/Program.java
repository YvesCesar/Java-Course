/*
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date().
*/

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault( Locale.US );
		Scanner sc = new Scanner( System.in );
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Order order = new Order();
		
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthday = sc.nextLine();
		
		Client client = new Client( name, email, sdf.parse(birthday) );
		order.setClient(client);
		
		System.out.println("Enter order data:");
		
		System.out.print("Status: ");
		String status = sc.nextLine();
		order.setStatus(OrderStatus.valueOf(status));
		System.out.print("How many items to this order? ");
		int itemsQuantity = sc.nextInt();
		
		for ( int i = 0; i < itemsQuantity; i++ ) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem( productQuantity, productPrice, new Product( productName, productPrice ) );
			
			order.addItem(orderItem);
		}
		
		Date moment = new Date();
		
		order.setMoment(moment);
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
