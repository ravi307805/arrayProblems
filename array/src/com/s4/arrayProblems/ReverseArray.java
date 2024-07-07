package com.s4.arrayProblems;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 7, 6, 5, 9 };
		reverseArray(arr);
	}

	private static void reverseArray(int[] arr) {
		int a[]=swapArray(arr);
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(" "+a[i]+" ");
		}
		System.out.print("]");

	}

	private static int[] swapArray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		return arr;
	}
}
