package entities;

public class Product {
	
	//Encapsulando:
	String name;
	private double price;
	private int quantity;
	
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
	
	//Por convenção, os métodos getters e setters são colocados depois dos construtores:
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice( double price ) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	/* Para o problema, não se faz necessário alterar a quantidade.
	public void setQuantity( int quantity ) {
		this.quantity = quantity;
	}
	
	*/
	
	//Operações:
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
