package com.s4.arrayProblems;

import java.util.Scanner;

public class MaxOfArray {
	public static int arrayMax(int[] arr) {
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
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
