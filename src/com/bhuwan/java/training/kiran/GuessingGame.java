package com.bhuwan.java.training.kiran;

import java.util.Random;
import java.util.Scanner;

/**
 *<pre>
 * Write a Guessing a number game application: User will select the guessing
 * value from the keyboard and application will generate a random no between 
 * 1 and 100. Check if the guess value matched with random no. or not, if
 * matched show the guessing value, random value and the no. of attempts.
 * </pre>
 * 
 * @author kiran
 *
 */


public class GuessingGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome in Guessing number game application");
		Random random = new Random();
		int low = 1, high = 100, numOfAttempt = 0, guessNumber;
		
		//Generating random number between 1 and 100
		int randomNum = random.nextInt(high - low) + low;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number :");
		guessNumber = scanner.nextInt();
		
		while( guessNumber != randomNum ){
			
			System.out.println("number doesnot match! enter another number :");
			guessNumber = scanner.nextInt();
			numOfAttempt++;
			
			// Giving maximum attempt to 10 times
			if( numOfAttempt == 10 ){
				System.out.println("Attempts Over!!!!");
				System.out.println("Random Number is " + randomNum);
				System.out.println("Number of Attempts is " + numOfAttempt);
				break;
			}	
		}
		
		if( guessNumber == randomNum ){
			System.out.println("Guessing Value : " + guessNumber +
					"\n Random Number : " + randomNum +
					"\n Number of Attempts : " + numOfAttempt);
		}
		
		scanner.close();
	}
}
