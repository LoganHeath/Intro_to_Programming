/*
Author: Logan Heath
Date: 2/11/19
*/
class Ex_7_23 {
	public static void main(String[] args) {
	// Declare Array
		boolean[] uhh = new boolean[100];
		int l = 0;
		
	// Populate Array Elements
		for (int ind = 1; ind < 100; ind++) {
			l = ind;
			while (l < 100) {
				uhh[l] = !uhh[l];
				l = l + ind + 1;
		}
		}
	// Search Through Array
		System.out.println("The lockers still open are: ");
		for (int ind = 1; ind < 100; ind++) {
			if (uhh[ind] == true) {
				System.out.print(ind + " ");
			}
		}
	}

	}

