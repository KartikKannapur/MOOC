/**
 * 
 */
package com.kartik.programs;

/**
 * @author Kartik Kannapur
 *
 * Programs:
 * 1. Check if the given integer is Odd or Even
 * 2. Sum of Odd and Even integers
 * 3. Check if the given integer is Positive or Negative
 * 4. Swapping two numbers
 * 5. Sum of digits in a number
 */


public class P002_Integers {
	
	//Program 1
	public static void m1_odd_even(String args) {
		System.out.println("Program 1: Check if the given integer is Odd or Even");
		System.out.println("Input Number: " + args);
		
		if (Integer.parseInt(args) % 2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	
	
	//Program 2
	public static void m2_sum_of_even_odd(String[] args) {
//		System.out.println(args);
		System.out.println("Program 2: Sum of Odd and Even integers");
		
		System.out.println();

		int sum_even_numbers = 0;
		int sum_odd_numbers = 0;
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
			//Even Number
			if (Integer.parseInt(args[i]) % 2 == 0) {
//				System.out.println("Even Number");
				sum_even_numbers += Integer.parseInt(args[i]);
			}
			//Odd Number
			else {
//				System.out.println("Odd Number");
				sum_odd_numbers += Integer.parseInt(args[i]);
			}
			
		}
		
		System.out.println("Output:");
		System.out.println("Sum of Even Numbers: " + String.valueOf(sum_even_numbers));
		System.out.println("Sum of Odd Numbers: " + String.valueOf(sum_odd_numbers));
	}
	
	
	
	//Program 3
	public static void m3_positive_or_negative(String args) {
		System.out.println("Program 3: Check if the given integer is Positive or Negative");
		
		System.out.println(args);
		if (Integer.parseInt(args) > 0) {
			System.out.println("Positive Number");
		}
		if (Integer.parseInt(args) < 0) {
			System.out.println("Negative Number");
		}
		if (Integer.parseInt(args) == 0) {
			System.out.println("The number you have entered is zero!");
		}
		
		
		
	}
	
	
	
	//Program 4
	public static void m4_swap_numbers(String[] args) {
		System.out.println("Program 4: Swapping two numbers");
		
		System.out.println("Number 1: " + args[0]);
		System.out.println("Number 2: " + args[1]);
		
		int var_num_one = Integer.parseInt(args[0]);
		int var_num_two = Integer.parseInt(args[1]);
		
		int temp_variable;
		
		temp_variable = var_num_two;
		var_num_two = var_num_one;
		var_num_one = temp_variable;
		
		System.out.println("Swapping Done!");
		
		System.out.println("Number 1: " + String.valueOf(var_num_one));
		System.out.println("Number 2: " + String.valueOf(var_num_two));
		
	}
	
	//Program 5
	public static void m5_sum_of_digits_number(String args) {
		System.out.println("Program 5: Sum of digits in a number");
		
		System.out.println("Input Number: " + args);
		int var_number = Integer.parseInt(args);
		int result = 0;
		
		while (var_number > 0) {
			result += var_number%10;
			var_number = var_number/10;
			
		}
		
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		System.out.println(args);
//		m1_odd_even(args[0]); //Input : "20"
//		m2_sum_of_even_odd(args); //Input : 27 40 60 100
//		m3_positive_or_negative(args[0]); //Input : -27
//		m4_swap_numbers(args); //Input : 20 35
		m5_sum_of_digits_number(args[0]); //Input : 12345

	}

}
