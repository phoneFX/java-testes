package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered: ");
		int registers = sc.nextInt();
		
		List<Employer> employees = new ArrayList<Employer>();
		
		
		
		for (int i = 0; i < registers; i++) {
			
			System.out.printf("Employee #%d%n", i+1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employer(id, name, salary));		
			System.out.println();
		}
		
		System.out.print("Enter the Employee id that will have salary increase: ");
		int id = sc.nextInt();

/**		for (int i = 0; i < registers; i++) {
			if(employees.get(i).getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				employees.get(i).increaseSalary(percentage);
			}
		}		**/
		
		for(Employer employer : employees) {
			if(employer.getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				employer.increaseSalary(percentage);
			}
		}
		
		
		for(Employer employee : employees ) {
			System.out.println(employee);
		}
		
		
		sc.close();

	}

}
