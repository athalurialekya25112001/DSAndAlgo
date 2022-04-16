package SortingAlgos;

import java.util.Scanner;

public class MergeSort {
	private static void mergesort(int[] numbers, int n) {

		if (n <= 1)
			return;

		int m = n / 2;
		int leftsubarray[] = new int[m];
		int rightsubarray[] = new int[n-m];

		int j = 0;
		for (int i = 0; i < n; i++) {
			if (i < m)
				leftsubarray[i] = numbers[i];
			else {
				rightsubarray[j] = numbers[i];
				j++;
			}
		}
		mergesort(leftsubarray, m);
		mergesort(rightsubarray, n - m);

		merge(leftsubarray, rightsubarray, numbers);
	}

	private static void merge(int[] leftsubarray, int[] rightsubarray, int numbers[]) {
		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		int i=0,l = 0, r = 0;
		for ( ; i < numbers.length&& l<leftsubarray.length && r<rightsubarray.length;i++) {
			if (leftsubarray[l] <= rightsubarray[r]) {
				numbers[i] = leftsubarray[l];
				l++;
				
			} 
			else {
				numbers[i] = rightsubarray[r];
				r++;
			}
		}
		while(l<leftsubarray.length)
		{
			numbers[i]=leftsubarray[l];
			i++;
			l++;
		}
		while(r<rightsubarray.length)
		{
			numbers[i]=rightsubarray[r];
			i++;
			r++;
		}
		
	}

	public static void main(String [] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter number of elements to sort : ");
			int n = sc.nextInt();
			int numbers[] = new int[n];
			System.out.println("Please enter the list of elements: ");
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				numbers[i] = x;
			}

			mergesort(numbers, n);

			System.out.println("Sorted Elements are : ");
			for (int i = 0; i < n; i++) {

				System.out.print(numbers[i]+" ");
			}
		}
	}

}
