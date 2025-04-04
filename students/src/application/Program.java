package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.School;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many students will be registered: ");
		int n = sc.nextInt();
		System.out.println();
		School[] student = new School[n];
		
		for (int i = 0; i < student.length; i++) {
			sc.nextLine();
			System.out.print("Enter the student's name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter the first grade: ");
			double firstGrade = sc.nextDouble();
			
			System.out.print("Enter the second grade: ");
			double secondGrade = sc.nextDouble();
			System.out.println();
			
			student[i] = new School(name, firstGrade, secondGrade);
		}
		
		System.out.println("Approved Students: ");
		for (int i = 0; i < student.length; i++) {
			student[i].approvedStudents();		
		}
		
		sc.close();
	}

}
