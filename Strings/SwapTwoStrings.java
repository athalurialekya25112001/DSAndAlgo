package Strings;

import java.util.Scanner;

public class SwapTwoStrings {
	//How to Swap two Strings without using third (temporary) variable?
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter the first String: ");
			StringBuffer str1=  new StringBuffer(sc.nextLine());
			System.out.println("Please Enter the second String: ");
			StringBuffer str2 = new StringBuffer(sc.nextLine());
			swap(str1,str2);
		}
	}
	
	//Method to swap two strings
	private static void swap(StringBuffer str1, StringBuffer str2) {
		int len1=str1.length();
		int len2=str2.length();
		str1.append(str2);
		str2.append(str1);
		
		str1.delete(0,len1);
		str2.delete(0, len2);
		str2.delete(len1,len1+len2);
		System.out.println("First String is \n"+str1);
		System.out.println("Second String is \n"+str2);
	
	}
}
