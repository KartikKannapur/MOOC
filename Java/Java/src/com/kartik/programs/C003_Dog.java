/**
 * 
 */
package com.kartik.programs;

/**
 * @author Kartik Kannapur
 *
 */
public class C003_Dog {

	/**
	 * This 
	 * @param args
	 */
	int size;
	String breed;
	String name;
	String color;
	
	void bark() {
		System.out.println("Ruff! Ruff!");
	}
	
	void notice() {
		System.out.println("Now that I have barked, here are my attributes: ");
	}
	
	void attributes() {
		System.out.println("Size: " + size);
		System.out.println("Breed: " + breed);
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		
	}
	
}
