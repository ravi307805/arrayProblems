package com.s4.advArrayProblems;

//Program to check if an array can be partitioned into sub-arrays with equal sum
public class EqualSumOfSubArray {

	public static void main(String[] args) {
		int[] arr=new int[] {2,4,3,6,5,4,8,7,9,1};
		equalSumOfSubArray(arr);
	}

	private static void equalSumOfSubArray(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			arr[i]+=arr[i-1];
		}
		
		int i=0;
		while (i<arr.length-1) {
			
		if (arr[i]==arr[arr.length-1]-arr[i]) {
			System.out.println("true");
			return;
		}i++;
		}System.out.println("false");
	}
}
