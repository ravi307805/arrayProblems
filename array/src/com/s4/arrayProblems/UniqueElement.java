package com.s4.arrayProblems;

import java.util.Iterator;

public class UniqueElement {

	public static void main(String[] args) {
		int arr[]= {3,4,6,2,1,1,4};
		int count=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					arr[i]=-1;
					arr[j]=-1;
					break;
				}
			}if (count==1 && arr[i]!=-1) {
				System.out.println(arr[i]);
			}else
				count=1;
		}
	}
}
