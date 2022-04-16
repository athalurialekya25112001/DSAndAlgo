package Strings;

import java.util.Scanner;

public class RotationOfOtherString {
	//Check Given String is Rotation of Another String. 
	public static void main(String [] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String str1= sc.nextLine();
			String str2=sc.nextLine();
			if(str1==null)
				System.out.println("It is null");
			if(rotateOfString(str1.trim(),str2.trim()))
			{
				System.out.println("It is rotation of other string");
			}
			else
			{
				System.out.println("It is not the rotation of other string");
			}
		}
	}

	private static boolean rotateOfString(String str1,String str2) {
		if(str1.length()!=str2.length())
			return false;
		str1=str1+str1;
		if(str1.contains(str2))
			return true;
		return false;
	}
}
