package com.s4.arrayProblems;

import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please let us know what would be the length of your array");
		int size = scanner.nextInt();
		System.out.println("Ohk,Please let us know the elements of your array");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}
		
		System.out.println("Is the entered array is Sorted"+" "+" "+isSorted(arr));
	}

	private static boolean isSorted(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1]>arr[i]) {
					return false;
			}
			
		}
		return true;
		
	}
}
