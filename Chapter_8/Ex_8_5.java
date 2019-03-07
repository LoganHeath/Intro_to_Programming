/*
Author: Logan Heath
Date: 2/22/2019
*/
import java.util.Scanner;
class Ex_8_5 {
	public static void main(String[] args) {
		// Declare Variables
		Scanner input = new Scanner(System.in);
		double oj[][] = new double[3][3];
		double aj[][] = new double[3][3];
		double oreos[][] = new double[3][3];
		
		// Prompt User for Matrix A
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for " + (row + 1) + " for Matrix A: ");
				
			for (int col = 0; col <= 2; col++) {
				oj[row][col] = input.nextDouble();
			}
		}
				
		// Prompt User for Matrix B
		for (int row = 0; row < 3; row++) {
					System.out.print("Enter 3 numbers for " + (row + 1) + " for Matrix B: ");
			for (int col = 0; col <= 2; col++) {
				aj[row][col] = input.nextDouble();
				
			}
		}
		
		oreos = addMatrix(oj, aj);
		// Print before matrix
		for (int row = 0; row < oreos.length; row++) {
			// Print start of row
			for (int col = 0; col < oreos[0].length; col++) {
				System.out.print(oreos[row][col] + " ");
			}
		}
	}
			
	public static double[][] addMatrix(double[][] a, double [][] b) {
		double[][] c = new double[3][3];
		
		for (int r = 0; r < c.length; r++) {
			for (int cl = 0; cl < c[0].length; cl++) {
				c[r][cl] = a[r][cl] + b[r][cl];
				
			}
		}
			
		return c;
	}
}