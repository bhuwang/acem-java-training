package com.bhuwan.java.training.bibek;
/**
 * <pre>
 * Write a program to find the number of and sum of all integers greater than 
 * 100 and less than 200 that are divisible by 7.
 * </pre>
 * 
 * @author bibek<sacharya186@gmail.com>
 *
 */


public class NumbersDivisibleBySeven {
	public static void main(String[] args){
		int sum=0,a,b=0;
		for(int i=100; i<=200; i++){
			a=i%7;
			if(a==0){
				sum=sum+i;
				b++;
			}
		}
		System.out.println("The number of integers is:"+b);
		System.out.println("The sum of integers between 100 and 200 that are divisible by 7 is: "+sum );
	}

}
