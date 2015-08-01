package com.bhuwan.java.training.bibek;
import java.util.Scanner;
/**
 * <pre>
 * Wite a HelloWorld Program which takes two argument 
 * a. Salutaion 
 * b. Full Name and 
 * c. Display Salutation Full Name in console.
 * </pre>
 * 
 * @author bibek<sacharya186@gmail.com>
 *
 */
public class HelloWorld {
	public static void main(String[] args){
		String salutation, fullName ;
		Scanner input=new Scanner (System.in);
		System.out.println("Enter salutation::");
		salutation= input.nextLine();
		System.out.println("Enter your Full Name::");
		fullName= input.nextLine();
		display(salutation, fullName);		
		
	}

	private static void display(String salutation, String fullName) {
		System.out.println("Hello!" + salutation + fullName );
	}

}
