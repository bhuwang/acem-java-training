package com.bhuwan.java.training.kiran;
/**
 *<pre>
 * A palindrome is a sequence of characters that reads the same backward as forward.For
 * example, each of the following five-digit integers is a palindrome: 12321, 55555,
 * 45554 and 11611. Write an application that reads in a five-digit integer and 
 * determines whether it is a palindrome. If the number is not five digits long, 
 * display an error message and allow the user to enter a new value.
 * </pre>
 * 
 * @author kiran
 *
 */

import java.util.Scanner;

public class PalindromeCheck {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 5-digit number");
		int number = scanner.nextInt();
		
		while(!(number >= 10000 && number < 100000)){
			System.out.println("number is not 5 digit");
			System.out.println("please enter another number");
			number = scanner.nextInt();
		}
		
		System.out.println("the number is 5 digit");
		int[] temp = new int[5];
		
		for(int i = temp.length-1; i >= 0; i--){
			temp[i] = number % 10;
			number = number / 10;
//			System.out.println(temp[i]);
		}
		
		if(temp[0] == temp[4] && temp[1]==temp[3])
			System.out.println("The entered number is palindrome");
		else
			System.out.println("The entered number is not palindrome");
		
		scanner.close();
	}
}
