package application;

import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the numbers of the matrix: ");
		int n = sc.nextInt();
		int negativeNum = 0;
		
		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.printf("|Line: %d Column: %d|  ", i,j);
				matrix[i][j] = sc.nextInt();
			
			}
		}
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Main Diagonal: ");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(i == j) {
					System.out.print(matrix[i][j] + " ");
				}
				
				if (matrix[i][j] < 0) {
					negativeNum += 1;
				}
			
			}
		}
		
		System.out.printf("Negative number: %d", negativeNum);
		
		
		sc.close();

	}

}
