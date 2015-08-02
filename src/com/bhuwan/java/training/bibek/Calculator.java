package com.bhuwan.java.training.bibek;
import java.util.Scanner;
/** 
 * <pre>
 * Write a program using switch statement to develop a simple calculator
 *  for +, -, *, /, and % operators.
 *  </pre>
 * @author bibek<sacharya186@gmail.com>
 *
 */


public class Calculator {
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		String symbol;
		double n1,n2,result = 0;
		System.out.println("Enter first number:");
		n1=input.nextDouble();
		System.out.println("Enter second number:");
		n2=input.nextDouble();
		System.out.println("Enter the symbol for operation you want to do:");
		symbol=input.next();
		switch(symbol){
		case "+" :
			result=n1+n2;
			break;
		case "-" :
			result=n1-n2;
			break;
		case "*" :
			result=n1*n2;
			break;	
		case "/" :
			result=n1/n2;
			break;	
		case "%" :
			result=n1%n2;
			break;	
		}
		System.out.println("The result is:"+ result);
		
	}

}
