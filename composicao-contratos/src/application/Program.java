package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		System.out.print("Enter Departament's name: ");
		String nameDepartament = sc.nextLine();
		
		
		
		System.out.println("Enter the worker data:");
		System.out.print("Name: ");
		String nameWorker = sc.nextLine();
		System.out.print("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		System.out.print("Base salary: ");
		double salary = sc.nextDouble();
		
		
		Worker worker = new Worker(nameWorker, level, salary, new Departament(nameDepartament));
		
		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = sc.nextInt();
		
		
		
		for (int i = 0; i < numberOfContracts; i++) {
			
			System.out.println();
			System.out.printf("Enter contract #%d data: %n", i+1);
			System.out.print("Date (dd/MM/yyyy): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			Double value = sc.nextDouble();
			System.out.print("Duration (Hours): ");
			Integer hour = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, value, hour);
			
			worker.addContract(contract);
			
		}
		System.out.println();
		
		System.out.print("Enter the month and year to calculate income (MM/yyyy): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament" + worker.getDepartament().getName());
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		
		sc.close();

	}

}
