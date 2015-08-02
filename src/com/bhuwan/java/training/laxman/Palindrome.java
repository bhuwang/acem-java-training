package com.bhuwan.java.training.laxman;

import java.util.Scanner;

/**
 * * <pre>
 *A palindrome is a sequence of characters that reads the same backward as forward. 
 *For example, each of the following five-digit integers is a palindrome: 
 *12321, 55555, 45554 and 11611. Write an application that reads in a five-digit
 * integer and determines whether it is a palindrome. If the number is not five 
 * digits long, display an error message and allow the user to enter a new value.
 *</pre>
 * @author laxman <lkhanal56@gmail.com>
 */

public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,length,remainder,rev=0,n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a five digit number");
		num = in.nextInt();
		length = (int) (Math.log10(num)+1);
		System.out.println(length);
		n=num;
		
		while(length != 5){
			System.out.println("Sorry the input must be five digit number");
			System.out.println("Enter a five digit number");
			num = in.nextInt();
			length = (int) (Math.log10(num)+1);
			System.out.println(length);
		}
		
		while(num>0){
			remainder = num%10;
			rev = rev*10 + remainder;
			num = num/10;
		}
		
		if(rev == n)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " isn't a palindrome");
		in.close();
	}

}
