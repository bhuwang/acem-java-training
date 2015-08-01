package com.bhuwan.java.training.madan;

import java.util.Scanner;

/**
 * <pre>
 * Write a hello world program which takes two argument 
 * a. Salutation 
 * b. Full Name and 
 * c. Display SalutationFull Name in console.
 * </pre>
 * 
 * @author Madan Dhungana<madandhungana@gmail.com>
 */
public class HelloWorld {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String salu;
		String name;
		
			System.out.println("Enter your njak salutation");
			salu=input.next();
			System.out.println("Enter your full name");
			name=input.next();
			
			System.out.printf("Your name is  "+salu+" "+name);
			

			input.close();
		

	}

}
