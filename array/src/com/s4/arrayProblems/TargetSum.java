package com.s4.arrayProblems;

public class TargetSum {

	public static int targetSum(int [] arr,int target) {
		int count=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int k = i+1; k < arr.length; k++) {
				
				if (target-arr[i]==arr[k]) {
						count++;
				}
				
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr= {3,4,5,6,2,7};
		int result=targetSum(arr,7);
		System.out.println(result);
		
	}
}
