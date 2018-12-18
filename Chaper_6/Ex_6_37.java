/*
Author: Logan Heath
Date: 12/18/18
*/

import java.util.Scanner;
class Ex_6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number and its width: ");
		
		int digit = input.nextInt();
		int width = input.nextInt();

		System.out.println(digit + " when changed to the width " + width + " is: " + format(digit, width));
	}
		public static String format(int number, int width) {
			String num = number + "";
			if (num.length() < width) {
				for (int x = width - num.length(); x > 0; x--) {
					num = 0 + num;
				}
			}
			
			return num;
			
		}
}