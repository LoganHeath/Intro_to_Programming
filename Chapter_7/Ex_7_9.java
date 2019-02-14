/*
Author: Logan Heath
Date: 2/7/2019

Find the minimum element of an array
*/
import java.util.Scanner;
class Ex_7_9 {
	public static void main(String[] args) {
		// Declare Scanner and Array
		Scanner input = new Scanner(System.in);
		double[] cookie = new double[10];
		
		// Populate Array Elements
		System.out.print("Enter 10 double values: ");
		for (int index = 0; index < 10; index++) {
			cookie[index] = input.nextDouble();
		}
		
		// Call the Min Method and Display
		System.out.println("The minimum element is " + min(cookie));
	}
	
	public static double min(double[] array) {
		double min = array[0];
		
		// Search Through Array
		for (int i = 1; i < 10; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		// Return Min
		return min;
	}
}