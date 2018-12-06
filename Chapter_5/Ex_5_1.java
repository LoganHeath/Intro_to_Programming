import java.util.Scanner;
class Ex_5_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int posnum = 0;
		int negnum= 0;
		double total = 0;
		
		System.out.print("Input a number that is not 0: ");
		int num = input.nextInt();

		if (num == 0) {
			System.out.println("Try entering a different number");
			System.exit(1);
		}
		
		while (num != 0) {
			if (num > 0)
				posnum++;
			else {
				negnum++;
			}
			count++;
			System.out.print("Enter a positive or negative number or press 0 to exit: ");
			num = input.nextInt();
			}
			
			System.out.println("The amount of positives is " + posnum);
			System.out.println("The amount of negatives is " + negnum);
			System.out.println("The total amount of numbers is " + count);
	}
	}