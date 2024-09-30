package com.s4.arrayProblems;

import java.util.Iterator;

public class LargestElement {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 0 };
		largestElement(arr);
	}

	private static void largestElement(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
