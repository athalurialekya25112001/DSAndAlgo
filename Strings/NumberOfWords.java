package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberOfWords {
	//How do you count the Number of Words in a given String using Split method
	public static void main(String [] args)
	{		
		
		try (Scanner sc = new Scanner(System.in)) {
				String str= sc.nextLine();

				System.out.println(numberOfWords(str.trim()));
		}
	}

	private static int numberOfWords(String str) {
		/*StringTokenizer st = new StringTokenizer(str);
		int c=0;
		while(st.hasMoreTokens())
		{
			st.nextElement();
			c++;
		}*/
		
		String[] arr=str.split(" ",0);
		return arr.length;
	}
}
