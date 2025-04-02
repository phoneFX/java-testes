package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("value: ");
		double value = sc.nextDouble();
		
		
		Products product = new Products(name, value);
		
		
		
		System.out.println("Product data: " +  product.productData());
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		int addQuantity = sc.nextInt();
		product.addProducts(addQuantity);
		System.out.println();
		product.setName("Computaria"); 
		
		System.out.println("Name update: " + product.getName());
		
		System.out.println("Update data: " +  product.productData());
	
		System.out.print("Enter the number of products to be removed from stock: ");
		int reQuantity = sc.nextInt();
		product.removeProducts(reQuantity);
		System.out.println();
		System.out.println("Update data: " +  product.productData());
		
		sc.close();
	}

}
