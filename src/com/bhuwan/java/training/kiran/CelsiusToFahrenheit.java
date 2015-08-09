package com.bhuwan.java.training.kiran;

/**
 *<pre>
 * Write a program that displays the temperatures from 0 degrees Celsius
 * to 100 degrees Celsius and its Fahrenheit equivalent. Note that the 
 * conversion from Celsius to Fahrenheit uses the following formula: 
 * F = C * 9/5 + 32
 * </pre>
 * 
 * @author kiran
 *
 */

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		int celsius;
		float fahrenheit;
		
		System.out.println("Celsius\t\tFahrenheit");
		for(celsius = 0; celsius < 100; celsius++){
			fahrenheit = celsius * 9/5 + 32; 
			System.out.println(celsius + "\t\t" + fahrenheit);
		}	
	}
}
