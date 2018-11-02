/*
Author: Logan Heath
Date: 10/17/18
*/

import java.util.Scanner;

class Ex_3_3 {
	public static void main(String[] args) {
		// Declare variables
		Scanner input = new Scanner(System.in);
		double a, b, c, d, e, f, x, y, num1, num2, denom;
		
		// Prompt the user
		System.out.print ("Enter a, b, c, d, e, and f: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		
		// Solve for x and y
		num1 = ((e * d) - (b * f));
		num2 = ((a * f) - (e * c));
		denom = ((a * d) - (b * c));
		
		x = num1 / denom;
		y = num2 / denom;
		
		// Check the denominator is not zero
		if (denom == 0) {
			System.out.println("Cannot divide by zero");
		}
		else {System.out.println("x = " + x + " and y = " + y);
		
		}
	}
}