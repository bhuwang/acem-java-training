package com.bhuwan.java.training.madan;

import java.util.Scanner;

/**<pre>
 *SimpleCalculator.java
 *
 *a simple calculator for +,-,*,/and % operator using switch operation
 *
 *Aug 1, 2015 6:45:13 PM
 * @author madandhungana@gmail.com
 *
 *</pre>
 */
public class SimpleCalculator {
	
	
	public static void main(String []args){
		
		String operator;
		double a;
		double b;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		a=input.nextDouble();
		System.out.println("Enter Second Number");
		b=input.nextDouble();
		System.out.println("Enter one operator among: +,-,*,/,%");
		operator=input.next();
		
		SimpleCalculator cal=new SimpleCalculator();
		cal.calculator(a,b,operator);
			
		input.close();
		
	}
	
	
	public   void calculator( double a, double b, String operator ){
		/*Method to for calculating result according to user's input operator */
		double result = 0;
		switch(operator){
		case "+": 
			result=a+b;
			System.out.println("The result of "+a+" "+operator+" "+b+" "+" is " +result);
			break;
		case "-": 
			result=a-b;
			System.out.println("The result of "+a+" "+operator+" "+b+" "+" is " +result);
			break;
		case "*": 
			result=a*b;
			System.out.println("The result of "+a+" "+operator+" "+b+" "+" is " +result);
			break;
		case "/": 
			result=a/b;
			System.out.println("The result of "+a+" "+operator+" "+b+" "+" is " +result);
			break;
		case "%": 
			result=a%b;
			System.out.println("The result of "+a+" "+operator+" "+b+" "+" is " +result);
			break;
		default:
			System.out.println("Invalid operator");
			break;
		
		}
	}

}
