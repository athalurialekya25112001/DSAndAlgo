package SearchingTechniques;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);		
		
		System.out.println("Please enter number of elements: ");
		int n= sc.nextInt();
		int al[]= new int[n];
		System.out.println("Please enter the list of elements: ");
		for(int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			al[i]=x;
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(al[j]>al[j+1])
				{
					int temp=al[j];
					al[j]=al[j+1];
					al[j+1]= temp;
				}
			}
		}
		System.out.println("Sorted list is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(al[i]+" ");
		}
		System.out.println("\nPlease enter the element you wanted to search: ");
		int key=sc.nextInt();
		int f=0;
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			
			int mid=low+(high-low)/2;
			
			if(al[mid]==key)
			{
				f=1;
				System.out.println("Element found at "+(mid+1)+"th position.!!!");				
				break;
			}
			else if(key<al[mid])
			{
				high=mid-1;
				
			}
			else if(al[mid]<key)
			{
				low=mid+1;
			}
		}
		if(f!=1)
			System.out.println("Element not found!!!");
	}
}
