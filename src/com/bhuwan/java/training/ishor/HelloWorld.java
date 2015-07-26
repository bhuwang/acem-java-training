package com.bhuwan.java.training.ishor;

import java.util.Scanner;

/**
 * <pre>
 * which takes two argument 
a. Salutaion 
b. Full Name and 
c. Display SalutationFull Name in console.
 * </pre>
 * @author user
 *
 */

public class HelloWorld {

	public static void main(String [] arg)
	{
		String n,s;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Salutation");
		s = input.next();
		System.out.print("Enter name:");
		n = input.next();
		System.out.println(s+" "+n);
		input.close();
	}
	
}
