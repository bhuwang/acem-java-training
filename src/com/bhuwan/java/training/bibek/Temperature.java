package com.bhuwan.java.training.bibek;
/**
 * <pre>
 * Write a program that displays the temperatures from 
 * 0 degrees Celsius to 100 degrees Celsius and its Fahrenheit equivalent.
 * Note that the conversion from Celsius to Fahrenheit uses the following formula:
 * F = C * 9/5 + 32
 * </pre>
 * 
 * @author bibek<sacharya186@gmail.com>
 *
 */


public class Temperature {
	public static void main(String[] args){
		double f;
		for(int i=0; i<=100; i++){
			f= i*9/5+32;
			System.out.println("The equivalent "+i+" celcius in farhenigt is:"+ f);
			
		}
         
	}
}
