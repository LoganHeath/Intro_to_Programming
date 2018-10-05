/*
Author: Logan Heath
Date: 10/5/18
*/
import java.util.Scanner;
class Ex_2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a degree celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0/5) * celsius + 32;
		System.out.println(celsius + "degree celsius is equal to" + fahrenheit + "in fahrenheit");
	}
}