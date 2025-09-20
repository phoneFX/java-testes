package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int l = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int c = sc.nextInt();
		
		int[][] matrix = new int[l][c];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("|Line: %d|Position: %d| :", i,j);
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.print("Enter a number to see some information: ");
		int numberInfo = sc.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == numberInfo) {
					System.out.printf("|Position:%d,%d|%n", i,j);
						if(j > 0) {
							System.out.printf("|Number on the left: %d|%n", matrix[i][j-1]);
						}
						
						if (j < matrix[i].length-1) {
							System.out.printf("|Number on the right: %d|%n", matrix[i][j+1]);
						}
						
						if(i < matrix.length-1) {
							System.out.printf("|Number below: %d|%n", matrix[i+1][j]);
						}
						
						if (i > 0) {
							System.out.printf("|Number up: %d|%n", matrix[i-1][j]);
						}
			}
		}
		
		
		sc.close();
	}
  }
}
