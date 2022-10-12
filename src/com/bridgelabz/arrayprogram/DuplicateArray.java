package com.bridgelabz.arrayprogram;

import java.util.Arrays;

public class DuplicateArray {

	public static void main(String[] args) {
		int []array = {1,5,6,8,6,4,6,5};
		Arrays.sort(array);
		int result[] = new int [array.length];
		System.out.println("Duplicate elements in given array are:");
		
		for(int i = 0; i <array.length;i++) {
			for (int j=i+1; j< array.length;j++) {
			if(array[i] == array[j]) {
				System.out.println(array[j]);
			}
			}
		}
	}
}
		
