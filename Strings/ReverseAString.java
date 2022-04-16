package Strings;

import java.util.Scanner;

public class ReverseAString {
	//Write a java program to Reverse a String without using in-build function.
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			StringBuffer str= new StringBuffer(sc.nextLine());
			int len= str.length();
			
			StringBuffer str1= new StringBuffer();
			
			for(int i=len-1;i>=0;i--)
			{
				str1.append(str.charAt(i));
			}
			
			System.out.println(str1);
		}
	}
}
