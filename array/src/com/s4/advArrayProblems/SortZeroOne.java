package com.s4.advArrayProblems;

public class SortZeroOne {
	int left=0;
	public static void main(String[] args) {
	
		int[] arr= {0,1,1,1,1,1,0,0,1,0,1};
		sortZeroOne(arr);
	}
	private static void sortZeroOne(int[] arr) {

		int left=0;
		int right=arr.length-1;
		while (left<right) {
			if (arr[left]==1&& arr[right]==0) {
				swap(arr, left,right);
				
			}
			if (arr[left]==0) {
				left++;
			}
			if (arr[right]==1) {
				right--;
			}
		}for (int j = 0; j < arr.length; j++) {
		System.out.println(arr[j]);
		}	
	}
	private static void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
