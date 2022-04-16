package Strings;

import java.util.Scanner;

public class CombinationOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scanner.nextLine().trim();
		System.out.println("All Combinations are :: ");
		combination("", s,0);
		scanner.close();
	}
	
	public static void combination(String c,String s,int curIndex){
		for(int i=curIndex;i<s.length();i++){
			System.out.println(c+s.charAt(i));
			combination(c+s.charAt(i), s, i+1);
		}
	}
}