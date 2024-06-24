package com.s4.arrayProblems;

import java.util.Scanner;

public class LastOccurrence {
	public static int lastOccurrence(int x , int[] arr) {
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==x) {
				index=i;
				continue;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please let us know what would be the length of your array");
		int size = scanner.nextInt();
		System.out.println("Ohk,Please let us know the elements of your array");
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();

		}
		System.out.println("Which element count need to be done");
		int element=scanner.nextInt();
		
		System.out.println("Last occurrence of"+" "+element+" "+"is"+" "+lastOccurrence(element,arr));
	
	}
}
