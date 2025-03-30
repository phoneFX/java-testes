package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Who many numbers will be inserted: ");
		int n = sc.nextInt();
		
		if(n > 10){
			System.out.println("Max of 10 numbers can be entered");
			n = 10;
			System.out.println("The quantity is adjusted to 10!");
		}
		
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter the number: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Negative numbers:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		
		sc.close();
	}

}
