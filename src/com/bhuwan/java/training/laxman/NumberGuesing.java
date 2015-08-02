package com.bhuwan.java.training.laxman;

import java.util.Random;
import java.util.Scanner;

/**
 * * <pre>
 *Write a Guessing a number game application: User will select the guessing value from the keyboard
 *and application will generate a random no between 1 and 100. Check if the guess value matched with 
 *random no. or not, if matched show the guessing value, random value and the no. of attempts
 *</pre>
 * @author laxman <lkhanal56@gmail.com>
 */

public class NumberGuesing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ran_num,guess,high=100,low=1,count=0;
		int[] numbers = new int[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a random number");
		guess = in.nextInt();
		numbers[count]=guess;
		Random r = new Random();
		ran_num = r.nextInt(high-low);
		System.out.println(ran_num);
		while(ran_num!=guess){
			count++;
			numbers[count]=guess;
			System.out.println("Enter a random number");
			guess = in.nextInt();
			if(count>8){
				System.out.println("Sorry You have exceeded the limit");
				break;
			}
				
			 
		}
		System.out.println("The Valid Number Is:\t" + ran_num);
		System.out.println("Number Of Attempts Made \t"+ (count+1));
		System.out.println("Numbers You guessed ");
		for(int i=0;i<numbers.length;i++)
		System.out.print(numbers[i]+"\t");
		in.close();
	}

}
