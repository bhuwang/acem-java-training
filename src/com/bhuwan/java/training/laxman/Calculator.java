package com.bhuwan.java.training.laxman;

import java.util.Scanner;

/**
 * * <pre>
 *write a program using switch statement to develop a simple calculator for +, -, *, /, and % operators.
 *</pre>
 * @author laxman <lkhanal56@gmail.com>
 */
public class Calculator {
	
	public static void main(String[] arg){
		int a,b,i;
		double result=0;
		Scanner in= new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Mod");
		System.out.println("Make your choice");
		i=in.nextInt();
		System.out.println("Enter the first number");
		a=in.nextInt();
		System.out.println("Enter the second number");
		b=in.nextInt();
		
		switch(i){
		case 1:
			result=a+b;
			break;
			
		case 2:
			result=a-b;
			break;
			
		case 3:
			result=a*b;
			break;
			
		case 4:
			if(b==0)//when denominator becomes zero
            {
                System.out.println("DIVISION NOT POSSIBLE");
                break;
            }
			result=a/b;
			break;
		
		case 5:
			result=a%b;
			break;
		}
		in.close();
		System.out.println("The result is  "+ result);
		
	}
	
	
	
}
