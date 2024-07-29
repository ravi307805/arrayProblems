package com.s4.recursionProblems;

public class Factorial {

	public static void main(String[] args) {
		int n=5;
		System.out.println(factorial(n));
	}

	 static int factorial(int n) {
		if (n==0) return 1;
		return factorial(n-1)*n;
	}
}
