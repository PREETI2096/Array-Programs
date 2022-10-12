package com.bridgelabz.arrayprogram;

public class SmallestElementArray {

		public static void smallestArray(int [] arr , int min) {
			for(int i = 0;i < arr.length;i++) {
				if(arr[i] < min)
					min = arr[i];
			}
			System.out.println("Smallest element in given array:" +min);
		}


		public static void main(String[] args) {
			int []arr = new int[] {26,76,87,7, 34};
			int min = arr[0];
			smallestArray(arr, min);
		}
			
}
