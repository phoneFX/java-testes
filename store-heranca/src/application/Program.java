package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> products = new ArrayList<Product>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i): ");
			char r = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble(); 
			
			sc.nextLine();
			
			if(r == 'c') {
				products.add(new Product(name, price));
			}
			else if (r == 'u') {
				System.out.print("Manufacture data (dd/MM/yyyy): ");
				LocalDate date = LocalDate.parse(sc.nextLine(), fdt);
				
				products.add(new UsedProduct(name, price, date));
			} 
			else {
				System.out.print("Custom fee: ");
				Double customFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customFee));
			}
			
		}
		
		System.out.println("Price tag: ");
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();
		
	}

}
