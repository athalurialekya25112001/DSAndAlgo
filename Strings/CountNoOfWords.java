package Strings;

import java.util.Scanner;

public class CountNoOfWords {
	//Write a java program to Count the Number of Words in a given String.
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String str= sc.nextLine();

			System.out.println(countwords(str.trim()));
		}
	}

	private static int countwords(String str) {
		
		
		int len=str.length(),c=1;
		if(len==0) return 0;
		for(int i=0;i<len;i++)
		{	
			if(str.charAt(i)==' ' || str.charAt(i)=='\t' || str.charAt(i)==('/') || str.charAt(i)==('&'))
			{
				c++;
				
				while(str.charAt(i)==' ' || str.charAt(i)=='\t')
				{
					i++;
				}
			}
			
		}		
		return c;	
	}
}
