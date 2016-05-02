package com.kartik.programs;

import com.kartik.programs.C003_Dog;
/**
 * @author Kartik Kannapur
 *
 */


public class P003_Working_with_Classes {

	/**
	 * This class is an instance of the Dog() class
	 * @param args
	 */
	public static void main(String[] args) {
		C003_Dog my_dog = new C003_Dog();
		my_dog.breed = "Labrador";
		my_dog.color = "Black";
		my_dog.name = "Simba";
		my_dog.size = 3;
		
		my_dog.bark();
		my_dog.notice();
		my_dog.attributes();
		
		System.out.println("COMPLETED");
	}

}
