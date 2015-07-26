/**
 * 
 */
package com.bhuwan.java.training.abhishekpokhrel;

import java.util.Scanner;

/**
 * Write a hello world program which takes two argument 
a. Salutation 
b. Full Name and 
c. Display Salutation
Full Name in console. 
*@author Abhishek
 */
public class HelloWorldDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your salutation:");
		Scanner scanner=new Scanner(System.in);
		String salu=scanner.nextLine();
		System.out.println("Enter your name:");
		String name=scanner.nextLine();
		System.out.println(salu + name);
		scanner.close();
		
	}

}
