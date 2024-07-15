package com.s4.advArrayProblems;

import java.util.Iterator;

public class PrefixSum {

	public static void main(String[] args) {
		int[] arr= {2,3,4,1,5,2,7};
		prefixSum(arr);
	}

	private static void prefixSum(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			arr[i]+=arr[i-1];
			
		}for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
