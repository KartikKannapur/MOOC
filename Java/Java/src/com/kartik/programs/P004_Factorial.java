/**
 * 
 */
package com.kartik.programs;

import java.io.Reader;
import java.util.Scanner;

/**
 * @author Kartik Kannapur
 *
 */
public class P004_Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Takes in integer as the input, for which we need to find the factorial
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input_num = reader.nextInt();
		
		System.out.println("The number you have entered is: " + input_num);
		
		int fact_total = factorial(input_num);
		System.out.println("The factorial of the number is: " + fact_total);
		

	}
	
	private static int factorial(int factorial_num) {
		int total = 1;
		
		if (factorial_num == 0) {
			return 1;
		}
		else {
			for (int i = 1; i <= factorial_num; i++) {
				total *= i;
			}
			return total;
		}
		
	}

}
