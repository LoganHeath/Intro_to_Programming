/*
Author: Logan Heath
Date: 3/4/19
*/

import java.util.Scanner;
class Ex_8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				int right = 0;
				
				// Display Capital
				for (int jon = 0; jon < capitals.length; jon++) {
					System.out.print("What's the capital of " + capitals[jon][0]+"? ");
					
					// User Input
					String garfield = input.nextLine();
					if (garfield.equalsIgnoreCase(capitals[jon][1])) {
						
						// Answer
						right++;
						System.out.println("You're right!");
						} 
					else {
						System.out.println("That is incorrect, the right answer is " + capitals[jon][1]);
					}
				}
			System.out.println("The correct count is " + right);
	}
			public static String[][] capitals = {
							{"Hawaii", "Honolulu"},
							{"California", "Sacramento"},
							{"Alabama", "Montgomery"},
							{"Colorado", "Denver"},
							{"Arizona", "Phoenix"},
							{"Iowa", "Des Moines"},
							{"Alaska", "Juneau"},
							{"Utah", "Salt Lake City"},
							{"Florida", "Tallahassee"},
							{"New York", "New York"},
					};
}