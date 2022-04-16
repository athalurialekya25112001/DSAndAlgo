package SortingAlgos;

import java.util.Scanner;

public class InsertionSort {
	//Sort Function
	private static void insertionsort(int[] numbers, int n) {
		for(int i=1;i<n;i++)
		{
			int temp=numbers[i],j=i-1;
			for(  ;j>=0 && numbers[j]>temp;   )
			{
				numbers[j+1]=numbers[j];
				j--;
			}
			numbers[j+1]=temp;
		}
		
	}
	public static void main(String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Please enter number of elements to sort : ");
			//Number of elements 
			int n= sc.nextInt();
			//Elements
			int numbers[]= new int[n];
			System.out.println("Please enter the list of elements: ");
			for(int i=0;i<n;i++)
			{
				int x=sc.nextInt();
				numbers[i]=x;
			}
			//calling sort function
			insertionsort(numbers,n);
			
			System.out.println("Sorted Elements are : ");
			//Unordered Elements
			for(int i=0;i<n;i++)
			{
				System.out.print(numbers[i]+" ");
			}
		}
	}
}
