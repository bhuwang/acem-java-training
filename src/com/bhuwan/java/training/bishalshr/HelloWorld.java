/**
 * 
 */
package com.bhuwan.java.training.bishalshr;

import java.util.Scanner;

/**
 * <pre>
 * Write a hello world program which takes two argument 
 * a. Salutaion 
 * b. Full Name and 
 * c. Display Salutation Full Name in console.
 * </pre>
 *  * @author stha
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nam,sal;
		
		Scanner input=new Scanner(System.in);
				
		System.out.print("Enter Salutation:");
		sal=input.next();
		
		System.out.print("Enter name:");
		nam=input.next();
		
		System.out.println(sal+" "+nam);
		input.close();
	}

}
