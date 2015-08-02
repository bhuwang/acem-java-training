package com.bhuwan.java.training.laxman;

/**
 * * <pre>
 *Write a program that displays the temperatures from 0 degrees Celsius to 100 degrees
 * Celsius and its Fahrenheit equivalent.Note that the conversion from Celsius
 *  to Fahrenheit uses the following formula: F = C * 9/5 + 32
 *</pre>
 * @author laxman <lkhanal56@gmail.com>
 */

public class TempConversion {
	public static void main(String[] args) {
		double farenTemp;
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			farenTemp=(double)i*9/5+32;
			System.out.println("Temperature in celcius:\t"+i+"\t Equivalent in Fahrenheit:\t"+farenTemp);
		}

	}

}
