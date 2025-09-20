package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.StatusOrder;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date: ");
		Date birthDate = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(name, email, birthDate);
		
		System.out.print("Enter order data: ");
		StatusOrder status = StatusOrder.valueOf(sc.next());
		Order order = new Order(status, cliente);
		
		System.out.print("How many items to this order: ");
		int numberOfItems = sc.nextInt();
		sc.nextLine();
		
		
		for (int i = 1; i <= numberOfItems; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer qtdProduct = sc.nextInt();
			Product product = new Product(productName, productPrice);
			sc.nextLine();
			
			OrderItem orderItem = new OrderItem(qtdProduct, productPrice, product);
			order.addItem(orderItem);
		}
		
		
		
		System.out.println("Order Summary: ");
		System.out.println(order.toString());
		
		sc.close();

	}

}
