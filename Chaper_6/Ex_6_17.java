/*
Author: Logan Heath
Date: 12/18/18
*/

import java.util.Scanner;
class Ex_6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
	}
	
	
		public static void printMatrix(int n) {
	for (int p = 0; p < n; p++) {
		for (int e = 0; e < n; e++) {
			System.out.print(intRandom(0, 1) + "  ");
		}
		System.out.println();
		
	}
	
}

public static int intRandom(int toplim, int botlim) {
	return (int) (botlim + Math.random() * (toplim - botlim + 1));
}
}
