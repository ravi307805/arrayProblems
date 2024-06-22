package com.s4.arrayProblems;

import java.util.Scanner;

public class MaxElement {

	public static int arrayMax(int[] arr) {
		int max = arr[1];
		int i = 0;
		int j = 1;
		while (j < arr.length) {
			if (arr[i] < arr[j]) 
				max = arr[j];
				else
					max=arr[i];
				i = j;
				j++;
			
		}

		return max;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		System.out.println("Maximum of the given array"+ " "+arrayMax(arr));
	}
}
