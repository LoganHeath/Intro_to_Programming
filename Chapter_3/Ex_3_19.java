/*
Author: Logan Heath
Date: 10/17/18
*/

import java.util.Scanner;
class Ex_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three edges for the triangle: ");
		double e1 = input.nextDouble();
		double e2 = input.nextDouble();
		double e3 = input.nextDouble();
		
		if (e1 + e2 > e3 && e1 + e3 > e2 && e2 +e3 > e1) {
			System.out.print("The perimeter is " + (e1 + e2 + e3));
		}
		else
		{
			System.out.print("The input is not valid");
			System.exit(0);
		}
	}
}