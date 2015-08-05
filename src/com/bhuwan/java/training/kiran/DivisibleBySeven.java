package com.bhuwan.java.training.kiran;

/**
 * Write a program to find the number of and sum of all integers greater
 * than 100 and less than 200 that are divisible by 7.
 * 
 * @author kiran
 *
 */


public class DivisibleBySeven {

	public static void main(String[] args) {
		
		int number = 0, sum  = 0;
		System.out.println("numbers greater than 100 and less than 200 that are"
				+ " divisible by 7 are :");
		
		for(int i = 101; i < 200; i++){
			if(i%7 == 0){
				number = i;
				sum += i;
				System.out.println(number);
			}	
		}
		System.out.println("sum of all numbers:" + sum);
	}
}
