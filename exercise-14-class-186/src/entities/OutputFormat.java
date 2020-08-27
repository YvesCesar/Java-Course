package entities;

public class OutputFormat {
	private String name;
	private Double price;
	private Integer quantity;
	
	public OutputFormat(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	private Double totalValue() {
		return price * quantity;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name + ", ");
		sb.append(String.format("%.2f", totalValue()));
		
		return sb.toString();
	}
	
}
