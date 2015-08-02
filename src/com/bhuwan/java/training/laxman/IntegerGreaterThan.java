package com.bhuwan.java.training.laxman;

/**
 * * <pre>
 *Write a program to find the number of and sum of all integers greater than 100 and
 * less than 200 that are divisible by 7.

 *</pre>
 * @author laxman <lkhanal56@gmail.com>
 */

public class IntegerGreaterThan {

	public static void main(String[] args) {
		int count=0,sum=0;
		// TODO Auto-generated method stub
		for(int i=101;i<200;i++){
			if(i%7 == 0){
				count++;
				sum+=i;
			}
		}
		System.out.println("Total numbers divisible by 7 are: " +count +"  and sum : "+ sum );
	}

}
