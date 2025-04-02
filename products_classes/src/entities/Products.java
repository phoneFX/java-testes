package entities;

public class Products {
		
	String name;
	private double value;
	private int quantity;
	
	
	public Products(String name, double value, int quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}
	public Products(String name, double value) {
		this.name = name;
		this.value = value;
	
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	
	
	public double totalValueInStock() {
		return value * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String productData() {
		
		return name + ", $ " + 
		String.format("%.2f, ", value) + 
		quantity + " units, Total: $ " + 
		String.format("%.2f", totalValueInStock());
		
	}
	
	
	
	
}
