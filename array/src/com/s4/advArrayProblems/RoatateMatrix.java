package com.s4.advArrayProblems;

//Rotate a matrix 90 degrees clockwise
public class RoatateMatrix {

	public static void main(String[] args) {
		int[][] arr= {{2,3,7,5},{5,6,9,0},{2,6,3,7},{3,4,5,6}};
		rotateMatrix(arr);
		printMatrix(arr);
	}

	private static void rotateMatrix(int[][] arr) {
		matrixTranspose(arr);
		revereseMatrix(arr);
	}
	private static void revereseMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <arr[i].length/2; j++) {
				
			int temp =arr[i][j];
			arr[i][j]=arr[i][arr[i].length-1-j];
			arr[i][arr[i].length-1-j]=temp;
		}
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

	private static void printMatrix(int[][] arr) {
		for (int[] is : arr) {
			for (int i = 0; i < arr.length; i++) {
				
				System.out.print(is[i]);
			}System.out.println();
		}
	}
}
