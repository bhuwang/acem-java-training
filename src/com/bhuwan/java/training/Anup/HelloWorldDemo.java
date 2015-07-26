

package com.bhuwan.java.training.Anup;

import java.util.Scanner;
/* Write a hello world program which takes two argument 
a. Salutation 
b. Full Name and 
c. Display Salutation Full Name in console.*/

public class HelloWorldDemo {

	 public static void main(String[] args){
		System.out.println("Enter your Salutation");
		Scanner scanner= new Scanner(System.in);
		String salu= scanner.nextLine();
		System.out.println("Enter your name");
		String name= scanner.nextLine();
		System.out.println(salu + name);
		scanner.close();
	 }
}