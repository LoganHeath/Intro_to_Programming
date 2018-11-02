/*
Author: Logan Heath
Date: 11/1/18
*/

import java.util.Scanner;
class Ex_4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

System.out.print("Enter employee's name: ");
String name = input.nextLine();
System.out.print("Enter number of hours worked in a week: ");
double hrs = input.nextDouble();
System.out.print("Enter hourly pay rate: ");
double payrt = input.nextDouble();
System.out.print("Enter federal tax withholding rate: ");
double fedtax = input.nextDouble();
System.out.print("Enter state tax withholding rate: ");
double statax = input.nextDouble();

System.out.println("Employee name: " + name);
System.out.println("Hours worked: " + hrs);
System.out.println("Pay rate: $" + payrt);
System.out.println("Gross pay: $" + payrt * hrs);
System.out.println("Deduction: ");
System.out.printf("Federal tax withholding rate (%.1f%%): $%.2f\n", fedtax * 100, fedtax * payrt * hrs);
System.out.printf("State tax withholding rate (%.1f%%): $%.2f\n", statax * 100, statax * payrt * hrs);
System.out.printf("Total deduction : $%.2f\n", (statax + fedtax) * payrt * hrs);
System.out.printf("Net pay: $%.2f\n", (1 - statax - fedtax) * payrt * hrs);
	}
}