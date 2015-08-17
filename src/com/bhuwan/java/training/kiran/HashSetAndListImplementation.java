package com.bhuwan.java.training.kiran;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetAndListImplementation{
	
	public static void main(String[] args){
		
		List<String> list = new ArrayList<String>();
		list.add("kiran");
		list.add("madan");
		list.add("laxman");
		list.add("bishal");
		list.add("madan");
		list.add("bishal");
			
		Set<String> set = new HashSet<String>();
		Set<String> dublicateSet = new HashSet<String>();
		
		for(String s : list){
			if(!set.add(s)){
				dublicateSet.add(s);
			}
		}
		
		System.out.println("dublicate words :");
		for(String s : dublicateSet){
			System.out.println(s);
		}
		
		System.out.println("number of distinct word : " + set.size());
		
		System.out.println("list of words with dublicate eliminated :");
		for(String s: set){
			System.out.println(s);
		}
	}
}