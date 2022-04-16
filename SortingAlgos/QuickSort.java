package SortingAlgos;

import java.util.Scanner;

public class QuickSort {
	private static void quicksort(int[] numbers, int l, int r) 
	{		
		if(l<=r) return;
		int pivot=numbers[r],temp,j=0,i=l-1;
		while(j==r)
		{
			if(numbers[j]>=pivot)
			{
				j++;
			}
			else
			{
				i++;
				temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				j++;
			}
		}
		i++;
		temp=numbers[i];
		numbers[i]=numbers[j];
		numbers[j]=temp;
		
		quicksort(numbers,l,i-1);
		quicksort(numbers,i+1,r);
		
	}
	public static void main()
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter number of elements to sort : ");
			int n= sc.nextInt();
			int numbers[]= new int[n];
			System.out.println("Please enter the list of elements: ");
			for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
				numbers[i]=x;
			}
			
			quicksort(numbers,0,n-1);
			
			System.out.println("Sorted Elements are : ");
			for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
				numbers[i]=x;
			}
		}
	}


	
}
