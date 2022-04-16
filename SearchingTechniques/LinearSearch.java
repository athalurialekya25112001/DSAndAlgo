package SearchingTechniques;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		ArrayList<Object> al = new ArrayList<Object>();
		System.out.println("Please enter number of elements: ");
		int n= sc.nextInt();
		System.out.println("Please enter the list of elements: ");
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			al.add(x);
		}
		
		System.out.println("Please enter the element you wanted to search: ");
		Object key=sc.nextInt();
		int f=0;
		for(int i=0;i<n;i++)
		{		
			if(key==al.get(i))
			{
				f=1;
				System.out.println("Element found at "+(i+1)+"th position!!!!");
				break;
			}
		}
		if(f!=1)
			System.out.println("Element not found!!!!");
	}
}
