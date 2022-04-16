package SortingAlgos;

import java.util.Scanner;

public class BubbleSort {
	private static void bubblesort(int[] numbers, int n) {
		if(n==1)
			return;
		for(int i=0;i<n-1;i++)
		{
			if(numbers[i]>numbers[i+1])
			{
				int temp=numbers[i+1];
				numbers[i+1]=numbers[i];
				numbers[i]=temp;
			}
		}
		bubblesort(numbers,n-1);
		
	}
	public static void main(String [] args) {
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
			
			bubblesort(numbers,n);
			
			System.out.println("Sorted Elements are : ");
			for(int i=0;i<n;i++)
			{
				System.out.print(numbers[i]+" ");
			}
		}
	}

	
}
