package com.bhuwan.java.training.madan;

/**
 * <pre>
 *Temperature.java
 *
 *program that displays the temperatures from 0 degrees Celsius
 * to 100 degrees Celsius and its Fahrenheit equivalent
 *conversion from Celsius to Fahrenheit:-  F = C * 9/5 + 32
 *
 *Aug 1, 2015 8:57:07 PM
 * @author madandhungana@gmail.com
 *
 *</pre>
 */
public class Temperature {
	
	public static void main(String []args){
	
		int i;
		float fahrenheit;
//		final String DEG="\u2103";
//		final String FAHR="\u2109";
		
		System.out.println("-------------------------------------");
		System.out.println("Celsius \t\t Fahrenheit ");
		System.out.println("-------------------------------------");
		
		for(i=0;i<=100;i++){
			
			fahrenheit=(float)i*9/5+32;
			System.out.println("   "+i+"\t\t\t    "+fahrenheit);
			
			
		}
		
	}
	
	
}
