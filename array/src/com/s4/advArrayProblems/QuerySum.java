package com.s4.advArrayProblems;

//For a given array of integers of size n, answer q queries to print the sum of values in a given range of indices from l to r
public class QuerySum {

	public static void main(String[] args) {
		int[] arr= {2,1,5,3,8,4,7};
		int l=2,r=4;
		
		querySum(arr,l,r);
	}

	private static void querySum(int[] arr, int n, int r) {

		int ans[] =new int[arr.length+1];
		for (int i = 1; i < ans.length; i++) {
			ans[i]=arr[i-1];
		}
		for (int i = 1; i < ans.length; i++) {
			ans[i]+=ans[i-1];
		}
		int a=ans[r]-ans[n-1];
		System.out.println(a);
	}
}
