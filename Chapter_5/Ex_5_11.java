/*
Author: Logan Heath
Date: 11/15/18
*/

import java.util.Scanner;
class Ex_5_11 {
	public static void main(String[] args){
		int num = 100;
		int count = 0;
		
		do {
			if (num % 5 == 0 ^ num % 6 == 0){
				System.out.print(num + " ");
				count++;
		
			}
			if (count == 10){
				System.out.println();
				count = 0;
			}
			num++;
		}
		while (num <= 200);
	}
}

