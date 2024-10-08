package com.s4.arrayProblems;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {3,4,16,227,29,22,20};
		secondLargest(arr);
	}
	//Second Largest Element in an Array without sorting
	private static void secondLargest(int[] arr) {
		int largest=arr[0];
		int secondLargest=arr[1];
 		for (int i = 1; i < arr.length; i++) {
			if (largest<arr[i]) {
				secondLargest=largest;
				largest=arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println(secondLargest);
	}
}
