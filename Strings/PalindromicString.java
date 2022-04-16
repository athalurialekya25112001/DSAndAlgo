package Strings;

import java.util.Scanner;

public class PalindromicString {
	//Write a java program to check Given String is Palindrome or NOT.
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String str= sc.nextLine();
									
			if(palindrome(str))
			{
				System.out.println("Palindromic");
			}
			else
			{
				System.out.println("Not Palindromic");
			}
		}
	}

	private static boolean palindrome(String str) {
		int len=str.length();
		for(int i=0,j=len-1;i<len/2;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
		}
		return true;
		
	}
}
