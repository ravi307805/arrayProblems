package com.s4.recursionProblems;

public class NthFibonacci {

	public static void main(String[] args) {
		int n=8;
		int result=nthFibonacci(n);
		System.out.println(result);
	}

	private static int nthFibonacci(int n) {
		//base case
		if (n==1) {
			return 0;
		}if (1<n&&n<=3) {
			return 1;
		}
		//recursion logic
		int res=nthFibonacci(n-1)+nthFibonacci(n-2);
		return res;
	}
}
