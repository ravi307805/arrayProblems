package com.s4.arrayProblems;

import java.util.Scanner;

public class SearchInArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please let us know what would be the length of your array");
		int size=scanner.nextInt();
		System.out.println("Ohk,Please let us know the elements of your array");
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		System.out.println("Which element you need to search");
		int find=scanner.nextInt();
		if (searchElement(find,arr)==-1) {
			System.out.println("Not found");
		}else
		System.out.println("Element"+" "+find+" "+"in the array is present at index"+ " "+searchElement(find,arr));
	}

	private static int searchElement(int find, int[] array) {
		// TODO Auto-generated method stub
		int index;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==find) {
				return i;
			}
		}
		return -1;
	}
}
