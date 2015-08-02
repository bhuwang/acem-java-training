package com.bhuwan.java.training.madan;

/**
 *DivisibleBySeven.java
 *
 *
 *
 *Aug 2, 2015 11:34:36 AM
 * @author madandhungana@gmail.com
 *
 *
 */
public class DivisibleBySeven {
	
	public static void main(String []args){
		
		int i;
		int result;
		
		System.out.println("The numbers divisibe by 7 between 100 and 200 are:");
		
		for(i=100;i<108;i++){
			/* finds first number divisible by seven*/
			if(i%7==0){
				break;
			}
			
		}
		result=i;							// store first number in result
		while(i<=200){
			
			System.out.println(i);
			i=i+7;
			result=result+i;				// add all other numbers divisible by 7
		}
		result=result-i;					//subtracting last incremented number to find actual result 
		
		System.out.println("Total sum of these number is: "+result);
	}
	
	

}
