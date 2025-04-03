package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented: ");
		int room = sc.nextInt();
		
		
		
		Hotel[] rentedRoom = new Hotel[10];
		
		for (int i = 0; i < room; i++) {
			
			System.out.printf("Rent #%d%n", i+1);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int occupation = sc.nextInt();
			
			rentedRoom[occupation] = new Hotel(name, email, occupation);
			System.out.println();
		}
		
		System.out.println("Busy rooms");
		
		for (int i = 0; i < rentedRoom.length; i++) {
			if(rentedRoom[i] != null) {
				System.out.println(rentedRoom[i]);
			}
		}
		
		sc.close();
	}

}
