package com.s4.arrayProblems;

public class KthRotation {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 5, 4, 7, 8, 6 };
		int k = 201;
		kthRotation(arr, k);
	}

	private static void kthRotation(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		reverseArray(arr, n - k, n - 1);
		reverseArray(arr, 0, n - k - 1);
		reverseArray(arr, 0, n - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	private static int[] reverseArray(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		return arr;
	}
}
