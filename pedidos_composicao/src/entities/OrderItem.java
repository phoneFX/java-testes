package entities;

public class OrderItem {

	private Integer qtd;
	private Double price;
	private Product product;
	 
	 public OrderItem() {
	}

	public OrderItem(Integer qtd, Double price, Product product) {
		this.qtd = qtd;
		this.price = price;
		this.product = product;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public Double subTotal() {
		return price = qtd*price;
	}
	
	
	
	
	
}
