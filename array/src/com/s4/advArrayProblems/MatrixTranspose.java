package com.s4.advArrayProblems;

public class MatrixTranspose {
	public static void main(String[] args) {
		int[][] arr= {{2,3},{5,6}};
		matrixTranspose(arr);
		printMatrix(arr);
		
	}

	private static void printMatrix(int[][] arr) {
		for (int[] is : arr) {
			for (int i = 0; i < arr.length; i++) {
				
				System.out.print(is[i]);
			}System.out.println();
		}
	}

	private static void matrixTranspose(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				swap(arr,i,j);
			}
		}return;
	}

	private static void swap(int[][] arr, int i, int j) {
		arr[i][j]=arr[i][j]+arr[j][i];
		arr[j][i]=arr[i][j]-arr[j][i];
		arr[i][j]=arr[i][j]-arr[j][i];
		return;
	}

}
