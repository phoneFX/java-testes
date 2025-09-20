package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusOrder;

public class Order {
	
	SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment = new Date();
	private StatusOrder status;
	private Cliente cliente;
	
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(StatusOrder status, Cliente cliente) {
		this.status = status;
		this.cliente = cliente;
	}
	

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusOrder getStatus() {
		return status;
	}

	public void setStatus(StatusOrder status) {
		this.status = status;
	}
	
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		
		Double totalPrice = 0.0;
		
		for(OrderItem i : items ) {
			 totalPrice =+ i.getPrice();
		}
		
		return totalPrice;
	}
	
	
	public String toString() {
		
		SimpleDateFormat  fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		SimpleDateFormat  fmt2 = new SimpleDateFormat("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + fmt.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Cliente: " + cliente.getName() + " ");
		
		sb.append("(" + fmt2.format(cliente.getBirthDate()) + ") - ");
		sb.append(cliente.getEmail() + "\n");
		sb.append("Order items \n");
		
		for(OrderItem item : items) {
			sb.append(item.getProduct().getName() + ", $");
			sb.append(item.getPrice() + ", ");
			sb.append("Qtd: " + item.getQtd() + ", ");
			sb.append("Subtotal: " + item.subTotal());
		}
		
		return sb.toString();
		
	}
	
	

}
