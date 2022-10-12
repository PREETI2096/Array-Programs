package com.bridgelabz.arrayprogram;

public class OddArray {

	public static void oddArray() {
		int [] arr = new int[] {26,76,87,7, 34};
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Odd numbers:");
		oddArray();
	}
		

	}
