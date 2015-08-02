package com.bhuwan.java.training.madan;

import java.util.Scanner;

/**
 * <pre>
 *Palindrome.java
 *
 *an application that reads in a five-digit integer and determines whether it is a palindrome.
 *If the number is not five digits long, display an error message and
 *allow the user to enter a new value.
 *
 *Aug 2, 2015 7:36:16 AM
 * @author madandhungana@gmail.com
 *
 *</pre>
 */
public class Palindrome {

	public static void main(String []args){
		
		int num;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a 5-digit number...");
		num=input.nextInt();
		
		while(!(num/10000>=1&&num/100000<1)){
		
				System.out.println("Error!!!!!!   Entered number is not 5-digit number");
				System.out.println("Enter a 5-digit number...");
				num=input.nextInt();
			}
		 Palindrome p=new Palindrome();
		 p.pal(num);
		input.close();		
		
	}
	
	public void pal(int num){
		
		int[] temp=new int[5];
		int actnum=num;
		
		for(int i=0;i<5;i++){
					
					temp[i]= num%10;
					num=num/10;
		}
		
		if(temp[0]==temp[4]&&temp[1]==temp[3]){
			
			System.out.println("Number "+actnum+" is palindrome.");
		}
		else{
			System.out.println("Given number"+actnum+" is not palindrome.");
		}
		
		
	}
	
	
}
