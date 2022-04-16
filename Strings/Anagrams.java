package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
	//Write a Java Program to check two strings are Anagram to each other or NOT
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String str1= sc.nextLine();
			String str2=sc.nextLine();
			if(anagrams(str1.trim(),str2.trim()))
			{
				System.out.println("They are anagrams.");
			}
			else
			{
				System.out.println("They are not anagrams.");
			}
		}
	}

	private static boolean anagrams(String str1, String str2) {
		
		
		Map<Object,Integer> mp1=convertToMap(str1);
		Map<Object,Integer> mp2= convertToMap(str2);
		
		//System.out.println(mp1);
		//System.out.println(mp2);
		
		boolean b= mp1.equals(mp2);
		
		return b;
	}

	private static Map<Object, Integer> convertToMap(String str) {
		Map<Object,Integer> mp = new HashMap<Object,Integer>();
		for(int i=0;i<str.length();i++)
		{
			
			if(mp.containsKey(str.charAt(i)))
			{
				int x=mp.get(str.charAt(i));
				mp.replace(str.charAt(i),x,x+1);
			}
			else
			{
				mp.put(str.charAt(i), 1);
			}
		}
		return mp;
	}
}


