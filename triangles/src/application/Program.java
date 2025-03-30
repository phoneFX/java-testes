package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.mathArea();
		double areaY = y.mathArea();
		
		System.out.printf("Show the Area of Triangle X: %.2f%n", areaX);
		System.out.printf("Show thr Area of Triangle Y: %.2f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Higher: X");
		}
		else {
			System.out.println("Higher: Y");			
		}
		
		sc.close();
	}

}
