package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostRepeatedCharacter {
	// Write a Java program to find the Most Repeated Character in the Given String
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println(mostRepeatedChar(str));

		}
	}

	private static Object mostRepeatedChar(String str) {

		Map<Object, Integer> mp = convertToMap(str);
		
		int max=0;
		Object ch=null;
		for(Map.Entry<Object,Integer> me: mp.entrySet())
		{
			int value=me.getValue();
			if(value>max)
			{
				max=value;
				ch = me.getKey();
			}
		}
		
		return ch;
	}

	private static Map<Object, Integer> convertToMap(String str) {
		Map<Object, Integer> mp = new HashMap<Object, Integer>();
		for (int i = 0; i < str.length(); i++) {

			if (mp.containsKey(str.charAt(i))) {
				int x = mp.get(str.charAt(i));
				mp.replace(str.charAt(i), x, x + 1);
			} else {
				mp.put(str.charAt(i), 1);
			}
		}
		return mp;
	}
}
