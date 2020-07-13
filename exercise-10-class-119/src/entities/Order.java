package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {}

	public Order(Date moment, OrderStatus status, Client client, List<OrderItem> orderItem) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.orderItem = orderItem;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	public void addItem( OrderItem item ) {
		orderItem.add(item);
	}
	public void removeItem( OrderItem item ) {
		orderItem.remove(item);
	}
	
	public Double total() 
	{
		double sum = 0;
		
		for ( OrderItem item : orderItem ) {
			sum += item.subTotal();
		}
		
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf2.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName());
		sb.append(" (" + sdf.format(client.getBirthDate()));
		sb.append(") - " + client.getEmail() + "\n");
		sb.append("Order items:\n");
		
		for ( OrderItem item : orderItem ) 
		{
			sb.append(item.getProduct().getName() + ", $");
			sb.append(String.format("%.2f", item.getPrice()) + ", ");
			sb.append("Quantity: " + item.getQuantity());
			sb.append(", Subtotal " + String.format("%.2f", item.subTotal()) + "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		
		return sb.toString();
	}
	
	
}
