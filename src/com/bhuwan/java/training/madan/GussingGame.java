package com.bhuwan.java.training.madan;

import java.util.Random;
import java.util.Scanner;

/**
 *GussingGame.java
 *
 *a Guessing a number game application
 *
 *Aug 2, 2015 1:02:18 PM
 * @author madandhungana@gmail.com
 *
 *
 */
public class GussingGame {
	
	public static void main(String []args){

		int num;
		int rand;
		int i=1;
		Scanner input=new Scanner(System.in);
		GussingGame guess= new GussingGame();
		
		System.out.println("Guess a number and enter");
		num=input.nextInt();
		
		
		rand=guess.randInt(1, 100);
		
		while(!(num==rand)){
			i=i++;
			System.out.println("Guess another number and enter");
			num=input.nextInt();
			rand=guess.randInt(1, 100);
		}
		
		System.out.println("Congratulation!!!!!!!!");
		System.out.println("Random Number is: "+ rand +"and Guessed Number is: "+num+
				"and Number of iteration is: "+i);
		input.close();
		
	}
	
	
	public int randInt(int min, int max) {

	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
