package com.s4.arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class KthMaxKthmin {

	public static void main(String[] args) {
		int[] arr = { 23, 45, 43, 23, 12, 32 };
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int actuallength = arr.length;
		for (int i = 0; i < k; i++) {
			int result = kthMaxKthMin(arr, actuallength);
			if (i == k - 1) {
				System.out.println(arr[result]);
				return;
			}
			int temp = arr[result];
			arr[result] = arr[actuallength - 1];
			arr[actuallength - 1] = temp;

			actuallength--;
		}
	}

	private static int kthMaxKthMin(int[] arr, int actuallength) {
		int maxIndex = 0;
		for (int i = 1; i < actuallength; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
