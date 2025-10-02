package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourceEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		List<Employee> employees = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("OutSourced(y/n): ");
			String ans = sc.next();
			
			sc.nextLine();
			
			if(ans.equals("y")) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per Hour: ");
				Double valuerPerHour = sc.nextDouble();
				
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				
				Employee outSourceEmployee = new OutSourceEmployee(name, hours, valuerPerHour, additionalCharge);
				employees.add(outSourceEmployee);
				
			}
			else {
				
				System.out.print("Name: ");
				String name = sc.nextLine();
				
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				
				System.out.print("Value per Hour: ");
				Double valuerPerHour = sc.nextDouble();
				
				Employee employee = new Employee(name, hours, valuerPerHour);
				employees.add(employee);
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		for(Employee employee : employees) {
			System.out.println("$" + employee.getName() + " - " + employee.payment());
		}
		
		
		sc.close();
	}

}
