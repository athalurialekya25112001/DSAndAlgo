package SortingAlgos;

import java.util.Scanner;

public class SelectionSort {
	private static void selectionsort(int[] numbers, int n) {
		int temp,f=0;
		for(int j=0;j<n-1;j++)
		{
			int min =numbers[j];
			for(int i=j+1;i<n;i++)
			{
				if(min>numbers[i])
				{
					min=numbers[i];
					f=i;
				}
			}
			temp=numbers[j];
			numbers[j]=min;
			numbers[f]=temp;
		}
		
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
			
			selectionsort(numbers,n);
			
			System.out.println("Sorted Elements are : ");
			for(int i=0;i<n;i++)
			{
				System.out.print(numbers[i]+" ");
			}
		}
	}
}
