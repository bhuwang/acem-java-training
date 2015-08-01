package com.bhuwan.java.training.kiran;

import java.util.Scanner;

/**
 *<pre>
 * Write a program using switch statement to develop a simple calculator 
 * for +, -, *, /, and % operators.
 * </pre>
 * 
 * @author kiran
 *
 */


public class Calculator {
	public static void main(String[] args){
		
		System.out.println("Enter any two numbers:");
		Scanner scanner = new Scanner(System.in);
		float value1 = scanner.nextFloat();
		float value2 = scanner.nextFloat();
		
		System.out.println("Select number:");
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n"
				+ "4. Division\n5. Remainder");
		int option = scanner.nextInt();
		
		switch(option){
			case 1:
				System.out.println("Addition between "+ value1 + " and "+value2+
						" is "+(value1+value2));
				break;
			
			case 2:
				System.out.println("Subtraction between "+ value1 + " and "+value2+
						" is "+ (value1-value2));
				break;	
			case 3:
				System.out.println("Multiplication between "+ value1 + " and "+value2+
						" is "+(value1*value2));
				break;
			
			case 4:
				System.out.println("Division between "+ value1 + " and "+value2+
						" is "+(value1/value2));
				break;
			case 5:
				System.out.println("% Calculation between "+ value1 + " and "+value2+
						" is "+(value1%value2));
				break;	
			default:
				System.out.println("please enter specified number");
				
		}
		scanner.close();
	}
}
