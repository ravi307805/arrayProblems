package com.s4.arrayProblems;

import java.util.Iterator;
import java.util.Scanner;

public class ElementsSum {
	public static int arraySum(int[] arr) {
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		System.out.println("sum of the given array"+ " "+arraySum(arr));
		
	}
}
