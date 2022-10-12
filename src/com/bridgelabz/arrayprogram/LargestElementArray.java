package com.bridgelabz.arrayprogram;

public class LargestElementArray {
	public static void largestArray(int [] arr , int max) {
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element in given array:" +max);
	}


	public static void main(String[] args) {
		int []arr = new int[] {26,76,87,7, 34};
		int max = arr[0];
		largestArray(arr, max);
	}
		
}
