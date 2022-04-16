package Strings;

import java.util.Scanner;

public class CountVowels {
	//Write a java program to Count the Number of Vowels in the given string
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String str= sc.nextLine();

			System.out.println(countvowels(str.trim()));
		}
	}

	private static int countvowels(String str) {
		int c=0;
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				c++;
		}
				
		return c;
	}
}
