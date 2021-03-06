package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//Definindo um construtor para a Classe:
	public Product( String name, double price, int quantity ) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Definindo uma sobrecarga:
	public Product( String name, double price ) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts( int quantity ) {
		this.quantity += quantity; 
	}
	
	public void removeProducts( int quantity ) {
		this.quantity -= quantity;
	}
	
	//Sobrepondo a operação toString padrão do Object
	public String toString() {
		return this.name +
			   ", $ "
				+ String.format("%.2f", this.price) //Formatando price para duas casas decimais
				+ ", "
				+ this.quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
