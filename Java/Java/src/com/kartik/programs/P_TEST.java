package com.kartik.programs;

import java.lang.reflect.Array;
import java.lang.Math;

import com.sun.corba.se.impl.orbutil.closure.Constant;

/**
 * @author Kartik Kannapur
 *
 */

public class P_TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		System.out.println(1 + 1);
		
		String[] helloWorld = {"Hello", "World", "Kartik"};
		System.out.println(helloWorld[2]);
		
		System.out.println("Hello" + 2);
		
//		double x = 232.6;
		
		int[] nums = new int[7];
		nums[0] = 55;
		System.out.println(nums.toString());
		
		
		//Type Casting
		double xx = 5.6667;
		int xxx = (int) xx;
		System.out.println(xxx);
		
		System.out.println(Math.PI);
		
		int x = 7;
		int y = x;
		x = 2;
		System.out.println(x + ", " + y);
		
		
		}

}
