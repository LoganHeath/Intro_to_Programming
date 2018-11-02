/*
Author: Logan Heath
Date: 10/19/18
*/

import java.util.Scanner;
class Ex_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the x value: ");
		double x = input.nextDouble();
		System.out.print("Enter the y value: ");
		double y = input.nextDouble();
		
		String s = " ";
		s = " not ";
		
		if (Math.abs(x) > 5 || Math.abs(y) > 2.5) {
			System.out.print("Point (" + x + ", " + y + ") is" + s + "in the rectangle");
		}
		else {
			System.out.print("Point (" + x + ", " + y + ") is in the rectangle");

		}
	}
}