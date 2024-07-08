package com.s4.arrayProblems;

public class MinMaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {  4,11, 6, 9, 18 };
		int[] result=minMaxArray(arr);
		System.out.println("Minimum: "+result[0]+" Maximum: "+result[1]);

	}

	private static int[] minMaxArray(int[] arr) {
		// TODO Auto-generated method stub
		int min = arr[0];
		int max= arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]< min) {
				min=arr[i];
			}
			if (arr[i]> max) {
				max=arr[i];
			}

		}
		return new int[] {min, max};
		
	}
}
	
